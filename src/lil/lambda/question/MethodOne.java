package lil.lambda.question;

import lil.lambda.demo.Person;

import java.util.List;

/**
 * 描述:
 * 创建方法, 寻找符合条件的会员. 方法指定的条件是硬编码
 *
 * @author lil
 * @create 2018-07-26 下午9:13
 */
public class MethodOne {
    /**
     * 方法只能匹配一种条件, 即年龄大于指定的数字,
     *      若是匹配其他条件, 就需要再新建方法.
     * @param rester
     *      全部会员
     * @param age
     *      指定的年龄
     */
    public static void printPersonOlderThan(List<Person> rester, int age) {
        for (Person person : rester) {
            if (person.getAge() >= age) {
                person.printPerson();
            }
        }
    }
}
