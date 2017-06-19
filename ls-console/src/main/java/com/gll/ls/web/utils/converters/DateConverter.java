package com.gll.ls.web.utils.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * springmvc string 转 Date
 * 
 * @author XL
 * @Date 2017年4月9日 下午2:56:55
 */
public class DateConverter implements Converter<String, Date> {

	public Date convert(String source) {

		if (source != null) {
			source = source.trim();
			if (source.equals("")) {
				source = null;
			}
			if (source != null) {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				try {
					return simpleDateFormat.parse(source);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
			}

		}
		return null;

	}
}
