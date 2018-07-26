package lil.lambda.question.Inteface;

import lil.lambda.demo.Person;

/**
 * 描述:
 * 筛选条件
 *
 * @author lil
 * @create 2018-07-26 下午9:50
 */
public interface CheckPerson {

    // 定义接口, 让实现类玩成条件
    Boolean test(Person person);
}
