package com.commerce.web.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.commerce.web.domain.frontend.FeedbackPojo;

@Controller
public class ContactController {
	
	private static final Logger LOG = Logger.getLogger(ContactController.class);
	
	/** The key which identifies the feedback payload in the Model */
	public static final String FEEDBACK_MODEL_KEY = "feedback";
	
	/** The Contact Us view name */
	private static final String CONTACT_US_VIEW_NAME = "contact/contact";

	/** 
	 *  this method receives a ModelMap object as argument
	 *  Spring will instantiate this object for us
	 *  This method is for create an empty feedback POJO and set it to the model as key/value pair
	 */
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public String getContact(ModelMap model){
		
		FeedbackPojo feedbackPojo = new FeedbackPojo();
		model.addAttribute(ContactController.FEEDBACK_MODEL_KEY, feedbackPojo);
		
		return ContactController.CONTACT_US_VIEW_NAME; 
	}
	
	/**
	 * @ModelAttribute annotation tells Spring to take values from the 'feedback' form
	 * and automatically fill in the 'FeedbackPojo'
	 */
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public String contactPost(@ModelAttribute(FEEDBACK_MODEL_KEY) FeedbackPojo feedback){
		
		LOG.debug(feedback);
		
		return ContactController.CONTACT_US_VIEW_NAME; 
	}
}
