package com.study.strategyPattern.mapper;

import org.springframework.stereotype.Component;

import com.study.strategyPattern.vo.DataVo;
import com.study.strategyPattern.vo.RequestVo;

@Component
public class AnimalMapper {

	public DataVo getDogData(RequestVo param) {
		DataVo dataVo = DataVo.builder()
							.name("강아지")
							.desc("골든 리트리버, 닥스훈트와 같은 종이 있다.")
							.build();
		
		return dataVo;
	}
	
	public DataVo getCatData(RequestVo param) {
		DataVo dataVo = DataVo.builder()
						.name("고양이")
						.desc("렉돌, 러시안블루와 같은 종이 있다.")
						.build();
		
		return dataVo;
	}
	
	public DataVo getFishData(RequestVo param) {
		DataVo dataVo = DataVo.builder()
						.name("물고기")
						.desc("금붕어 베타와 같은 종이 있다.")
						.build();
		
		return dataVo;
	}
	
	public DataVo gethamsterData(RequestVo param) {
		DataVo dataVo = DataVo.builder()
						.name("햄스터")
						.desc("시리아 햄스터, 차이니즈 햄스터 같은 종이 있다.")
						.build();
		
		return dataVo;
	}
}
