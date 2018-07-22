package lil.DesignPatterns.example;

/**
 * 描述:
 * 测试"主题类"
 *
 * @author lil
 * @create 2018-07-22 下午9:16
 */
public class Main {
    public static void main(String[] args) {
        ThemeManage themeManage = new ThemeManage();
        themeManage.setTheme(new DefaltTheme());
        themeManage.showTheme();
    }
}
