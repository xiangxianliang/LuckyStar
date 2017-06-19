package com.gll.ls.web.utils.converters;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.core.convert.converter.Converter;

/**
 * springmvc string 转 Date
 * 
 * @author XL
 * @Date 2017年4月9日 下午2:56:24
 */
public class DatetimeConverter implements Converter<String, Timestamp> {

	public Timestamp convert(String source) {

		if (source != null) {
			source = source.trim();
			if (source.equals("")) {
				source = null;
			}
			if (source != null) {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				try {
					Timestamp timestamp = new Timestamp(simpleDateFormat.parse(source).getTime());
					return timestamp;
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
