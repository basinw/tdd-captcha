package com.mycompany.app;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaptchaTest {

  @Test
  public void secondPatternRightOperandShouldBe_1() {
    Captcha captcha = new Captcha(2, 1, 1, 2);
    assertEquals("1", captcha.getRight());
  }

  @Test
  public void secondPatternLeftOperandShouldBeOne() {
    Captcha captcha = new Captcha(2, 1, 1, 1);
    assertEquals("One", captcha.getLeft());
  }

  @Test
  public void secondPatternLeftOperandShouldBeFive() {
    Captcha captcha = new Captcha(2, 5, 1, 1);
    assertEquals("Five", captcha.getLeft());
  }

  @Test
  public void secondPatternLeftOperandShouldBeNine() {
    Captcha captcha = new Captcha(2, 9 ,1, 1);
    assertEquals("Nine", captcha.getLeft());
  }

  @Test
  public void operatorShouldBePlus() {
    Captcha captcha = new Captcha(1,1,1,1);
    assertEquals("+", captcha.getOperator());
  }

  @Test
  public void operatorShouldBeMinus() {
    Captcha captcha = new Captcha(1,1,2,1);
    assertEquals("-", captcha.getOperator());
  }

  @Test
  public void operatorShouldBeMultiply() {
    Captcha captcha = new Captcha(1,1,3,1);
    assertEquals("*", captcha.getOperator());
  }

  @Test
  public void rightOperandShouldBeOne() {
    Captcha captcha = new Captcha(1,1,1,1);
    assertEquals("One", captcha.getRight());
  }

  @Test
  public void rightOperandShouldBeFive() {
    Captcha captcha = new Captcha(1,1,1,5);
    assertEquals("Five", captcha.getRight());
  }

  @Test
  public void rightOperandShouldBeNine() {
    Captcha captcha = new Captcha(1, 1, 1, 9);
    assertEquals("Nine", captcha.getRight());
  }

  @Test
  public void leftOperandShouldBe_1() {
    Captcha captcha = new Captcha(1, 1, 1, 1);
    assertEquals("1", captcha.getLeft());
  }

  @Test
  public void leftOperandShouldBe_5() {
    Captcha captcha = new Captcha(1, 5, 1, 1);
    assertEquals("5", captcha.getLeft());
  }

  @Test
  public void leftOperandShouldBe_9() {
    Captcha captcha = new Captcha(1, 9, 1, 1);
    assertEquals("9", captcha.getLeft());
  }
}
