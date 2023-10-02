package com.study.useEnum.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.study.useEnum.service.Animal;

@Configuration
public class StringToEnum {
	
	@Component
	public static class AnimalConverter implements Converter<String, Animal> {

		@Override
		public Animal convert(String value) {
			try {
				return Animal.valueOf(value.toUpperCase());
			} catch (IllegalArgumentException e) {
				return null;
			}
		}
	}
}

