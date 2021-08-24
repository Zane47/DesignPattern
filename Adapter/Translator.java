package Adapter;

/**
 * 适配器模式(Adapter)
 * 翻译者
 */
public class Translator extends AbstractPlayer {

    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }

}

