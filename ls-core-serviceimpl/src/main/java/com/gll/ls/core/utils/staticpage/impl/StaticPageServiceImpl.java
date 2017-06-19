package com.gll.ls.core.utils.staticpage.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.gll.ls.core.utils.staticpage.StaticPageService;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * 静态化Service
 * 
 * @author XL
 *
 */
public class StaticPageServiceImpl implements StaticPageService, ServletContextAware {

	/**
	 * freemarker视图
	 */
	// private FreeMarkerConfigurer freeMarkerConfigurer;

	public void setFreeMarkerConfigurer(FreeMarkerConfigurer freeMarkerConfigurer) {
		// this.freeMarkerConfigurer = freeMarkerConfigurer;
		this.conf = freeMarkerConfigurer.getConfiguration();
	}

	private Configuration conf;

	private ServletContext servletContext;

	/**
	 * 静态化
	 * 
	 * @throws IOException
	 */
	public void productIndex(Map<String, Object> rootMap, String directory, Integer id) {
		// 输出流 从内存写出去， 磁盘
		Writer out = null;

		// 获取路径 HTML路径
		String path = getPath("/html/" + directory + "/" + id + ".html");
		File f = new File(path);
		File parentFile = f.getParentFile();
		if (!parentFile.exists()) {
			parentFile.mkdirs();
		}

		try {
			out = new OutputStreamWriter(new FileOutputStream(f), "UTF-8");
			// 读进来 utf-8 内存
			Template template = conf.getTemplate("productDetail.html");

			// 处理模板
			template.process(rootMap, out);
		} catch (IOException | TemplateException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				out = null;
			}
		}
	}

	/**
	 * 获取路径
	 * 
	 * @param name
	 * @return
	 */
	public String getPath(String name) {
		return servletContext.getRealPath(name);
	}

	/**
	 * ServletContextAware 接口实现的方法
	 */
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;

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
