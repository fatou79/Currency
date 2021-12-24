package com.fatou.microservices.Currencyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatou.microservices.Currencyexchange.bean.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	
	CurrencyExchange findByFromAndTo(String from, String to);

}
