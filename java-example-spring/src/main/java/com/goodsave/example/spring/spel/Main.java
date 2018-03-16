package com.goodsave.example.spring.spel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class Main {

	private ExpressionParser parser = new SpelExpressionParser();

	@Test
	public void test() {
		Expression exp = parser.parseExpression("1==1");
        System.out.println(exp.getValue());
	}

}
