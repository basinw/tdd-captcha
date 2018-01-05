package com.mycompany.app;

public class Captcha {

  private int leftOperand;

  public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
    this.leftOperand = leftOperand;
  }

  public String getLeft() {
    if(this.leftOperand == 1)
      return String.valueOf(this.leftOperand);
    if(this.leftOperand == 5)
      return String.valueOf(this.leftOperand);
    return String.valueOf(this.leftOperand);
  }
}
