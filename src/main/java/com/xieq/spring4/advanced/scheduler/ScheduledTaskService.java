package com.xieq.spring4.advanced.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {

	private SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	@Scheduled(fixedRate = 5000)
	public void secheduledTask1() {
		System.out.println("定时任务1，每隔5秒执行" + format.format(new Date()));
	}
	
	@Scheduled(cron="10 35 09 * * *")
	public void fixTimeExetution() {
		System.out.println("在指定时间执行这个任务："+format.format(new Date()));
	}
}
