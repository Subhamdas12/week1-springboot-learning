package com.week1.Week1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "database.env", havingValue = "development")
public class DevDB implements DB {

    @Override
    public void getData() {
        System.out.println("Data from DevDB");
    }

}
