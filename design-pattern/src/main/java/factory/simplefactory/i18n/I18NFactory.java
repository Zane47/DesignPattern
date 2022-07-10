package factory.simplefactory.i18n;

public class I18NFactory {

    public static I18N getI18NObject(String area) {
        if (area.equals("China")) {
            return new Chinese();
        } else if (area.equals("English")) {
            return new English();
        } else if (area.equals("Spain")) {
            return new Spainish();
        } else {
            return null;
        }
    }
}
