package org.hcl.controllers;

import java.util.List;

import org.hcl.model.Emp;
import org.hcl.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	private EmpService service;
	public HelloController() {
		// TODO Auto-generated constructor stub
	}
	public EmpService getService() {
		return service;
	}
	public void setService(EmpService service) {
		this.service = service;
	}
	@Autowired
	public HelloController(EmpService service) {
		super();
		this.service = service;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome() {
		return "home";
	}
	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String display(Model model) {
		List<Emp> emp = service.getEmployees();
		model.addAttribute("emps", emp);
		return "home";
	}
}
