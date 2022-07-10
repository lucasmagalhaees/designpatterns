package com.lucasbarbosa.designpattern.exercises.finance.model;

import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Subscription;
import com.lucasbarbosa.designpattern.exercises.finance.usecase.KeepSubscribed;
import com.lucasbarbosa.designpattern.exercises.finance.usecase.UnsubscribeAfterNotification;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SubscriptionType {
  KEEP_SUBSCRIBED {
    @Override
    public Subscription getType() {
      return new KeepSubscribed();
    }
  },
  NOTIFY_AND_UNSUBSCRIBE {
    @Override
    public Subscription getType() {
      return new UnsubscribeAfterNotification();
    }
  };

  public abstract Subscription getType();
}
