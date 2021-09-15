package com.gestaoconhecimento.service;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestaoconhecimento.model.Logs;
import com.gestaoconhecimento.repository.LogsRepository;


@Service
public class LogsService {
	
	private final LogsRepository logsRepository;
	
	@Autowired
	public LogsService(LogsRepository logsRepository) {
		this.logsRepository = logsRepository;
	}
	
	public List<Logs> getLogs() {
		return logsRepository.findAll();
	}

	public void registrarLog(Logs log) {
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);
        log.setTimeStamp(timestamp.toString());
        
		logsRepository.save(log);
				
	}
}
