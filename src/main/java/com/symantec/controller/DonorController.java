package com.symantec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.symantec.entity.UserDetail;
import com.symantec.service.UserService;

@Controller
public class DonorController {
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

	@RequestMapping(value="donrPage", method = RequestMethod.GET)
	public ModelAndView loadDonorPage(){
		return new ModelAndView("index.jsp");
	}
	
	@RequestMapping(value="hlthPage", method = RequestMethod.GET)
	public ModelAndView loadHealth(){
		return new ModelAndView("health.html");
	}
	
	@RequestMapping(value="healthPage", method = RequestMethod.POST)
	public ModelAndView submitHealthData(UserDetail usr){
		usrService.healthInfo(usr, null);
		return null;
	}
	
	

}
