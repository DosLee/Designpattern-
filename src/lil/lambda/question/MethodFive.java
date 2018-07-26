package lil.lambda.question;

import lil.lambda.demo.Person;

import java.util.ArrayList;
import java.util.List;

import static lil.lambda.question.MethodThree.printPersons;

/**
 * 描述:
 * 使用Lambda表达式
 *
 * @author lil
 * @create 2018-07-26 下午10:27
 */
public class MethodFive {


    public static void printPersonsLambda() {
        List<Person> roster = new ArrayList<>();
        printPersons(roster, person -> person.getGender() == Person.Sex.MALE &&
                person.getAge() >= 18 && person.getAge() <= 25);
    }
}
