package adapter;


/**
 * 适配器模式(DesignPattern.Adapter)
 * 中锋
 */
// 听不懂 要用翻译
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