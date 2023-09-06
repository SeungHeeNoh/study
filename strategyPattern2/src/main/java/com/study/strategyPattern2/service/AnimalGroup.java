package com.study.strategyPattern2.service;

import com.study.strategyPattern2.vo.DataVo;
import com.study.strategyPattern2.vo.RequestVo;

public enum AnimalGroup {
	dog("강아지", new Animal[] {
			Animal.goldenRetriever, Animal.dachshund
			})
  , cat("고양이", new Animal[] {
		  Animal.labradoodle, Animal.russianBlue
		  })
  , fish("물고기", new Animal[] {
		  Animal.goldfish, Animal.betta
		  })
  , hamster("햄스터", new Animal[] {
		  Animal.syrianhamster, Animal.chinesehamster
		  })
  ;
	private final String type;
	private final Animal[] containAnimal;
	
	AnimalGroup(String type, Animal[] containAnimal){
		this.type = type;
		this.containAnimal = containAnimal;
	}

	public String getType() {
		return type;
	}

	public Animal[] getContainAnimal() {
		return containAnimal;
	}
	
	public static final DataVo getAnimalData(RequestVo param) {
		DataVo result = DataVo.builder()
				.name("잘못된 접근입니다.")
				.build();

		outer : for(AnimalGroup animalGroup : AnimalGroup.values()) {
    		for(Animal animal : animalGroup.getContainAnimal()) {
    			if(animal.getEnName().equals(param.getType())) {
    				result = animal.getMapper().getAnimalData();
    				break outer;
    			}
    		}
        }

		return result;
	}
}
