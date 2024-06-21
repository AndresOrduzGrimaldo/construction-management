package com.construction.unit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.construction.unit.model.Unit;

public interface UnitRepository extends JpaRepository<Unit, Long> {
}
