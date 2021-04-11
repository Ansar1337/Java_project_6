package com.company.tax_type;

import java.math.BigDecimal;

public class ProgressiveTaxType implements TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.compareTo(new BigDecimal("100000")) <= 0) {
            return amount.multiply(new BigDecimal("0.1"));
        }
        return amount.multiply(new BigDecimal("0.15"));
    }
}