package com.zhu.web.mysecondboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MysecondbootApplicationTests {

	@Test
	public void contextLoads() {
		int of=Integer.valueOf(24 * 3600);
		System.out.print("ooooo"+of);
	}

}
