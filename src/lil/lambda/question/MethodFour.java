package lil.lambda.question;


import lil.lambda.demo.Person;
import lil.lambda.question.Inteface.CheckPerson;

import java.util.ArrayList;
import java.util.List;

import static lil.lambda.question.MethodThree.printPersons;

/**
 * 描述:
 * 在匿名类中定义筛选会员的条件
 *
 * @author lil
 * @create 2018-07-26 下午10:00
 */
public class MethodFour {

    public static void printPersonsAnonymous() {

        List<Person> roster = new ArrayList<>();

        /**
         * 有效的减少了代码量, 不需要再独立的实现类中定义筛选会员方法
         *      但, 这并不完美, 仅仅只实现了一个抽象方法,
         *      而且相比下一个方法代码也太多了.
         */
        printPersons(roster, new CheckPerson() {
            @Override
            public Boolean test(Person person) {
                return person.getGender() == Person.Sex.MALE &&
                        person.getAge() >= 18 && person.getAge() <= 25;
            }
        });
    }
}
