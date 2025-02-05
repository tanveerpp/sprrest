package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyService {
	RestTemplate template;
	@Autowired
	UserserviceApplication app;
	@Autowired
	UserRepo repo;
	public List<User> showData()
	{
		List<User> al=this.repo.findAll();
		template=this.app.getRestTemplate();
		List<Product> d=template.getForObject("http://productservice/product", List.class);
		//List<Product> d=template.getForObject("https://heked68527.pythonanywhere.com/product/", List.class);
		al.get(0).setProducts(d);
		//repo.save(al.get(0));
		return al;
	}
}
