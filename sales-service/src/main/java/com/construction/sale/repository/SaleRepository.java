package com.construction.sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.construction.sale.model.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
