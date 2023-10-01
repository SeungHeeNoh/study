package com.study.useEnum.mapper.dog;

import org.springframework.stereotype.Component;

import com.study.useEnum.mapper.AnimalMapper;
import com.study.useEnum.vo.DataVo;

@Component
public class DachshundMapper implements AnimalMapper {

	public DataVo getAnimalData() {
		DataVo dataVo = DataVo.builder()
							.name("닥스훈트")
							.desc("닥스훈트는 몸통이 길고 사지가 짧은 독특한 외모를 가지고 있으며, 활발하고 애교가 많은 성격으로 알려져 있습니다. 원래는 오소리 사냥을 위해 길러졌지만, 오늘날에는 반려견으로 더 많이 사랑받고 있습니다.")
							.build();
		
		return dataVo;
	}
}
