package com.xieq.spring4.hello.el;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@SuppressWarnings("all")
@Configuration
@ComponentScan("com.xieq.spring4.hello.el")
@PropertySource("classpath:com/xieq/spring4/hello/el/test.properties")
public class ElConfig {

	@Value("normal")
	private String normal;

	@Value("#{systemProperties['os.name']}")
	private String osName;

	@Value("#{ T(java.lang.Math).random()*100.0}")
	private double randomNumber;

	@Value("#{anotherService.another}")
	private String fromAnthor;
//
//	@Value("#classpath:com/xieq/spring4/hello/el/test.txt")
//	private Resource testFile;

	@Value("http://www.baidu.com")
	private Resource testUrl;
	/*@Value("#{book.name}")
	private String bookName;*/

	@Autowired
	private Environment environment;

	@Bean
	public static PropertySourcesPlaceholderConfigurer configurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public void outputResources() {
		try {
			System.out.println(this.normal);
			System.out.println(this.osName);
			System.out.println(this.randomNumber);
			System.out.println(this.fromAnthor);
//			System.out.println(IOUtils.toString(this.testFile.getInputStream()));
			System.out.println(IOUtils.toString(this.testUrl.getInputStream()));
//			System.out.println(this.bookName);
			System.out.println(this.environment.getProperty("book.auther"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
