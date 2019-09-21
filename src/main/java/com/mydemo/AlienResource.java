package com.mydemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {
	
	@GetMapping("aliens")
	public List<Alien> getAleins(){
		
		List<Alien> aliens=new ArrayList<>();
		
		Alien a1=new Alien();
		a1.setId(10);
		a1.setName("a");
		a1.setPoints(100);
		
		Alien a2=new Alien();
		a2.setId(20);
		a2.setName("b");
		a2.setPoints(200);
		
		aliens.add(a1);
		aliens.add(a2);
		
		return aliens;
		
	}

}
