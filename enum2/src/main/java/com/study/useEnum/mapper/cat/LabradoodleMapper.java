package com.study.useEnum.mapper.cat;

import org.springframework.stereotype.Component;

import com.study.useEnum.mapper.AnimalMapper;
import com.study.useEnum.vo.DataVo;

@Component
public class LabradoodleMapper implements AnimalMapper {

	public DataVo getAnimalData() {
		DataVo dataVo = DataVo.builder()
							.name("렉돌")
							.desc("렉돌은 골든리트리버와 포메라니안의 교배종으로, 친절하고 온화한 성격을 가지고 있습니다. 또한, 털이 풍성하고 부드러워서 많은 사람들에게 사랑받고 있습니다.")
							.build();
		
		return dataVo;
	}
}
