package imocc.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {


    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.lijian, new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.fanxian, new FanXianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.cuxiao, new ManJianPromotionStrategy());
    }

    private PromotionStrategyFactory() {

    }

    private static final PromotionStrategy DEFAULT_PROMOTION = new DefaultPromotionStrategy();

    public static PromotionStrategy getPromotion(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        // return promotionStrategy == new DefaultPromotionStrategy() ? null : promotionStrategy;
         return promotionStrategy == null ? DEFAULT_PROMOTION : promotionStrategy;
    }

    /**
     * 声明常量的时候, 逻辑分组的作用
     */
    private interface PromotionKey {
        final String lijian = "lijian";
        String fanxian = "fanxian";
        String cuxiao = "cuxiao";
    }

}
