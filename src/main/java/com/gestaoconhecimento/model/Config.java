package com.gestaoconhecimento.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner;

@Entity
@Table
public class Config implements Serializable{
	
	@Id
	@SequenceGenerator(
			name = "config_sequence",
			sequenceName = "config_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "config_sequence"
			)		
	private Long id;
	private String config;
	private String valueConfig;
	
	public Config() {
		super();
		
	}
	
	

	public Config(String config, String valueConfig) {
		super();
		this.config = config;
		this.valueConfig = valueConfig;
	}



	public Config(Long id, String config, String valueConfig) {
		super();
		this.id = id;
		this.config = config;
		this.valueConfig = valueConfig;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getConfig() {
		return config;
	}



	public void setConfig(String config) {
		this.config = config;
		
	}



	public String getValueConfig() {
		return valueConfig;
	}



	public void setValueConfig(String valueConfig) {
		this.valueConfig = valueConfig;
	}



	@Override
	public String toString() {
		return "Config [id=" + id + ", config=" + config + ", valueConfig=" + valueConfig + "]";
	}
	
	
	
}

