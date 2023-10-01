package com.study.useEnum.mapper.fish;

import org.springframework.stereotype.Component;

import com.study.useEnum.mapper.AnimalMapper;
import com.study.useEnum.vo.DataVo;

@Component
public class BettaMapper implements AnimalMapper {
	
	public DataVo getAnimalData() {
		DataVo dataVo = DataVo.builder()
							.name("베타")
							.desc("베타라는 꼬리와 지느러미가 화려한 열대어로, 다양한 색상과 무늬를 가지고 있습니다. 비교적 키우기 쉬운 편이지만, 수조 내에서만 생활할 수 있습니다.")
							.build();
		
		return dataVo;
	}
}
