package com.company.projectautomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest(classes = ProjectAutomationApplication.class)
@Slf4j
class TestUserAccount extends AbstractTestNGSpringContextTests {

	@Value("${base.url}")
	private String baseURL;

	@Autowired
	Student student;

	@Test
	void contextLoads() {
		//System.out.println("Hello World !! from IntelliJ");
		log.info("Hello WORLD !! ");
		System.out.println(baseURL);

		student.setName("KIRAN");
		student.setRollNo(12345);
		student.sayHello();

		System.out.println(student.toString());

	}
	@Test
	void browserTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		driver.quit();

	}
}
