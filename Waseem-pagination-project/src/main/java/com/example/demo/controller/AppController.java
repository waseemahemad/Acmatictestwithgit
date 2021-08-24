package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
public class AppController {
	@Autowired
	private ProductService service;


public String viewHomePage(Model model)
{
Page<Product> page=service.listAll();
List<Product> listProducts=page.getContent();

return "index";

}
}
