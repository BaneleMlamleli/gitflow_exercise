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

    public Double sumOfOperands(){
        Double sumOperands = 0.0;
        try {
            sumOperands = firstOperand + secondOperand;
        } catch (NumberFormatException nfe) {
            System.err.println("**** Error when conducting addition ****");
            System.err.println(nfe.getLocalizedMessage());
        } catch (Exception e){
            System.err.println(e.getLocalizedMessage());
        }
        return sumOperands;
    }

    @Override
    public String toString() {
        return "Addition [first operand: " + firstOperand + "+ second operand: " + secondOperand + " = "+sumOfOperands()+"]";
    }

}
