package com.xieq.spring4.advanced.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanName;
	private ResourceLoader resourceLoder;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoder = resourceLoader;
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public void output() {
		System.out.println("name is :" + beanName);
		Resource resource = this.resourceLoder.getResource("classpath:com/xieq/spring4/advanced/aware/test.txt");
		try {
			System.out.println(IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
