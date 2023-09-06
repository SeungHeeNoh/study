package com.study.strategyPattern2.service;

import org.springframework.stereotype.Service;

import com.study.strategyPattern2.vo.DataVo;
import com.study.strategyPattern2.vo.RequestVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnimalService {
	
	public DataVo getAnimalData(RequestVo param) throws Exception {
		return AnimalGroup.getAnimalData(param);
	}
}
