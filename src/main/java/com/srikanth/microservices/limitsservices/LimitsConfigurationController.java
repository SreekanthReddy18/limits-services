package com.srikanth.microservices.limitsservices;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
	
	@GetMapping("/fault-tolerence-example")
	//@HystrixCommand(fallbackMethod = "retriveLimits")
	public LimitConfiguration retriveLimitsHystrix() {
		throw new RuntimeException("Service not available");
	}
	
	public LimitConfiguration retriveLimits() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
