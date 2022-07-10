package com.lucasbarbosa.designpattern.exercises.finance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EntryType {

    INCOME("Income"),
    OUTCOME("Outcome");

    private String description;


}
