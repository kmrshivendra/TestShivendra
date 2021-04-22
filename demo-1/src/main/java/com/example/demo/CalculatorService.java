/**
 * 
 */
package com.example.demo;

import org.springframework.stereotype.Service;

/**
 * @author SKumar147
 *
 */
@Service
public class CalculatorService {
	
	public Integer sum(String num1, String num2) {
		Integer sum=null;
		sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		return sum;
	}

}
