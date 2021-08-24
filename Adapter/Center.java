package Adapter;


/**
 * 适配器模式(Adapter)
 * 中锋
 */
public class Center extends AbstractPlayer {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋 " + name + " 进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋 " + name + " 防守");
    }

}