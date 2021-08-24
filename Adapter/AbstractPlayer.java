package Adapter;
/**
 * 适配器模式(Adapter)
 * 球员抽象类
 */
public abstract class AbstractPlayer {
    protected String name;

    public AbstractPlayer(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();

}
