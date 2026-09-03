package com.spring_boot_api.luiz_laikovski.repository;

import com.spring_boot_api.luiz_laikovski.entity.PeopleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<PeopleEntity, Long> {
}
