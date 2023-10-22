package com.study.useEnum.v2.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.study.useEnum.v2.service.AnimalV2;

@Configuration
public class StringToEnum {
	
	@Component
	public static class AnimalConverter implements Converter<String, AnimalV2> {

		@Override
		public AnimalV2 convert(String value) {
			try {
				System.out.println("?");
				return AnimalV2.valueOf(value.toUpperCase());
			} catch (IllegalArgumentException e) {
				return null;
			}
		}
	}
}

