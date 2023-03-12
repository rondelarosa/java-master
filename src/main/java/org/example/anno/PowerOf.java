package org.example.anno;

@CommandKeyword("power")
public class PowerOf {

    /**
     * @param left
     * @param right
     * @return
     */
    public double calculate(double left, double right) {
        return Math.pow(left, right);
    }
}
