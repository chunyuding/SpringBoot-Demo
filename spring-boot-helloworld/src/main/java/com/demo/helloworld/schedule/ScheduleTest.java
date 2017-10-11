package com.demo.helloworld.schedule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class ScheduleTest {

	@Scheduled(initialDelay = 100, fixedRate = 5000)
	public void schedule1() {
		System.out.println("schedule1......");
	}

	@Scheduled(cron = "0/5 * * * * ?")
	public void schedule2() {
		System.out.println("schedule2.....");
	}
}
