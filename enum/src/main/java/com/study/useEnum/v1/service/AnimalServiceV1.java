package com.study.useEnum.v1.service;

import org.springframework.stereotype.Service;

import com.study.useEnum.vo.DataVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnimalServiceV1 {
	
	public DataVo getAnimalData(AnimalV1 param) throws Exception {
		return param.getMapper().getAnimalData();
	}
}
