package com.construction.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.construction.common.model.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
