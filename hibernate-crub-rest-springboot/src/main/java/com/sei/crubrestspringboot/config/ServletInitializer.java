package com.sei.crubrestspringboot.config;

import com.sei.crubrestspringboot.CrubRestSpringbootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CrubRestSpringbootApplication.class);
	}

}
