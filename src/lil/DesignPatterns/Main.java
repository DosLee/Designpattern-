package lil.DesignPatterns;

/**
 * 描述:
 * 测试类
 *
 * @author lil
 * @create 2018-07-22 下午7:16
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // calculator.setOperation(new OperationAdd());
        calculator.setOperation(new OperationSub());
        int result = calculator.doOperation(1, 2);
        System.out.println(result);
    }
}
