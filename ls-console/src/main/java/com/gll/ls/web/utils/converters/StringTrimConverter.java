package com.gll.ls.web.utils.converters;

import org.springframework.core.convert.converter.Converter;

/**
 * 字段置空
 * 
 * @author XL
 * @Date 2017年4月9日 下午2:55:10
 */
public class StringTrimConverter implements Converter<String, String> {

	public String convert(String source) {

		if (source != null) {
			source = source.trim();
			if (source.equals("")) {
				source = null;
			}
		}
		return source;

	}
}
