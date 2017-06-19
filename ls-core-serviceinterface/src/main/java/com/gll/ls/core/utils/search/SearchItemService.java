package com.gll.ls.core.utils.search;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;

import com.gll.ls.core.pojo.utils.search.vo.SearchItem;
import com.gll.ls.core.pojo.utils.search.vo.SearchItemQueryVo;
import com.gll.ls.page.Pagination;

/**
 * solr 索引库维护类
 * SearchItemService.java
 * 
 * @author xxlsg
 * @Date 2017年6月7日 下午9:13:15
 * @Version 1.0
 */
public interface SearchItemService {

	/**
	 * 商品 导入到 索引库
	 * 
	 * @throws IOException
	 * @throws SolrServerException
	 */
	public Integer importAllItem() throws Exception;

	/**
	 * 商品搜索
	 * 
	 * @param searchItemQueryVo
	 * @return
	 * @throws SolrServerException
	 */
	public Pagination<SearchItem> getSearchItemPage(SearchItemQueryVo searchItemQueryVo) throws SolrServerException;
}
