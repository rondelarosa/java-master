package org.example.anno;

@CommandKeyword("subtract")
public class Subtracter implements MathProcessing {
    /**
     * @param left
     * @param right
     * @return
     */
    @Override
    public double doCalculate(double left, double right) {
        return left - right;
    }
}
