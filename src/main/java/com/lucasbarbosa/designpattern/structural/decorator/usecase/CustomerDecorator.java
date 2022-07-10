package com.lucasbarbosa.designpattern.structural.decorator.usecase;

import com.lucasbarbosa.designpattern.structural.decorator.driver.CustomerDTO;
import com.lucasbarbosa.designpattern.structural.decorator.driver.RiskAnalysisRequest;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomerDecorator implements Consumer<RiskAnalysisRequest> {

  private CustomerDTO customerDTO;

  public static CustomerDecorator build(CustomerDTO customerDTO) {
    return new CustomerDecorator(customerDTO);
  }

  @Override
  public void accept(RiskAnalysisRequest riskAnalysisRequest) {
    riskAnalysisRequest.setCustomerAddress(customerDTO.getAddress());
    riskAnalysisRequest.setCustomerCountry(customerDTO.getCountry());
    riskAnalysisRequest.setCustomerName(customerDTO.getName());
  }
}
