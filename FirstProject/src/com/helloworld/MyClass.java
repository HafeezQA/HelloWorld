package com.helloworld;

import org.testng.annotations.Test;

public class MyClass {
	
	@Test(priority = 1)
    void Setup()
    {
        System.out.println("This is Setup test" );
    }
    @Test(priority = 2)
    void LogIn()
    {
        System.out.println("This is LogIn test" );
    }
    @Test(priority = 3)
    void Close()
    {
        System.out.println("This is Close test" );
    }

}
