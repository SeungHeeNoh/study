package com.study.useEnum.v2.service;

import org.springframework.stereotype.Service;

import com.study.useEnum.vo.DataVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnimalService2 {
	
	public DataVo getAnimalData(AnimalV2 param) throws Exception {
		return param.getMapper().getAnimalData();
	}
}
