package com.study.useEnum.v1.service;

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

public enum AnimalV1 {
	goldenRetriever("GoldenRetriever", "골든 리트리버")
  , dachshund("Dachshund", "닥스훈트")
  , labradoodle("Labradoodle", "렉돌")
  , russianBlue("RussianBlue", "러시안블루")
  , goldfish("Goldfish", "금붕어")
  , betta("Betta", "베타")
  , syrianhamster("Syrianhamster", "시리아 햄스터")
  , chinesehamster("Chinesehamster", "차이니즈 햄스터")
  ;
	
	private final String enName;
	private final String koName;
	private AnimalMapper mapper;
	
	AnimalV1(String enName, String koName) {
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
        	AnimalV1.goldenRetriever.injectAnimalMapper(goldenRetrieverMapper);
        	AnimalV1.dachshund.injectAnimalMapper(dachshundMapper);
        	AnimalV1.labradoodle.injectAnimalMapper(labradoodleMapper);
        	AnimalV1.russianBlue.injectAnimalMapper(russianBlueMapper);
        	AnimalV1.goldfish.injectAnimalMapper(goldfishMapper);
        	AnimalV1.betta.injectAnimalMapper(bettaMapper);
        	AnimalV1.syrianhamster.injectAnimalMapper(syrianhamsterMapper);
        	AnimalV1.chinesehamster.injectAnimalMapper(chinesehamsterMapper);
        }
    }
	
    private void injectAnimalMapper(AnimalMapper animalMapper) {
        this.mapper = animalMapper;
    }
}
