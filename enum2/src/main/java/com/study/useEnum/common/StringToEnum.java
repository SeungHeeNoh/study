package com.study.useEnum.common;

import org.springframework.core.convert.converter.Converter;

import com.study.useEnum.service.Animal;

public class StringToEnum {
	
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

