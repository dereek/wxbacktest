package com.ceylonchina.stock.task;

import java.util.TimerTask;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ceylonchina.stock.dao.StockDao;

@Component
public class AutoUpdateStockTask extends TimerTask {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource(name="stockDao")
	private StockDao stockDao = null;

	//每天凌晨1点执行一次：0 0 1 * * ?
	@Scheduled(cron = "*/30 * * * * ?")// 30秒一次
	public void run() {
		stockDao.getStockListByUserName("derek");
	}

}
