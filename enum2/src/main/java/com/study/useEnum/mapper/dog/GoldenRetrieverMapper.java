package com.study.useEnum.mapper.dog;

import org.springframework.stereotype.Component;

import com.study.useEnum.mapper.AnimalMapper;
import com.study.useEnum.vo.DataVo;

@Component
public class GoldenRetrieverMapper implements AnimalMapper {

	public DataVo getAnimalData() {
		DataVo dataVo = DataVo.builder()
							.name("골든 리트리버")
							.desc("골든 리트리버는 친절하고 온순한 성격으로, 아이들과 어른들, 다른 동물들과도 잘 어울립니다. 또한, 충성심이 강하고 주인을 잘 따르기 때문에, 가족과 함께하는 반려견으로 인기가 많습니다.")
							.build();
		
		return dataVo;
	}
}
