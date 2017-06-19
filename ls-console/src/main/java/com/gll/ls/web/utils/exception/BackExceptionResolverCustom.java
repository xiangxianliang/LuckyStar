package com.gll.ls.web.utils.exception;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.gll.ls.utils.context.Config;
import com.gll.ls.utils.web.result.ExceptionResultInfo;
import com.gll.ls.utils.web.result.ResultInfo;
import com.gll.ls.utils.web.result.ResultUtil;

/**
 * 全局异常处理器类
 * 
 * @author XL
 *
 */
public class BackExceptionResolverCustom implements HandlerExceptionResolver {

	// 定义json转换器
	// 将异常信息转成json
	private HttpMessageConverter<ExceptionResultInfo> jsonMessageConverter;

	/**
	 * 前段控制器调用此方法执行异常处理
	 * 
	 * @param handler
	 *            执行的action类，类中包装了一个方法，（对应的url的方法）
	 */
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

		// 输出异常信息
		ex.printStackTrace();

		// 转成springmvc底层的一个对象(就是对action方法的封装对象，只有一个方法)
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		// 取出方法
		Method method = handlerMethod.getMethod();

		// 判断方法是否返回json
		// 只要有方法上有ResponseBody注解表示返回json
		// 查找方法上是否有ResponseBody注解
		ResponseBody body = AnnotationUtils.findAnnotation(method, ResponseBody.class);
		if (body != null) {
			// 这里讲异常信息转成json输出
			return this.resolveJsonException(request, response, handlerMethod, ex);
		}

		// 这里说明action 返回的jsp页面
		// 将异常信息在异常页面显示
		// 解析异常
		ExceptionResultInfo exceptionResultInfo = resolveExceptionCustom(ex);

		String view = "/error/error";

		int code = exceptionResultInfo.getResultInfo().getMessageCode();
		if (code == 106) {
			// 跳转到登录
			view = "/error/index2";
		}
		if (code == 105) {
			// 跳转到登录
			view = "/error/index3";
		}

		// 转向错误页面
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("exceptionResultInfo", exceptionResultInfo.getResultInfo());
		modelAndView.setViewName(view);

		return modelAndView;
	}

	/**
	 * 将异常信息转json输出
	 * 
	 * @param request
	 * @param response
	 * @param handler
	 * @param ex
	 * @return
	 */
	private ModelAndView resolveJsonException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		// 异常解析
		ExceptionResultInfo exceptionResultInfo = resolveExceptionCustom(ex);

		HttpOutputMessage outputMessage = new ServletServerHttpResponse(response);

		try {
			// 将exceptionResultInfo对象转成json输出
			jsonMessageConverter.write(exceptionResultInfo, MediaType.APPLICATION_JSON, outputMessage);
		} catch (HttpMessageNotWritableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 转向错误页面
		return new ModelAndView();
	}

	/**
	 * 异常信息解析的方法
	 * 
	 * @param ex
	 * @return
	 */
	private ExceptionResultInfo resolveExceptionCustom(Exception ex) {

		ResultInfo resultInfo = null;
		if (ex instanceof ExceptionResultInfo) {
			// 抛出的是系统自定义的异常
			resultInfo = ((ExceptionResultInfo) ex).getResultInfo();
		} else {
			// 重新构造位置错误异常
			// resultInfo = new ResultInfo();
			// resultInfo.setType(ResultInfo.TYPE_RESULT_FAIL);
			// resultInfo.setMessage("未知错误");

			resultInfo = ResultUtil.createFail(Config.BACK_MESSAGE, 900, null);
		}
		return new ExceptionResultInfo(resultInfo);

	}

	public HttpMessageConverter<ExceptionResultInfo> getJsonMessageConverter() {
		return jsonMessageConverter;
	}

	public void setJsonMessageConverter(HttpMessageConverter<ExceptionResultInfo> jsonMessageConverter) {
		this.jsonMessageConverter = jsonMessageConverter;
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
	 * 
	 */

}
