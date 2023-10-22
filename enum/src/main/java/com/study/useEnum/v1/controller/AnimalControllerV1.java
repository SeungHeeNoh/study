package com.study.useEnum.v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.study.useEnum.v1.service.AnimalV1;
import com.study.useEnum.v1.service.AnimalServiceV1;
import com.study.useEnum.vo.DataVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class AnimalControllerV1 {

	private final AnimalServiceV1 animalService;
	
	@GetMapping("/v1/animal")
	public String getAnimalData(Model model, AnimalV1 animal) {
		DataVo result = null;
		try {
			result = animalService.getAnimalData(animal);
			model.addAttribute("result", result);
		} catch (Exception e) {
			log.error("exception message", e);
			log.error("Exception occured");
		}
		
		return "resultView";
	}

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public String catcher(Exception e, Model model) {
		DataVo result = DataVo.builder()
				.desc("잘못된 접근입니다.")
				.build();
		model.addAttribute("result", result);

		return "resultView";
	}
}
