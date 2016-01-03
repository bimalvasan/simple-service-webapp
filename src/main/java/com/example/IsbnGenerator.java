package com.example;

import java.util.Random;

@ThirteenDIgits
public class IsbnGenerator implements NumberGenerator {

	@Override
	public String generateNumber() {
		return "13-84356-" + Math.abs(new Random().nextInt());
	}
}
