package com.czetsuyatech.logger;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@RequiredArgsConstructor
public class Application {

  private final List<LoggerComponent> loggers;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @EventListener
  public void onStartup(ContextRefreshedEvent event) {

    loggers.stream().forEach(LoggerComponent::logLevels);
  }
}
