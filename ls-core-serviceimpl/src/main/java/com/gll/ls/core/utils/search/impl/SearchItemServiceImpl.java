package com.gll.ls.core.utils.search.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

import com.gll.ls.core.pojo.utils.search.vo.SearchItem;
import com.gll.ls.core.pojo.utils.search.vo.SearchItemQueryVo;
import com.gll.ls.core.utils.search.SearchItemService;
import com.gll.ls.page.Pagination;

/**
 * 索引库 实现类
 * importAllItemImpl.java
 * 
 * @author xxlsg
 * @Date 2017年6月7日 下午9:15:41
 * @Version 1.0
 */
public class SearchItemServiceImpl implements SearchItemService {

	@Resource
	private SolrServer solrServer;

	/**
	 * 导入到数据库
	 * 
	 * @throws IOException
	 * @throws SolrServerException
	 */
	@Override
	public Integer importAllItem() throws SolrServerException, IOException {
		Integer count = 0;
		// // 查询商品列表
		// List<CiItemCustom> itemList = ciItemService.getItemListWithSolr();
		// // 便利商品列表
		// for (CiItemCustom cic : itemList) {
		// // 创建文档对象
		// SolrInputDocument document = new SolrInputDocument();
		// // 向文档对象中添加域
		// document.addField("id", cic.getItemId());
		// document.addField("item_title", cic.getItemName());
		// document.addField("item_sell_point", cic.getItemDescription());
		// // document.addField("item_price", value);
		// document.addField("item_image", cic.getDefImg().getAllUrl());
		// document.addField("item_category_name", cic.getCiTypeCustom().getTypeName());
		// // 把文档对象写入索引库
		// solrServer.add(document);
		// count++;
		// }
		//
		// // 提交
		// solrServer.commit();
		// 返回成功
		return count;
	}

	/**
	 * 根据查询条件查询索引库
	 * 
	 * @param sysRoleQueryVo
	 * @return
	 * @throws SolrServerException
	 */
	public Pagination<SearchItem> getSearchItemPage(SearchItemQueryVo searchItemQueryVo) throws SolrServerException {

		SearchItem searchItem = searchItemQueryVo.getSearchItem();

		// 根据查询条件查询
		// 创建 一个SolrQuery 对象
		SolrQuery query = new SolrQuery();
		// 设置查询条件
		query.setQuery(searchItem.getTitle());
		// 设置分页
		query.setStart(searchItemQueryVo.getStartRow());// 起始记录
		query.setRows(searchItemQueryVo.getPageSize());// 每页数
		// 默认搜索域
		query.set("df", "item_title");
		// 设置高亮显示
		query.setHighlight(true);// 启用高亮
		query.addHighlightField("item_title");// 设置高亮显示的字段

		query.setHighlightSimplePre("</em style='color:red'>");// 设置高亮显示的前缀
		query.setHighlightSimplePost("</em>");// 设置高亮标签 后缀

		// 执行查询，QueryRespose对象
		QueryResponse queryResponse = solrServer.query(query);

		// 取 文档列表。
		SolrDocumentList results = queryResponse.getResults();
		// 查询 结果的总记录数
		long totalCount = results.getNumFound();
		Pagination<SearchItem> pagination = new Pagination<SearchItem>(searchItemQueryVo.getPageNo(), searchItemQueryVo.getPageSize(), Integer.parseInt(totalCount + ""));
		// si list
		List<SearchItem> si_list = new ArrayList<SearchItem>();

		// 高亮结果
		Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
		// 遍历文档列表 去除域中的值。
		for (SolrDocument sd : results) {
			// 创建 结果集
			SearchItem item = new SearchItem();
			// 封装结果集
			item.setId((String) sd.get("id"));
			item.setCategory_name((String) sd.get("item_category_name"));
			item.setImage((String) sd.get("item_image"));
			item.setPrice(Long.parseLong((String) sd.get("item_price")));
			item.setSell_point((String) sd.get("item_sell_point"));

			// 取高亮结果
			List<String> list = highlighting.get(sd.get("id")).get("item_title");

			if (list != null && list.size() > 0) {
				String str = list.get(0);
				item.setTitle(str);
			} else {
				item.setTitle((String) sd.get("item_title"));
			}
			si_list.add(item);
		}

		// 添加到返回结果集
		pagination.setList(si_list);

		return pagination;
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
