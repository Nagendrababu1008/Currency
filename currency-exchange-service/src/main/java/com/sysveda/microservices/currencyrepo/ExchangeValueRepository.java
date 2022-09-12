package com.sysveda.microservices.currencyrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sysveda.microservices.currencyexchangeservice.ExchangeValue;

@Component
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {

	ExchangeValue findbyFromAndTo(String from, String to);
}
