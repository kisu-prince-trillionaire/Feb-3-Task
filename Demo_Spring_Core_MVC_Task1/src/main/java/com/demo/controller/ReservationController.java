package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.bean.Reservation;

@Controller
public class ReservationController {

	@RequestMapping("/")
	public String login() {
		return "index";
	}
	
	@RequestMapping("/bookingForm")
	public String bookingForm(Model model) {
		Reservation res = new Reservation();
		model.addAttribute("reservation", res);
		return "reservation-page";
	}

	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("reservation") Reservation res) {
		return "confirmation-page";
	}
}
