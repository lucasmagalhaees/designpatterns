package com.lucasbarbosa.designpattern.creationalpatterns.singleton.entrypoint;

import com.lucasbarbosa.designpattern.creationalpatterns.singleton.model.Database;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonEntrypoint {

  public static void main(String[] args) {
    Database foo = Database.getDatabase();
    foo.query("Query 1");

    Database bar = Database.getDatabase();
    bar.query("Query 2");

    log.info("database foo {}", foo);
    log.info("database bar {}", bar);
  }

}
