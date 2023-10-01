package com.study.useEnum.mapper.hamster;

import org.springframework.stereotype.Component;

import com.study.useEnum.mapper.AnimalMapper;
import com.study.useEnum.vo.DataVo;

@Component
public class SyrianhamsterMapper implements AnimalMapper {

	public DataVo getAnimalData() {
		DataVo dataVo = DataVo.builder()
							.name("시리아 햄스터")
							.desc("시리아 햄스터는 가장 인기 있는 햄스터 종으로, 전 세계적으로 많은 사랑을 받고 있습니다. 털이 풍성하고 몸집이 크며, 성격이 온순하고 사교적이어서 반려 동물로 적합합니다.")
							.build();
		
		return dataVo;
	}

}