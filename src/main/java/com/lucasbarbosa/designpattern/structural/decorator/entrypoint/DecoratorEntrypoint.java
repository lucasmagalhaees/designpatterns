package com.lucasbarbosa.designpattern.structural.decorator.entrypoint;

import com.lucasbarbosa.designpattern.structural.decorator.converter.InvestmentAnalysisConverter;
import com.lucasbarbosa.designpattern.structural.decorator.driver.BankDTO;
import com.lucasbarbosa.designpattern.structural.decorator.driver.CustomerDTO;
import com.lucasbarbosa.designpattern.structural.decorator.driver.EnvironmentAnalysisDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorEntrypoint {

  public static void main(String[] args) {
    BankDTO bankDTO = new BankDTO("account", "documentNumber");
    CustomerDTO customerDTO = new CustomerDTO("name", "country", "address");
      EnvironmentAnalysisDTO environmentAnalysisDTO = new EnvironmentAnalysisDTO("ip", "id");
    InvestmentAnalysisConverter converter = new InvestmentAnalysisConverter();
    var request = converter.build(bankDTO, customerDTO, environmentAnalysisDTO);
    log.info("risk analysis request {}", request.toString());
  }
}
