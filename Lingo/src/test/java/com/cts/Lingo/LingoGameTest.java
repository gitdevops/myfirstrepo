package com.cts.Lingo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.Lingo.classes.LingoGame;

public class LingoGameTest {
	
	ApplicationContext  ctx;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		LingoGame lingogame = (LingoGame) ctx.getBean("LingoGameBean");
		lingogame.startGame();
	}

}
