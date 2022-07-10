package com.lucasbarbosa.designpattern.structural.decorator.driver;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
public class RiskAnalysisRequest {

  private String customerName;
  private String customerCountry;
  private String customerAddress;
  private String documentNumber;
  private String bankAccount;
  private String sessionId;
  private String sessionIp;

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("name", customerName)
        .append("country", customerCountry)
        .append("address", customerAddress)
        .append("documentNumber", documentNumber)
        .append("account", bankAccount)
        .append("id", sessionId)
        .append("ip", sessionIp)
        .toString();
  }
}
