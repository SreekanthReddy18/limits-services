package com.srikanth.microservices.limitsservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srikanth.microservices.limitsservices.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromconfiguration() {
		return new LimitConfiguration(1000, 10);
	}

}
