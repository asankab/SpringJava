package com.sample.service;

public class CalculatorDriver 
{	
    public int AddAndIncrement(ICalculatorService calculatorSvc){	
    	int result = calculatorSvc.add(12, 18);   	
    	return result + 1;
    }
}
