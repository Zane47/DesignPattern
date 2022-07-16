package strategy;

public class DefaultPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("默认促销策略");
    }
}
