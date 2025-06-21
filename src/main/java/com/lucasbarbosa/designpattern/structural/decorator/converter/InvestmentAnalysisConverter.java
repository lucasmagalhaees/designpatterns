package com.lucasbarbosa.designpattern.structural.decorator.converter;

import com.lucasbarbosa.designpattern.structural.decorator.driver.BankDTO;
import com.lucasbarbosa.designpattern.structural.decorator.driver.CustomerDTO;
import com.lucasbarbosa.designpattern.structural.decorator.driver.EnvironmentAnalysisDTO;
import com.lucasbarbosa.designpattern.structural.decorator.driver.RiskAnalysisRequest;
import com.lucasbarbosa.designpattern.structural.decorator.usecase.BankDecorator;
import com.lucasbarbosa.designpattern.structural.decorator.usecase.CustomerDecorator;
import com.lucasbarbosa.designpattern.structural.decorator.usecase.EnvironmentAnalysisDecorator;

public class InvestmentAnalysisConverter {

  private RiskAnalysisRequest riskAnalysisRequest;

  public InvestmentAnalysisConverter() {
    this.riskAnalysisRequest = new RiskAnalysisRequest();
  }

    public RiskAnalysisRequest build(BankDTO bankDTO, CustomerDTO customerDTO, EnvironmentAnalysisDTO environmentAnalysisDTO) {
        CustomerDecorator.build(customerDTO)
            .andThen(BankDecorator.build(bankDTO))
            .andThen(EnvironmentAnalysisDecorator.build(environmentAnalysisDTO))
            .accept(riskAnalysisRequest);
        return riskAnalysisRequest;
    }
}
