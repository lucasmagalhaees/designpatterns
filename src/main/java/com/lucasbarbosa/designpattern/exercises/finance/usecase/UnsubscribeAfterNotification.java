package com.lucasbarbosa.designpattern.exercises.finance.usecase;

import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Listener;
import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Subscription;

public class UnsubscribeAfterNotification implements Subscription {

  @Override
  public void postNotification(Listener listener) {
    listener.unsubscribe();
    System.out.printf("Listener %s was unsubscribed \n", listener.getClass().getSimpleName());
  }
}
