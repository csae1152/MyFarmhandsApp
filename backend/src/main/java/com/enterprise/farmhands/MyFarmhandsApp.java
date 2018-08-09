package com.enterprise.farmhands;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Helmut
 * <p>Entry point for Farmhands application.</p>
 *
 */
@SpringBootApplication
@EnableJpaRepositories("com.enterprise.farmhands.repositories")
public class MyFarmhandsApp {
  /**
   *
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(MyFarmhandsApp.class, args);
  }
}
