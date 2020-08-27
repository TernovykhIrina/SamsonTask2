package com.company;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

@Listeners(com.company.ListenerTestNG.class)
public class Main {

    public static void main(String[] args) {

    }

    @Test
    @TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
    public void annotation() {
        assertEquals(1, 1);
    }
}







