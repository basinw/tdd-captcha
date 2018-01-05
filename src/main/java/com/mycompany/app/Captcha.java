package com.mycompany.app;

public class Captcha {

  private int leftOperand;
  private int rightOperand;

  public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
    this.leftOperand = leftOperand;
    this.rightOperand = rightOperand;
  }

  public String getLeft() {
    return String.valueOf(this.leftOperand);
  }

  public String getRight() {
    String[] numericString = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    return numericString[this.rightOperand - 1];
  }

  public String getOperator() {
    return "+";
  }
}
