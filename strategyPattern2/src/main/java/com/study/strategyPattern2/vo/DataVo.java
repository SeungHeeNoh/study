package com.study.strategyPattern2.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataVo {

	private String name;
	private String desc;

	@Builder
	public DataVo(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
}
