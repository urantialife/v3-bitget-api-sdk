package com.bitget.openapi.dto.request.mix;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Data
public class MixModifyPlanRequest implements Serializable {

    /**
     * 合约交易对
     */
    private String symbol;
    /**
     * 保证金币种
     */
    private String marginCoin;

    private String orderId;

    private BigDecimal executePrice;

    private BigDecimal triggerPrice;

    private String triggerType;

    private String orderType;
}
