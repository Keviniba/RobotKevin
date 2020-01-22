package com.softtek.example.robokevin.mrrobot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	@Value ("${jacademy.app.title}")
	private String appTitle;
	
	

	@GetMapping("/services.html")
	public String goServicesPage(){
		return "services";
	}
	@GetMapping("/about.html")
	public String goAboutPage(){
		return "about";
	}
	@GetMapping("/blog-home.html")
	public String goBlogHomePage(){
		return "blog-home";
	}
	@GetMapping("/blog-single.html")
	public String goBlogSinglePage(){
		return "blog-single";
	}
	@GetMapping("/contact.html")
	public String goContactPage(){
		return "contact";
	}
	@GetMapping("/elements.html")
	public String goElementsPage(){
		return "elements";
	}
	@GetMapping("/products.html")
	public String goProductsPage(){
		return "products";
	}
	@GetMapping("/product-details.html")
	public String goProductDetailsPage(){
		return "product-details";
	}
	@GetMapping("/index.html")
    public String goRedirectHome(Model model) {
       
        List<String> Alpha = Arrays.asList(
                "Alpha");
        List<String> Beta = Arrays.asList(
                "Beta");
        List<String> Gamma = Arrays.asList(
                "Gamma");
        List<String> Omega = Arrays.asList(
                "Omega");
       
        model.addAttribute("jaTitle", appTitle);
        model.addAttribute("Alpha", Alpha);
        model.addAttribute("Beta", Beta);
        model.addAttribute("Gamma", Gamma);
        model.addAttribute("Omega", Omega);
        return "index";
    }   
}
