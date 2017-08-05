package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@RequestMapping(value = "/list-todo", method = RequestMethod.GET)
	public String showTodo(ModelMap model) {
		String name = (String) model.get("name");
		model.put("todos", todoService.retrieveTodos(name));
		return "list-todo";
	}
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showaddTodo(ModelMap model) {
		return "todo";
	}
	
	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @RequestParam String desc) {
		todoService.addTodo((String) model.get("name"), desc, new Date(), false);
		return "redirect:/list-todo";
	}

}
