package com.czetsuyatech.logger.trace;

import com.czetsuyatech.logger.LoggerComponent;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TraceLogger implements LoggerComponent {

  @Override
  public Logger getLogger() {
    return log;
  }
}
