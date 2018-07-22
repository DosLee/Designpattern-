package lil.DesignPatterns.example;

/**
 * 描述:
 * 策略模式: "主题"管理类
 *
 * @author lil
 * @create 2018-07-22 下午9:09
 */
public class ThemeManage {

    private Theme theme;

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public void showTheme() {
        this.theme.showTheme();
    }
}
