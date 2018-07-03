package com.ceylonchina.stock.listener;

import java.util.Timer;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ceylonchina.stock.task.AutoUpdateStockTask;


public class InitServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("contextInitialized..........");
		ServletContext application = sce.getServletContext();
		// context = (ApplicationContext)application.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
		AutoUpdateStockTask stockTask = context.getBean("autoUpdateStockTask",AutoUpdateStockTask.class);
		new Timer(true).schedule(stockTask, 0, 5000);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

}
