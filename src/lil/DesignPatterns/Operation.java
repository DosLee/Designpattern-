package lil.DesignPatterns;

/**
 * 一般情况下我们是将一种行为写成一个类方法，比如计算器类中有加、减、乘、除四种方法，
 * 而策略模式则是将每一种算法都写成一个类，然后动态的选择使用哪一个算法。
 */
public interface Operation {
    int doOperation(int num1, int num2);
}
