package com.lucasbarbosa.designpattern.exercises.finance.interfaces;

import com.lucasbarbosa.designpattern.exercises.finance.model.Entry;
import java.util.List;

public abstract class Listener {

  private Subscription subscription;
  private boolean subbed;

  protected Listener(Subscription subscription) {
    this.subscription = subscription;
    unsubscribe();
  }

  public boolean isUnsubscribed() {
    return !subbed;
  }

  public boolean isSubscribed() {
    return subbed;
  }

  public void subscribe() {
    this.subbed = true;
  }

  public void unsubscribe() {
    this.subbed = false;
  }

  public abstract void sendMessage(List<Entry> recordedEntries);

  public void update(List<Entry> recordedEntries) {
    sendMessage(recordedEntries);
    subscription.postNotification(this);
  }
}
