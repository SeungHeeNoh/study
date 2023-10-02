package com.study.useEnum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.study.useEnum.service.Animal;
import com.study.useEnum.service.AnimalService;
import com.study.useEnum.vo.DataVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class AnimalController {

	private final AnimalService animalService;
	
	@GetMapping("/animal")
	public String getAnimalData(Model model, Animal animal) {
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
