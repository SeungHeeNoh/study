package com.study.strategyPattern2.mapper.hamster;

import org.springframework.stereotype.Component;

import com.study.strategyPattern2.mapper.AnimalMapper;
import com.study.strategyPattern2.vo.DataVo;

@Component
public class ChinesehamsterMapper implements AnimalMapper {

	public DataVo getAnimalData() {
		DataVo dataVo = DataVo.builder()
							.name("차이니즈 햄스터")
							.desc("차이니즈 햄스터는 몸집이 작고 귀여운 햄스터 종으로, 털 색상은 다양합니다. 성격이 활발하고 사교적이어서, 반려 동물로 인기가 많습니다.")
							.build();
		
		return dataVo;
	}
}
