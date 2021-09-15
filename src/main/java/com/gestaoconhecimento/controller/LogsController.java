package com.gestaoconhecimento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestaoconhecimento.model.Logs;
import com.gestaoconhecimento.service.LogsService;

//Resources para API

@CrossOrigin("*")
@RestController
@RequestMapping(path = "api/v1/logs")
public class LogsController {
	
	private final LogsService logsService;
	
	@Autowired
	public LogsController(LogsService logsService) {
		this.logsService = logsService;
	}
	
	@GetMapping()
	public List<Logs> getLogs(){
		return logsService.getLogs();
	}
	
	@PostMapping
	public void registrarLog(@RequestBody Logs log) {
		logsService.registrarLog(log);
	}

}
