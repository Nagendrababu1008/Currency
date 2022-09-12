package com.sysveda.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sysveda.microservices.currencyrepo.ExchangeValueRepository;
@SpringBootApplication
@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired(required=true)
	private ExchangeValueRepository exchangeValueRepository;

	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from, @PathVariable String to) {

//		ExchangeValue exchangeValue =new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
		
		ExchangeValue exchangeValue= exchangeValueRepository.findbyFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;

	}

}
