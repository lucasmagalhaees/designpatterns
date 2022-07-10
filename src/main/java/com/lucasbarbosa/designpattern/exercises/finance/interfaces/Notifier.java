package com.lucasbarbosa.designpattern.exercises.finance.interfaces;

import com.lucasbarbosa.designpattern.exercises.finance.model.Entry;
import java.util.List;

public interface Notifier {

  public void addListener(Listener listener);

  public void addAllListeners(List<Listener> allListeners);

  public void removeListener(Listener listener);

  void notifyListeners();

  public List<Entry> getNotificationContent();

  public void notifyContent(List<Entry> entries);
}
