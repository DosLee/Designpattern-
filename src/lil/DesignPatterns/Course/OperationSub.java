package lil.DesignPatterns.Course;

/**
 * 描述:
 * 减法
 *
 * @author lil
 * @create 2018-07-22 下午7:11
 */
public class OperationSub implements Operation{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
