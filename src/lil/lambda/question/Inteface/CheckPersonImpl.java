package lil.lambda.question.Inteface;

import lil.lambda.demo.Person;

/**
 * 描述:
 * 实现CheckPerson
 *
 * @author lil
 * @create 2018-07-26 下午9:52
 */
public class CheckPersonImpl implements CheckPerson {

    /**
     *  假设寻找18-25之间的会员
     * @param person
     * @return
     */
    @Override
    public Boolean test(Person person) {
        return person.getGender() == Person.Sex.MALE &&
                person.getAge() >= 18 && person.getAge() <= 25;
    }
}
