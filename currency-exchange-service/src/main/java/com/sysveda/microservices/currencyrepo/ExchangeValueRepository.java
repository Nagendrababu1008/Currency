package com.sysveda.microservices.currencyrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sysveda.microservices.currencyexchangeservice.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {

}
