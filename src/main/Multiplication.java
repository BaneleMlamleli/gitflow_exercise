package main;

public class Multiplication {
    public Double firstOperand;
    public Double secondOperand;

    public Multiplication(Double firstOperand, Double secondOperand){
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

    public Double multiplyOfOperands(){
        Double multiplyOperands = 0.0;
        try {
            multiplyOperands = firstOperand * secondOperand;
        } catch (NumberFormatException nfe) {
            System.err.println("**** Error when conducting Multiplication ****");
            System.err.println(nfe.getLocalizedMessage());
        } catch (Exception e){
            System.err.println(e.getLocalizedMessage());
        }
        return multiplyOperands;
    }

    @Override
    public String toString() {
        return "Multiplication ["+firstOperand + " x " + secondOperand + " = " + multiplyOfOperands()+"]";
    }
}
