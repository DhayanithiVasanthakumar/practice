package com.medium.dbLargeAndSmall;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DBSmallAndLarge {

	public void smallAndLarge() {
	
		
		List<Integer>al=Arrays.asList(2,9,7,5,6);
		int max=Collections.max(al);
		int min=Collections.min(al);
		
		int result=max-min;
		
		System.out.println(result);
		
	
	}
}
