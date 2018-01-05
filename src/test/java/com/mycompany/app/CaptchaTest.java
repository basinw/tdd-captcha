package com.mycompany.app;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaptchaTest {

  @Test
  public void leftOperandShouldBe_1() {
    Captcha captcha = new Captcha(1, 1, 1, 1);
    assertEquals("1", captcha.getLeft());
  }
}
