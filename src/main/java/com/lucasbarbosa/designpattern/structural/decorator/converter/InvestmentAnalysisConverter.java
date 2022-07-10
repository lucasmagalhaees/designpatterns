package com.lucasbarbosa.designpattern.structural.decorator.converter;

import com.lucasbarbosa.designpattern.structural.decorator.driver.BankDTO;
import com.lucasbarbosa.designpattern.structural.decorator.driver.CustomerDTO;
import com.lucasbarbosa.designpattern.structural.decorator.driver.RiskAnalysisRequest;
import com.lucasbarbosa.designpattern.structural.decorator.usecase.BankDecorator;
import com.lucasbarbosa.designpattern.structural.decorator.usecase.CustomerDecorator;

public class InvestmentAnalysisConverter {

  private RiskAnalysisRequest riskAnalysisRequest;

  public InvestmentAnalysisConverter() {
    this.riskAnalysisRequest = new RiskAnalysisRequest();
  }

  public RiskAnalysisRequest build(BankDTO bankDTO, CustomerDTO customerDTO) {
    CustomerDecorator.build(customerDTO)
        .andThen(a -> BankDecorator.build(bankDTO))
        .accept(riskAnalysisRequest);
    return riskAnalysisRequest;
  }
}
