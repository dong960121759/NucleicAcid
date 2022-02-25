package com.julong.nucleicacid.entity;

import com.julong.nucleicacid.model.GetPaybillfeeOutSet;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @className: UnChrgRecipeBillFO
 * @Description: TODO
 * @author: cxd
 * @date: 2022/2/25 11:58
 */
@Data
public class UnChrgRecipeBillFO {
    private  Long encounterid;
    List<String> recipeids;
    List<GetPaybillfeeOutSet> getPaybillfeeOutSets;
    private BigDecimal totalPayAmout;
}
