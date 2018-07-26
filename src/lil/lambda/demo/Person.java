package lil.lambda.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * 描述:
 * 会员实体类
 *
 * @author lil
 * @create 2018-07-26 下午9:02
 */

@Data
public class Person {
    // 性别枚举
    public enum Sex {
        MALE, FEMALE
    }

    /* 姓名 */
    private String name;
    /* 生日 */
    private LocalDate birthday;
    /* 性别 */
    private Sex gender;
    /* 邮件地址 */
    private String emailAddress;
    /* 年龄 */
    private Integer age;

    public void printPerson() {
        // 打印会员信息
    }
}
