package com.lucasbarbosa.designpattern.exercises.finance.interfaces;

import java.util.List;

public interface Notifier<T> {

  public void addListener(Listener listener);

  public void addMultipleListeners(List<Listener> multipleListeners);

  public void removeListener(Listener listener);

  void notifyListeners();

  public List<T> getNotificationContent();

  public void setNotificationContent(List<T> entries);
}
