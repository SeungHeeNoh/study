package com.study.strategyPattern2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.study.strategyPattern2.service.AnimalService;
import com.study.strategyPattern2.vo.DataVo;
import com.study.strategyPattern2.vo.RequestVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class AnimalController {

	private final AnimalService animalService;
	
	@GetMapping("/animal")
	public String getAnimalData(Model model, RequestVo param) {
		DataVo result;
		try {
			result = animalService.getAnimalData(param);
			model.addAttribute("result", result);
		} catch (Exception e) {
			log.error("Exception occured");
		}
		
		
		return "resultView";
	}
	
	@GetMapping("/animalFamily")
	public String getAnimalFamily(Model model, RequestVo param) {
		DataVo result;
		try {
			result = animalService.getAnimalData(param);
			model.addAttribute("result", result);
		} catch (Exception e) {
			log.error("Exception occured");
		}
		
		
		return "resultView";
	}
}
