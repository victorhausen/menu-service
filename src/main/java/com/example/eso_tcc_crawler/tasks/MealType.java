package com.example.eso_tcc_crawler.tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MealType {

    CAFE_DA_MANHA("cafe_da_manha"),
    ALMOCO("almoco"),
    JANTAR("jantar");

    private final String value;
}

