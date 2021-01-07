package org.hcl.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.hcl.model.Emp;
import org.hcl.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	public EmpService service;
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
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	/*
	 * @GetMapping("/add") public String addForm(Model model) { // only if we use model
	 * approach by tag lib of spring then use this stmt otherwise no need Emp e =
	 * new Emp(); e.setEname("Bhavani"); e.setAddress("chennai"); return "empForm";
	 * }
	 */
	@GetMapping("/add")
	public String addForm(Model model) {
		Emp e = new Emp();
		model.addAttribute(e);
		return "empForm";
	}
	/*
	 * @PostMapping("/process")
	 *  public String process(HttpServletRequest req, Model
	 * model ) { 
	 * String name = req.getParameter("ename");
	 *  String address =
	 * req.getParameter("address"); 
	 * Emp e = new Emp(); e.setEname(name);
	 * e.setAddress(address);
	 *  Integer i = service.insertEmployee(e); String url =
	 * null;
	 * 
	 * if (i!= null) { 
	 * // if successfully inserted we need to redirect to display
	 * url = "redirect:/display";
	 *  // redirect to display if inserted }else {
	 * model.addAttribute("msg", "Not Inserted");
	 *  url = "redirect:/";
	 *  // redirect to
	 * home } 
	 * return url; 
	 * }
	 */
	// Another approach in spring for above is to use  @RequestParam bcz http servlet is used in servlets
	
	/*
	 * @PostMapping("/process") public String process(@RequestParam("ename") String
	 * name, @RequestParam("address") String address, Model model ) { // String name
	 * = req.getParameter("ename"); // String address = req.getParameter("address");
	 * Emp e = new Emp(); e.setEname(name); e.setAddress(address); Integer i =
	 * service.insertEmployee(e); String url = null;
	 * 
	 * if (i!= null) { // if successfully inserted we need to redirect to display
	 * url = "redirect:/display"; // redirect to display if inserted }else {
	 * model.addAttribute("msg", "Not Inserted"); url = "redirect:/";// redirect to
	 * home } return url; }
	 */
	
	// The drawback is is we have many fields in the form then we need to write that many request param so we use model 
	
	/*
	 * @GetMapping("/display")
	 *  public String display(ModelMap map)
	 *   { 
	 *   List<Emp> e = service.getEmployees();
	 *    map.put("employees", e); 
	 *    return "home"; 
	 *    }
	 */
	@PostMapping("/process")
	public String process(@Valid @ModelAttribute("emp") Emp e,BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "empForm";
		}
		Integer i = service.insertEmployee(e);
		String url = null;
		if (i!= null) { 
			// if successfully inserted we need to redirect to display
			url = "redirect:/display";
			// redirect to display if inserted 
		}else {
			model.addAttribute("msg", "Not Inserted");
			url = "redirect:/";
			// redirect to home
		} 
			return url; 
	}
	@GetMapping("/display")
	public String display(Model model) {
		List<Emp> e = service.getEmployees();
		model.addAttribute("employees", e);
		return "home";
	}
}
