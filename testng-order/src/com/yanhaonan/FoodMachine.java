package com.yanhaonan;

import org.springframework.stereotype.Component;

/**
 * Created by Vegeta on 3/19/17.
 */
@Component
public class FoodMachine {
    public boolean product() {
        System.out.println("FoodMachine working...");
        return true;
    }
}
