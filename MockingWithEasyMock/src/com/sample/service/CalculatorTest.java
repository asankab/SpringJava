package com.sample.service;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.easymock.IExpectationSetters;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
    	SimpleDateFormat simpleDateFormatter = new SimpleDateFormat("MM/dd/yyyy");
    	String x = simpleDateFormatter.format(new Date()); 
    	System.out.println(new Date());
		System.out.println(x);
    	
		ICalculatorService calculatorServiceMock = EasyMock.createMock(ICalculatorService.class);
		EasyMock.expect(calculatorServiceMock.add(12, 18)).andReturn(50).anyTimes();
		EasyMock.replay(calculatorServiceMock);
		
		CalculatorDriver driver = new CalculatorDriver();
		int result = driver.AddAndIncrement(calculatorServiceMock);
		
		Assert.assertEquals(51, result);
		
		EasyMock.verify(calculatorServiceMock);
	}
}
