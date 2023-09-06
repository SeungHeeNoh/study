package com.study.strategyPattern2.mapper.fish;

import org.springframework.stereotype.Component;

import com.study.strategyPattern2.mapper.AnimalMapper;
import com.study.strategyPattern2.vo.DataVo;

@Component
public class GoldfishMapper implements AnimalMapper {

	public DataVo getAnimalData() {
		DataVo dataVo = DataVo.builder()
							.name("금붕어")
							.desc("금붕어는 물고기 중 가장 인기 있는 종으로, 전 세계적으로 많은 사랑을 받고 있습니다. 다양한 색상과 크기로 존재하며, 비교적 키우기 쉬운 편입니다.")
							.build();
		
		return dataVo;
	}
	
}
