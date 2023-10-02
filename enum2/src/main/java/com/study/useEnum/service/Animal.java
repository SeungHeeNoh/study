package com.study.useEnum.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.study.useEnum.mapper.AnimalMapper;
import com.study.useEnum.mapper.cat.LabradoodleMapper;
import com.study.useEnum.mapper.cat.RussianBlueMapper;
import com.study.useEnum.mapper.dog.DachshundMapper;
import com.study.useEnum.mapper.dog.GoldenRetrieverMapper;
import com.study.useEnum.mapper.fish.BettaMapper;
import com.study.useEnum.mapper.fish.GoldfishMapper;
import com.study.useEnum.mapper.hamster.ChinesehamsterMapper;
import com.study.useEnum.mapper.hamster.SyrianhamsterMapper;

import lombok.RequiredArgsConstructor;

public enum Animal {
	GOLDENRETRIEVER("goldenRetriever", "골든 리트리버")
  , DACHSHUND("dachshund", "닥스훈트")
  , LABRADOODLE("labradoodle", "렉돌")
  , RUSSIANBLUE("russianBlue", "러시안블루")
  , GOLDFISH("goldfish", "금붕어")
  , BETTA("betta", "베타")
  , SYRIANHAMSTER("syrianhamster", "시리아 햄스터")
  , CHINESEHAMSTER("chinesehamster", "차이니즈 햄스터")
  ;
	
	private final String enName;
	private final String koName;
	private AnimalMapper mapper;
	
	Animal(String enName, String koName) {
		this.enName = enName;
		this.koName = koName;
	}
	
	public String getEnName() {
		return enName;
	}
	
	public String getKoName() {
		return koName;
	}
	
	public AnimalMapper getMapper() {
		return mapper;
	}
	
	/* MapperBean 주입 */
	@Component
    @RequiredArgsConstructor
    private static class AnimalMapperInjector {
		private final GoldenRetrieverMapper goldenRetrieverMapper;
		private final DachshundMapper dachshundMapper;
		private final LabradoodleMapper labradoodleMapper;
		private final RussianBlueMapper russianBlueMapper;
		private final GoldfishMapper goldfishMapper;
		private final BettaMapper bettaMapper;
		private final SyrianhamsterMapper syrianhamsterMapper;
		private final ChinesehamsterMapper chinesehamsterMapper;

        @PostConstruct
        public void postConstruct() {
        	Animal.GOLDENRETRIEVER.injectAnimalMapper(goldenRetrieverMapper);
        	Animal.DACHSHUND.injectAnimalMapper(dachshundMapper);
        	Animal.LABRADOODLE.injectAnimalMapper(labradoodleMapper);
        	Animal.RUSSIANBLUE.injectAnimalMapper(russianBlueMapper);
        	Animal.GOLDFISH.injectAnimalMapper(goldfishMapper);
        	Animal.BETTA.injectAnimalMapper(bettaMapper);
        	Animal.SYRIANHAMSTER.injectAnimalMapper(syrianhamsterMapper);
        	Animal.CHINESEHAMSTER.injectAnimalMapper(chinesehamsterMapper);
        }
    }
	
    private void injectAnimalMapper(AnimalMapper animalMapper) {
        this.mapper = animalMapper;
    }
}
