package com.company.tax_type;

import java.math.BigDecimal;

public class IncomeTaxType implements TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(new BigDecimal("0.13"));
    }
}