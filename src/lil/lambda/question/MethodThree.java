package lil.lambda.question;

import lil.lambda.demo.Person;
import lil.lambda.question.Inteface.CheckPerson;
import lil.lambda.question.Inteface.CheckPersonImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 在独立类中定义筛选会员的条件
 *
 * @author lil
 * @create 2018-07-26 下午9:47
 */
public class MethodThree {
    /**
     * tester是接口类型, 它的实现类实现了筛选条件, 如果返回True, 表名符合条件.
     *      后期维护只修改筛选条件, 不需要改变printPerson方法,
     *      但是, 需要维护着一个接口和实现类, 依旧麻烦, 或许应该使用匿名类.∑
     * @param roster
     *      全部会员
     * @param tester
     *      筛选条件
     */
    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person person : roster) {
            if (tester.test(person)) {
                person.printPerson();
            }
        }
    }

    public static void EnterPrintPerson() {
        List<Person> roster = new ArrayList<>();

        // 完成方法调用
        printPersons(roster, new CheckPersonImpl());
    }
}
