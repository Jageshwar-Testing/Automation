package com.Automation.AutomationTestingPractice;

import org.testng.annotations.Test;

public class SoftAssert {
org.testng.asserts.SoftAssert soft1;
@Test
public void test1() {
	int i =10;
	soft1 = new org.testng.asserts.SoftAssert();
	soft1.assertEquals(i, 30);  // true
	soft1.assertNotEquals(i, 10); //  false
	System.out.println("This is soft assert");
}

@Test
public void test2() {
	int j = 50;
	soft1.assertTrue(true);
	System.out.println("This is true");
	soft1.assertFalse(true);
	System.out.println("this is false");
}

}
