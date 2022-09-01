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
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		return null;
	}
	
	@GetMapping("/prize/{prizeId}")
	public Prize getPrize(@PathVariable(name="prizeId") Integer prizeId) {
		return null;
	}
	
	@PostMapping("/addPrize")
	public ResponseEntity addPrize(@RequestBody Prize prize) {
		return homeService.addPrize(prize);
	}
	
	
}
