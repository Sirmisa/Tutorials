package com.example.dockerspringdemo.event.scheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AverageMonitor {

  private static final Logger LOG = LoggerFactory.getLogger(AverageMonitor.class);


  public AverageMonitor() {

  }

  @Scheduled(cron = "0/20 * * * * ?")
  public void publish() {
    System.out.println("Here I come");
  }
}
