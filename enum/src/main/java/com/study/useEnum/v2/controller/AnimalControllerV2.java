package com.study.useEnum.v2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.study.useEnum.v2.service.AnimalV2;
import com.study.useEnum.v2.service.AnimalService2;
import com.study.useEnum.vo.DataVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class AnimalControllerV2 {

	private final AnimalService2 animalService;
	
	@GetMapping("/v2/animal")
	public String getAnimalData(Model model, AnimalV2 animal) {
		DataVo result = null;
		try {
			result = animalService.getAnimalData(animal);
		} catch (Exception e) {
			result = DataVo.builder()
					.desc("잘못된 접근입니다.")
					.build();
		}
		
		model.addAttribute("result", result);
		return "resultView";
	}
}
