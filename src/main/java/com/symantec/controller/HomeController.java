package com.symantec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.symantec.entity.UserDetail;
import com.symantec.service.UserService;

@Controller
public class HomeController {
	private UserService usrService;
	
	/**
	 * @return the usrService
	 */
	public UserService getUsrService() {
		return usrService;
	}

	/**
	 * @param usrService the usrService to set
	 */
	public void setUsrService(UserService usrService) {
		this.usrService = usrService;
	}

	@RequestMapping(value="/")
	public ModelAndView homePage(){
//		usrService.healthInfo(new UserDetail("Prakash","Manwani","abc@gmail.com","4088362049","qwerty","qwer","asdfg","12","qazwsx"),null);
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="donor")
	public ModelAndView donorPage(){
		return new ModelAndView("donor");
	}
	
	@RequestMapping(value="need")
	public ModelAndView needPage(){
		return new ModelAndView("needhelp");
	}
	
	@RequestMapping(value="donor/health")
	public ModelAndView donateHealth(){
		return null;
	}

	@RequestMapping(value = "donor/healthSubmit")
	public void healthSubmit(@RequestParam("Name") String name, @RequestParam("Address") String address, @RequestParam("State") String state, @RequestParam("zipcode") String zipcode, @RequestParam("ContactNumber") String contactno, @RequestParam("email") String email, @RequestParam("age") String age, @RequestParam("ChooseIdType") String chooseIdType, @RequestParam("id") String id, @RequestParam("ChooseBloodGroup") String cbg, @RequestParam("Description") String description){
		UserDetail ud = new UserDetail();
	}
}
