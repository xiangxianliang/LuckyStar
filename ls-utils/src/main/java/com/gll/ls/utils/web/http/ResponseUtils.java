package com.gll.ls.utils.web.http;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

/**
 * 异步返回各种格式
 * json
 * xml
 * text
 * 
 * @author XL
 *
 */
public class ResponseUtils {

	// 发送内容
	public static void render(HttpServletResponse response, String contentType, String text) {
		response.setContentType(contentType);

		// 第二次返回
		try {
			response.getWriter().print(text);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	// 发送的的是Json格式
	public static void renderJson(HttpServletResponse response, String text) {
		render(response, "application/json;charset=UTF-8", text);
	}

	// 发送的的是xml格式
	public static void renderXML(HttpServletResponse response, String text) {
		render(response, "text/xml;charset=UTF-8", text);
	}

	// 发送的的是TEXT格式
	public static void renderText(HttpServletResponse response, String text) {
		render(response, "text/plain;charset=UTF-8", text);
	}
}
