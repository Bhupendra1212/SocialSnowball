package com.TestNGDemo;

import org.testng.annotations.DataProvider;

public class dataProviderDeom {
	@DataProvider(name="loginData")
	public Object[][]  logindata() {
		Object[][] data= {{"abcd@gmail@gmail.com","1234"},
				{"abd@gmail@gmail.com","14"},
				{"absefed@gmail@gmail.com","123e44"},
				{"abdfggcd@gmail@gmail.com","12545534"}};
		
		return data;

	}

}
