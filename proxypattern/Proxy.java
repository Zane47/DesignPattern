package DesignPattern.proxypattern;

/**
 * 代理模式(Proxy)
 * 代理类
 */
// 代理也去实现“送礼物”的接口
public class Proxy implements GiveGift {

    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }


    // 在实现方法的时候调用“追求者类”的相关方法
    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }

}
