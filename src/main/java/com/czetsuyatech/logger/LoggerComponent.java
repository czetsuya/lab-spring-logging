package com.czetsuyatech.logger;

import org.slf4j.Logger;

public interface LoggerComponent {

  default void logLevels() {
    System.out.println(getClass().getPackageName() + ": " + "-".repeat(50));

    getLogger().info("Hello World");
    getLogger().debug("Hello World");
    getLogger().warn("Hello World");
    getLogger().trace("Hello World");
    getLogger().error("Hello World");
  }

  Logger getLogger();
}
