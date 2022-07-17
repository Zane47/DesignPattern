package imocc.behavioral.strategy;

public class Test {

    /**
     * 策略模式的初级应用
     */
    /*public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }*/

    /**
     * 单策略模式, 还是无法消除ifelse -> 策略模式 + 工厂模式
     */
    /*public static void main(String[] args) {
        PromotionActivity promotionActivity = null;
        String promotionKey = "lijian";
        if ("lijian".equalsIgnoreCase(promotionKey)) {
            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
        } else if ("fanxian".equalsIgnoreCase(promotionKey)) {
            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
        }// ....
        promotionActivity.executePromotionStrategy();
    }*/

    /**
     * 策略模式+工厂模式
     */
    public static void main(String[] args) {
        String promotionKey = "lijian";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotion(promotionKey));
        promotionActivity.executePromotionStrategy();
    }

}
