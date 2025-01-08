package main;

public class Addition{

    public Double firstOperand;
    public Double secondOperand;

    public Addition(Double firstOperand, Double secondOperand){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public Double getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(Double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public Double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(Double secondOperand) {
        this.secondOperand = secondOperand;
    }

    @Override
    public String toString() {
        return "Addition [getFirstOperand()=" + getFirstOperand() + ", getSecondOperand()=" + getSecondOperand() + "]";
    }
}
