package org.example.anno;

@CommandKeyword("divide")
public class Divider implements MathProcessing {
    /**
     * @param left
     * @param right
     * @return
     */
    @Override
    public double doCalculate(double left, double right) {
        return left / right;
    }
}
