package com.admin.adminsystem.jpa;

import com.admin.adminsystem.entity.ReferenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ReferenceJPA extends JpaRepository<ReferenceEntity, String> {
}
