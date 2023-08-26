package com.study.strategyPattern.service;

import java.util.Arrays;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.study.strategyPattern.mapper.AnimalMapper;
import com.study.strategyPattern.vo.DataVo;
import com.study.strategyPattern.vo.RequestVo;

import lombok.RequiredArgsConstructor;

public enum AnimalMapping {
	Dog("dog") {
		@Override
		DataVo getAnimalData(RequestVo param) {
			return mapper.getDogData(param);
		}
	}
  , Cat("cat") {
		@Override
		DataVo getAnimalData(RequestVo param) {
			return mapper.getCatData(param);
		}
	}
  , Fish("fish") {
		@Override
		DataVo getAnimalData(RequestVo param) {
			return mapper.getFishData(param);
		}
	}
  , Hamster("hamster") {
		@Override
		DataVo getAnimalData(RequestVo param) {
			return mapper.gethamsterData(param);
		}
	}
  , Noting("noting") {
		@Override
		DataVo getAnimalData(RequestVo param) {
			return DataVo.builder()
					.name("잘못된 접근입니다.")
					.build();
		}
	}
  ;
  
	// 멤버 변수
    private final String type;
    protected AnimalMapper mapper;

    // 생성자
    private AnimalMapping(String type) {
        this.type = type;
    }

    // getter
    public String getType() {
        return type;
    }
    
    abstract DataVo getAnimalData(RequestVo param);
    
    public static DataVo getAnimalData(String type, RequestVo param) {
    	Optional<AnimalMapping> result = Arrays.stream(AnimalMapping.values()).filter(animal -> animal.getType().equals(type)).findFirst();
    	
    	return result.isPresent() ? result.get().getAnimalData(param) : Noting.getAnimalData(param);
    }
    
	/* MapperBean 주입 */
	@Component
    @RequiredArgsConstructor
    private static class AnimalMapperInjector {
		private final AnimalMapper animalMapper;

        @PostConstruct
        public void postConstruct() {
        	for (AnimalMapping animal : AnimalMapping.values()) {
        		animal.injectAnimalMapper(animalMapper);
            }
        }
    }
	
    private void injectAnimalMapper(AnimalMapper animalMapper) {
        this.mapper = animalMapper;
    }
}
