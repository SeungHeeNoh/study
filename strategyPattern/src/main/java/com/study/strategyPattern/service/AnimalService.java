package com.study.strategyPattern.service;

import org.springframework.stereotype.Service;

import com.study.strategyPattern.vo.DataVo;
import com.study.strategyPattern.vo.RequestVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnimalService {
	
	public DataVo getAnimalData(RequestVo param) throws Exception {
		return AnimalMapping.getAnimalData(param.getType(), param);
	}
}
