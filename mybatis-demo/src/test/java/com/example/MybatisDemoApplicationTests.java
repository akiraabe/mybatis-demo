package com.example;

import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@SpringBootTest
@Ignore
public class MybatisDemoApplicationTests {

	@ClassRule
	public static OutputCapture out = new OutputCapture();

	@Test
	public void contextLoads() {

		out.expect(containsString("grossAmount : 510000"));
	}
}
