package lil.DesignPatterns;

/**
 * 描述:
 * 加法
 *
 * @author lil
 * @create 2018-07-22 下午7:08
 */
public class OperationAdd implements Operation{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
