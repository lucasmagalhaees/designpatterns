package com.lucasbarbosa.designpattern.exercises.finance.usecase;

import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Listener;
import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Subscription;
import com.lucasbarbosa.designpattern.exercises.finance.model.Entry;
import java.util.List;

public class EmailListener extends Listener {

  public EmailListener(Subscription subscription) {
    super(subscription);
  }

  @Override
  public void sendMessage(List<Entry> recordedEntries) {
    recordedEntries.stream()
        .map(entry -> "Sending email to " + entry.getPerson().getEmail())
        .forEach(System.out::println);
  }
}
