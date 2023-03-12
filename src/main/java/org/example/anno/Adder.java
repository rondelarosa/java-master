package org.example.anno;

@CommandKeyword("add")
public class Adder implements MathProcessing {

    /**
     * @param left
     * @param right
     * @return
     */
    @Override
    public double doCalculate(double left, double right) {
        return left + right;
    }
}
