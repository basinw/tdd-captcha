package com.mycompany.app;

public class Captcha {

  private int leftOperand;
  private int rightOperand;
  private int operator;
  private int pattern;

  public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
    this.leftOperand = leftOperand;
    this.rightOperand = rightOperand;
    this.operator = operator;
    this.pattern = pattern;
  }

  public String getLeft() {
    if(this.pattern == 1)
      return String.valueOf(this.leftOperand);
    if(this.leftOperand == 1)
      return "One";
    if(this.leftOperand == 5)
      return "Five";
    return "Nine";
  }

  public String getRight() {
    String[] numericString = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    return numericString[this.rightOperand - 1];
  }

  public String getOperator() {
    String[] operatorSign = {"+", "-", "*"};
    return operatorSign[this.operator - 1];
  }
}
