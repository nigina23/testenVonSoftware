package de.fhkiel.tsw;


/**
 * A class to calculate a division.*/
public class Division {
    private final double dividend;
    private double divisor;
    /**
     * Instantiates a new Division object. *
     * @param dividend the dividend to be divided
     */
    public Division(double dividend){
        this.dividend = dividend;
        divideBy(1.0);
    }
    /**
     * Instantiates a new Division object.
     * @param dividend the dividend to be divided
     * @param divisor the divisor for the division
     */
    public Division(double dividend, double divisor){
        this.dividend = dividend;
        divideBy(divisor);
    }


    /**
     * Divide the dividend by this value. *
     * @param divisor the divisor for the division */
    public void divideBy(double divisor) {
        if(divisor != 0){
            this.divisor = divisor;
        } else {
            throw new ArithmeticException("Can not divide by zero");
        }
    }
    /**
     * The result of the division.
     *
     * @return the result as double
     */
    public double value(){
        return dividend / divisor;
    }
}

