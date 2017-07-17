package com.github.salakhedenov.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.salakhedenov.service.StringService;

@Controller
public class StringController {

	@Resource
	private StringService stringService;

	@RequestMapping("hello")
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("hello");

		mv.addObject("name", stringService.getTbName());

		return mv;

	}

}
