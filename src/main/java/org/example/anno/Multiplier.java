package org.example.anno;

@CommandKeyword("multiplier")
public class Multiplier implements MathProcessing {
    /**
     * @param left
     * @param right
     * @return
     */
    @Override
    public double doCalculate(double left, double right) {
        return left * right;
    }
}
