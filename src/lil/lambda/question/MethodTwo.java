package lil.lambda.question;

import lil.lambda.demo.Person;

import java.util.List;

/**
 * 描述:
 * 创建一个适应性更好的方法, 去找符合条件的会员
 *
 * @author lil
 * @create 2018-07-26 下午9:32
 */
public class MethodTwo {
    /**
     * 比起第一个, 这个适应性多一点, 但问题是,
     *      若要以性别为筛选条件呢, 更改Person数据结构呢?
     * @param roster
     *      全部会员
     * @param low
     *      最低年龄
     * @param high
     *      最大年龄
     */
    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person person : roster) {
            if (low <= person.getAge() && person.getAge() < high) {
                person.printPerson();
            }
        }
    }
}
