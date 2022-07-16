package strategy;

/**
 * Created by geely
 */
public class Test {

    /**
     * 普通方法
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

}
