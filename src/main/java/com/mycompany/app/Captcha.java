package com.mycompany.app;

public class Captcha {

  private int leftOperand;
  private int rightOperand;
  private int operator;
  private int pattern;
  String[] numericString = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

  public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
    this.leftOperand = leftOperand;
    this.rightOperand = rightOperand;
    this.operator = operator;
    this.pattern = pattern;
  }

  public String getLeft() {
    if(this.pattern == 1)
      return String.valueOf(this.leftOperand);
    return this.numericString[this.leftOperand - 1];
  }

  public String getRight() {
    if(this.pattern == 1)
      return this.numericString[this.rightOperand - 1];
    if(this.rightOperand == 1)
      return "1";
    return "9";
  }

  public String getOperator() {
    String[] operatorSign = {"+", "-", "*"};
    return operatorSign[this.operator - 1];
  }
}
