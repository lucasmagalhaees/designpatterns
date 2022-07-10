package com.lucasbarbosa.designpattern.structural.decorator.usecase;

import com.lucasbarbosa.designpattern.structural.decorator.driver.BankDTO;
import com.lucasbarbosa.designpattern.structural.decorator.driver.RiskAnalysisRequest;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankDecorator implements Consumer<RiskAnalysisRequest> {

  private BankDTO bankDTO;

  public static BankDecorator build(BankDTO bankDTO) {
    return new BankDecorator(bankDTO);
  }

  @Override
  public void accept(RiskAnalysisRequest riskAnalysisRequest) {
    riskAnalysisRequest.setBankAccount(bankDTO.getAccount());
    riskAnalysisRequest.setDocumentNumber(bankDTO.getDocumentNumber());
  }
}
