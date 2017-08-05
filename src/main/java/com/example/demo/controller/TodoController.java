package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String listTodos(ModelMap model) {
		model.put("todos", todoService.retrieveTodos("yadnyesh"));
		return "list-todos";
	}

}
