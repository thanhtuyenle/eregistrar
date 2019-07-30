package edu.mum.cs425.eregister.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
		@GetMapping(value = {"/","/eRegistrar","/eRegistrar/home"})
		public String displayHomePage() {
				return "home/index";
		}
}
