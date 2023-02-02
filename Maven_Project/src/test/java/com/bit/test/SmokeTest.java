package com.bit.test;

import org.junit.Test;

import com.bit.pages.HomePage;

public class SmokeTest {
@Test
public void test1() {
	HomePage hp = new HomePage();
	hp.verifyTitle();
}
}
