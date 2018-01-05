package com.mycompany.app;

public class Captcha {

  private int leftOperand;

  public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
    this.leftOperand = leftOperand;
  }

  public String getLeft() {
    return String.valueOf(this.leftOperand);
  }
}
