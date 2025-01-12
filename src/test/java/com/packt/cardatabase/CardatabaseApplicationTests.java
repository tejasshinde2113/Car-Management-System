package com.packt.cardatabase;

import com.packt.cardatabase.web.CarController;
import org.apache.catalina.core.ApplicationContext;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest

class CardatabaseApplicationTests {
  @Autowired
  private CarController controller;
  @Test
  void contextLoads() {
    assertThat(controller).isNotNull();
  }
}
