package com.ldo.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Model.Prize;
import Service.HomeServiceImplement;

@RestController
public class HomeController {
	
	HomeServiceImplement homeService;
	
	@GetMapping("/prize")
	public List<Prize> getPrizeList() {
		return homeService.getAllPrize();
	}
	
	@GetMapping("/prize/{prizeId}")
	public Prize getPrize(@PathVariable(name="prizeId") Integer prizeId) {
		return homeService.getPrize(prizeId);
	}
	
	@PostMapping("/addPrize")
	public ResponseEntity addPrize(@RequestBody Prize prize) {
		return homeService.addPrize(prize);
	}
	
	
}
