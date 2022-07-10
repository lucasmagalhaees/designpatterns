package com.lucasbarbosa.designpattern.structural.decorator.entrypoint;

import com.lucasbarbosa.designpattern.structural.decorator.converter.InvestmentAnalysisConverter;
import com.lucasbarbosa.designpattern.structural.decorator.driver.BankDTO;
import com.lucasbarbosa.designpattern.structural.decorator.driver.CustomerDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorEntrypoint {

  public static void main(String[] args) {
    BankDTO bankDTO = new BankDTO("account", "documentNumber");
    CustomerDTO customerDTO = new CustomerDTO("name", "country", "address");
    InvestmentAnalysisConverter converter = new InvestmentAnalysisConverter();
    var request = converter.build(bankDTO, customerDTO);
    log.info("risk analysis request {}", request.toString());
  }
}
