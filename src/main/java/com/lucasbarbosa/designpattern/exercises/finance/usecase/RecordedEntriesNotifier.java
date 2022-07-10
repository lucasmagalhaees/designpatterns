package com.lucasbarbosa.designpattern.exercises.finance.usecase;

import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Listener;
import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Notifier;
import com.lucasbarbosa.designpattern.exercises.finance.model.Entry;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecordedEntriesNotifier implements Notifier {

  private Set<Listener> listeners;
  private List<Entry> recordedEntries;

  public RecordedEntriesNotifier() {
    this.listeners = new HashSet<>();
  }

  @Override
  public void addListener(Listener listener) {
    this.listeners.add(listener);
    listener.subscribe();
  }

  @Override
  public void addAllListeners(List<Listener> allListeners) {
    allListeners.forEach(this::addListener);
  }

  @Override
  public void removeListener(Listener listener) {
    this.listeners.remove(listener);
  }

  @Override
  public void notifyListeners() {
    listeners.forEach(listener -> listener.update(getNotificationContent()));
    listeners.removeIf(Listener::isUnsubscribed);
  }

  @Override
  public List<Entry> getNotificationContent() {
    return this.recordedEntries;
  }

  @Override
  public void notifyContent(List<Entry> entries) {
    this.recordedEntries = entries;
    notifyListeners();
  }
}
