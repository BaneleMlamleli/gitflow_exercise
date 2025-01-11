package main;

public class Subtraction {

    public Double firstOperand;
    public Double secondOperand;

    public Subtraction(Double firstOperand, Double secondOperand){
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

    public Double subtractionOfOperands(){
        Double subtractOperands = 0.0;
        try {
            subtractOperands = firstOperand - secondOperand;
        } catch (NumberFormatException nfe) {
            System.err.println("**** Error when conducting Subtraction ****");
            System.err.println(nfe.getLocalizedMessage());
        } catch (Exception e){
            System.err.println(e.getLocalizedMessage());
        }
        return subtractOperands;
    }

    @Override
    public String toString() {
        return "Subtraction ["+firstOperand + " - " + secondOperand + " = " + subtractionOfOperands()+"]";
    }
}
