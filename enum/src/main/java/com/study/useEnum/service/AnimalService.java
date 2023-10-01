package com.study.useEnum.service;

import org.springframework.stereotype.Service;

import com.study.useEnum.vo.DataVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnimalService {
	
	public DataVo getAnimalData(Animal param) throws Exception {
		return param.getMapper().getAnimalData();
	}
}
