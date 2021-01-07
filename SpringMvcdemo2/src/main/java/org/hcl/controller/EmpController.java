package org.hcl.controller;

import javax.servlet.http.HttpServletRequest;

import org.hcl.model.Emp;
import org.hcl.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class EmpController {
	private EmpService service;
	public EmpController() {
		// TODO Auto-generated constructor stub
	}
	
	public EmpService getService() {
		return service;
	}

	public void setService(EmpService service) {
		this.service = service;
	}
	@Autowired
	public EmpController(EmpService service) {
		super();
		this.service = service;
	}

	@RequestMapping("/")
	public String showHome() {
		return "home";
	}
	@RequestMapping("/new")
	public String showForm() {
		return "emp-Form";
	}
	@RequestMapping(path = "/process", method = RequestMethod.POST)
	public String processForm(HttpServletRequest request) {
		int eno = Integer.parseInt(request.getParameter("eno"));
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		Emp e = new Emp(eno, name, address);
		boolean b = service.insertEmployees(e);
		if(b) {
			return "redirect:/";
		}
		return "home";
	}
}
