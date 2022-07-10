package com.lucasbarbosa.designpattern.exercises.finance.usecase;

import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Listener;
import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Notifier;
import com.lucasbarbosa.designpattern.exercises.finance.model.Entry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EntryNotifier implements Notifier<Entry> {

  private Set<Listener> listeners;

  private List<Entry> recordedEntries;

  public EntryNotifier() {
    this.listeners = new HashSet<>();
    this.recordedEntries = new ArrayList<>();
  }

  public EntryNotifier(List<Entry> recordedEntries) {
    this.listeners = new HashSet<>();
    this.recordedEntries = recordedEntries;
  }

  @Override
  public void addListener(Listener listener) {
    this.listeners.add(listener);
    listener.subscribe();
  }

  @Override
  public void addMultipleListeners(List<Listener> multipleListeners) {
    multipleListeners.forEach(this::addListener);
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
  public void setNotificationContent(List<Entry> entries) {
    this.recordedEntries = entries;
  }
}
