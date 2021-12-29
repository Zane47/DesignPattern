package DesignPattern.factory.simplefactory.i18n;

/**
 * 入口类
 */
public class Software {
    public static void main(String[] args) {
        I18N china = I18NFactory.getI18NObject("China");
        System.out.println(china.getTitle());
    }
}
