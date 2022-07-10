package com.lucasbarbosa.designpattern.exercises.finance.entrypoint;

import static com.lucasbarbosa.designpattern.exercises.finance.model.SubscriptionType.KEEP_SUBSCRIBED;
import static com.lucasbarbosa.designpattern.exercises.finance.model.SubscriptionType.NOTIFY_AND_UNSUBSCRIBE;

import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Listener;
import com.lucasbarbosa.designpattern.exercises.finance.interfaces.Notifier;
import com.lucasbarbosa.designpattern.exercises.finance.model.Entry;
import com.lucasbarbosa.designpattern.exercises.finance.repository.EntryRepository;
import com.lucasbarbosa.designpattern.exercises.finance.usecase.EmailListener;
import com.lucasbarbosa.designpattern.exercises.finance.usecase.EntryNotifier;
import com.lucasbarbosa.designpattern.exercises.finance.usecase.SmsListener;
import java.util.List;

public class FinanceEntrypoint {

  public static void main(String[] args) {

    List<Entry> content = EntryRepository.getEntries();
    Notifier<Entry> notifier = new EntryNotifier(content);
    Listener emailListener = new EmailListener(KEEP_SUBSCRIBED.getType());
    Listener smsListener = new SmsListener(NOTIFY_AND_UNSUBSCRIBE.getType());
    notifier.addMultipleListeners(List.of(emailListener, smsListener));
    notifier.notifyListeners();
  }
}
