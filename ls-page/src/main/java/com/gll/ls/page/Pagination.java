package com.gll.ls.page;

import java.util.ArrayList;
import java.util.List;

/**
 * 页面展示
 * 
 * @author XL
 * @param <T>
 * @Date 2017年4月9日 下午4:33:15
 */
public class Pagination<T> extends SimplePage {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8879003532408337073L;

	private List<T> list;
	private List<String> pageView;

	public Pagination() {
	}

	public Pagination(int pageNo, int pageSize, int totalCount) {
		super(pageNo, pageSize, totalCount);
	}

	public Pagination(int pageNo, int pageSize, int totalCount, List<T> list) {
		super(pageNo, pageSize, totalCount);
		this.list = list;
	}

	public int getFirstResult() {
		return (pageNo - 1) * pageSize;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public List<String> getPageView() {
		return pageView;
	}

	public void setPageView(List<String> pageView) {
		this.pageView = pageView;
	}

	public void pageView(String url, String params) {
		pageView = new ArrayList<String>();
		if (pageNo != 1) {
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=1'\"><font size=2>首页</font></a>").toString());
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(pageNo - 1).append("'\"><font size=2>上一页</font></a>").toString());
		} else {
			pageView.add("<font size=2>首页</font>");
			pageView.add("<font size=2>上一页</font>");
		}
		if (getTotalPage() <= 10) {
			for (int i = 0; i < getTotalPage(); i++) {
				if (i + 1 == pageNo) {
					pageView.add((new StringBuilder("<strong><font color=\"red\">&nbsp;&nbsp;")).append(pageNo)
							.append("&nbsp;&nbsp;</font></strong>").toString());
					i++;
					if (pageNo == getTotalPage())
						break;
				}
				pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
						.append("?").append(params).append("&pageNo=").append(i + 1).append("'\">").append(i + 1).append("</a>")
						.toString());
			}

		} else if (getTotalPage() <= 20) {
			int l = 0;
			int r = 0;
			if (pageNo < 5) {
				l = pageNo - 1;
				r = 10 - l - 1;
			} else if (getTotalPage() - pageNo < 5) {
				r = getTotalPage() - pageNo;
				l = 9 - r;
			} else {
				l = 4;
				r = 5;
			}
			int tmp = pageNo - l;
			for (int i = tmp; i < tmp + 10; i++) {
				if (i == pageNo) {
					pageView.add((new StringBuilder("<strong><font color=\"red\">&nbsp;&nbsp;")).append(pageNo)
							.append("&nbsp;&nbsp;</font></strong>").toString());
					i++;
					if (pageNo == getTotalPage())
						break;
				}
				pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
						.append("?").append(params).append("&pageNo=").append(i).append("'\">").append(i).append("</a>").toString());
			}

		} else if (pageNo < 7) {
			for (int i = 0; i < 8; i++) {
				if (i + 1 == pageNo) {
					pageView.add((new StringBuilder("<strong><font color=\"red\">&nbsp;&nbsp;")).append(pageNo)
							.append("&nbsp;&nbsp;</font></strong>").toString());
					i++;
				}
				pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
						.append("?").append(params).append("&pageNo=").append(i + 1).append("'\">").append(i + 1).append("</a>")
						.toString());
			}

			pageView.add("...");
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(getTotalPage() - 1).append("'\">").append(getTotalPage() - 1)
					.append("</a>").toString());
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(getTotalPage()).append("'\">").append(getTotalPage())
					.append("</a>").toString());
		} else if (pageNo > getTotalPage() - 6) {
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(1).append("'\">").append(1).append("</a>").toString());
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(2).append("'\">").append(2).append("</a>").toString());
			pageView.add("...");
			for (int i = getTotalPage() - 8; i < getTotalPage(); i++) {
				if (i + 1 == pageNo) {
					pageView.add((new StringBuilder("<strong><font color=\"red\">&nbsp;&nbsp;")).append(pageNo)
							.append("&nbsp;&nbsp;</font></strong>").toString());
					i++;
					if (pageNo == getTotalPage())
						break;
				}
				pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
						.append("?").append(params).append("&pageNo=").append(i + 1).append("'\">").append(i + 1).append("</a>")
						.toString());
			}

		} else {
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(1).append("'\">").append(1).append("</a>").toString());
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(2).append("'\">").append(2).append("</a>").toString());
			pageView.add("...");
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(pageNo - 2).append("'\">").append(pageNo - 2).append("</a>")
					.toString());
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(pageNo - 1).append("'\">").append(pageNo - 1).append("</a>")
					.toString());
			pageView.add((new StringBuilder("<strong>")).append(pageNo).append("</strong>").toString());
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(pageNo + 1).append("'\">").append(pageNo + 1).append("</a>")
					.toString());
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(pageNo + 2).append("'\">").append(pageNo + 2).append("</a>")
					.toString());
			pageView.add("...");
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(getTotalPage() - 1).append("'\">").append(getTotalPage() - 1)
					.append("</a>").toString());
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(getTotalPage()).append("'\">").append(getTotalPage())
					.append("</a>").toString());
		}
		if (pageNo != getTotalPage()) {
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(pageNo + 1).append("'\"><font size=2>下一页</font></a>").toString());
			pageView.add((new StringBuilder("<a href=\"javascript:void(0);\" onclick=\"javascript:window.location.href='")).append(url)
					.append("?").append(params).append("&pageNo=").append(getTotalPage()).append("'\"><font size=2>尾页</font></a>")
					.toString());
		} else {
			pageView.add("<font size=2>下一页</font>");
			pageView.add("<font size=2>尾页</font>");
		}
		pageView.add((new StringBuilder("共<var>")).append(getTotalPage())
				.append("</var>页&nbsp;&nbsp;&nbsp;到第&nbsp;<input type='text' id='PAGENO'  size='3' />&nbsp;&nbsp;页&nbsp;&nbsp; <input type='button' id='skip' class='hand btn60x20' value='确定' onclick=\"javascript:window.location.href = '")
				.append(url).append("?").append(params).append("&pageNo=' + $('#PAGENO').val() \"/>").toString());
	}
}
