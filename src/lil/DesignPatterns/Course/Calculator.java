package lil.DesignPatterns.Course;

/**
 * 描述:
 * 策略模式
 *
 * @author lil
 * @create 2018-07-22 下午5:38
 */
public class Calculator {
    /**
     *  一般情况下我们是将一种行为写成一个类方法，比如计算器类中有加、减、乘、除四种方法，
     *  而策略模式则是将每一种算法都写成一个类，然后动态的选择使用哪一个算法。
     */

    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int doOperation(int num1, int num2) {
        return this.operation.doOperation(num1, num2);
    }

}
