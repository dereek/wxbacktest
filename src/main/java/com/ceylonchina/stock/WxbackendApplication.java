package com.ceylonchina.stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
@PropertySource(value="classpath:public.properties")
//mybatis扫描
@MapperScan(value= {"com.ceylonchina.stock.dao"})
@EnableScheduling
public class WxbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxbackendApplication.class, args);
	}
}
