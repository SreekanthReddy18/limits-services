package com.srikanth.microservices.limitsservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srikanth.microservices.limitsservices.bean.Configuration;
import com.srikanth.microservices.limitsservices.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromconfiguration() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

}
