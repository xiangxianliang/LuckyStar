package com.gll.ls.web.controller.serach;

import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gll.ls.core.pojo.utils.search.vo.SearchItem;
import com.gll.ls.core.pojo.utils.search.vo.SearchItemQueryVo;
import com.gll.ls.core.utils.search.SearchItemService;
import com.gll.ls.page.Pagination;
import com.gll.ls.utils.context.Config;
import com.gll.ls.utils.web.result.ResultUtil;
import com.gll.ls.utils.web.result.SubmitResultInfo;

/**
 * 后台管理
 * 
 * @author lx
 *
 */
@Controller
@RequestMapping("/serach/solr")
public class SerachController {

	public static final String B_PATH = "/serach/solr";

	@Autowired
	private SearchItemService searchItemService;

	/**
	 * 跳转 到 添加索引页面
	 */
	@RequestMapping(value = "/toList.do")
	public String toList() {
		return B_PATH + "/list";
	}

	/**
	 * 添加索引
	 * 
	 * @throws Exception
	 */
	@RequestMapping(value = "/importSolr.do")
	public @ResponseBody SubmitResultInfo importSolr() throws Exception {

		Integer i = searchItemService.importAllItem();
		// 返回数据
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.BACK_MESSAGE, 907, new Object[] { i, 0 }));
	}

	/**
	 * 跳转 到 测试搜索页面
	 */
	@RequestMapping(value = "/toQuery.do")
	public String toQuery() {
		return B_PATH + "/query";
	}

	/**
	 * 搜索
	 * 
	 * @throws SolrServerException
	 */
	@RequestMapping(value = "/search.do")
	public @ResponseBody Pagination<SearchItem> search(String keyword, int page, int rows) throws SolrServerException {
		SearchItemQueryVo searchItemQueryVo = new SearchItemQueryVo();

		searchItemQueryVo.setPageNo(Pagination.cpn(page));
		searchItemQueryVo.setPageSize(rows);

		Pagination<SearchItem> searchItemPage = searchItemService.getSearchItemPage(searchItemQueryVo);
		return searchItemPage;

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
