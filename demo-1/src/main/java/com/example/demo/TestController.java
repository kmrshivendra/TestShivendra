/**
 * 
 */
package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SKumar147
 *
 */
@RestController
@RequestMapping("/")
public class TestController {
	 @Autowired CalculatorService calculatorService;
	
	@RequestMapping(value = "/getSum/{num1}/{num2}", method = RequestMethod.GET)
	  public Integer getSum(@PathVariable String num1, @PathVariable String num2) {
	    return calculatorService.sum(num1, num2);
	  }
}
