package com.company.tax_type;

import java.math.BigDecimal;

public interface TaxType {
    BigDecimal calculateTaxFor(BigDecimal amount);
}