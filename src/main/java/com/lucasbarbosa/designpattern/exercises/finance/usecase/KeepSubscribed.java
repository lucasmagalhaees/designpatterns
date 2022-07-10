package com.lucasbarbosa.designpattern.exercises.finance.usecase;

import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Listener;
import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Subscription;

public class KeepSubscribed implements Subscription {

  @Override
  public void afterNotification(Listener listener) {
    System.out.printf("Listener %s remains subscribed \n", listener.getClass().getSimpleName());
  }
}
