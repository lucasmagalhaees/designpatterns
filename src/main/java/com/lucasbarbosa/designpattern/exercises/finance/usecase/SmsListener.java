package com.lucasbarbosa.designpattern.exercises.finance.usecase;

import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Listener;
import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Subscription;
import com.lucasbarbosa.designpattern.exercises.finance.model.Entry;
import java.util.List;

public class SmsListener extends Listener {

  public SmsListener(Subscription subscription) {
    super(subscription);
  }

  @Override
  public void sendMessage(List<Entry> recordedEntries) {
    recordedEntries.stream()
        .map(entry -> "Sending SMS to phone" + entry.getPerson().getPhoneNumber())
        .forEach(System.out::println);
  }
}
