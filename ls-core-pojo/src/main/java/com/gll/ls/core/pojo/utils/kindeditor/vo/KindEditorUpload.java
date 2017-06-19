package com.gll.ls.core.pojo.utils.kindeditor.vo;

import java.io.Serializable;

/**
 * KindEditor 编辑器上传文件返回类
 * KindEditorUpload.java
 * 
 * @author XL
 * @Date 2017年5月30日 上午11:06:31
 * @Version 1.0
 */
public class KindEditorUpload implements Serializable {

	/**
	 * serialVersionUID = 1L;
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 成功时:0;失败时:1
	 */
	private Integer error;
	/**
	 * 例子:"http://www.example.com/path/to/file.ext"
	 */
	private String url;
	/**
	 * "错误信息"
	 */
	private String message;
	/**
	 * 数据库url
	 */
	private String path;

	/**
	 * @return error
	 */
	public Integer getError() {
		return error;
	}

	/**
	 * @param error
	 *            要设置的 error
	 */
	public void setError(Integer error) {
		this.error = error;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            要设置的 url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            要设置的 message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path
	 *            要设置的 path
	 */
	public void setPath(String path) {
		this.path = path;
	}

}
