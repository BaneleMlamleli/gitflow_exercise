package main;

public class Division {
    public Double firstOperand;
    public Double secondOperand;

    public Division(Double firstOperand, Double secondOperand){
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

    public Double divisionOfOperands(){
        Double divideOperands = 0.0;
        try {
            divideOperands = firstOperand / secondOperand;
        } catch (NumberFormatException nfe) {
            System.err.println("**** Error when conducting Division ****");
            System.err.println(nfe.getLocalizedMessage());
        } catch (Exception e){
            System.err.println(e.getLocalizedMessage());
        }
        return divideOperands;
    }

    @Override
    public String toString() {
        return "Division ["+firstOperand + " / " + secondOperand + " = " + divisionOfOperands()+"]";
    }
}
