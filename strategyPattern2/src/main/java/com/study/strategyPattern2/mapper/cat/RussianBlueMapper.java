package com.study.strategyPattern2.mapper.cat;

import org.springframework.stereotype.Component;

import com.study.strategyPattern2.mapper.AnimalMapper;
import com.study.strategyPattern2.vo.DataVo;

@Component
public class RussianBlueMapper implements AnimalMapper {

	public DataVo getAnimalData() {
		DataVo dataVo = DataVo.builder()
							.name("러시안블루")
							.desc("러시안 블루는 푸른빛 은회색의 단모종 고양이로, 초록색 눈을 가지고 있습니다. 또한, 우아하고 고고한 외모와 조용하고 온순한 성격으로 잘 알려져 있습니다.")
							.build();
		
		return dataVo;
	}
}
