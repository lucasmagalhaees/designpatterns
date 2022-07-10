package com.lucasbarbosa.designpattern.structural.decorator.usecase;

import com.lucasbarbosa.designpattern.structural.decorator.driver.EnvironmentAnalysisDTO;
import com.lucasbarbosa.designpattern.structural.decorator.driver.RiskAnalysisRequest;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EnvironmentAnalysisDecorator implements Consumer<RiskAnalysisRequest> {

  private EnvironmentAnalysisDTO environmentAnalysisDTO;

  public static EnvironmentAnalysisDecorator build(EnvironmentAnalysisDTO environmentAnalysisDTO) {
    return new EnvironmentAnalysisDecorator(environmentAnalysisDTO);
  }

  @Override
  public void accept(RiskAnalysisRequest riskAnalysisRequest) {
    riskAnalysisRequest.setSessionId(environmentAnalysisDTO.getId());
    riskAnalysisRequest.setSessionIp(environmentAnalysisDTO.getIp());
  }
}
