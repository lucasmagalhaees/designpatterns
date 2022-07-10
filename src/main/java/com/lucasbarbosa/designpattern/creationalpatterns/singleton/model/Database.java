package com.lucasbarbosa.designpattern.creationalpatterns.singleton.model;

import java.util.Objects;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class Database {

  private static Database database;

  public static Database getDatabase() {
    if (Objects.isNull(database)) {
      synchronized (Database.class) {
        if (Objects.isNull(database)) {
          database = new Database();
        }
      }
    }
    return database;
  }

  public void query(String sql) {
    log.info("sql query is {}", sql);
  }
}
