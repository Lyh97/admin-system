package com.admin.adminsystem.jpa;

import com.admin.adminsystem.entity.ReferenceEntity;
import com.admin.adminsystem.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ReferenceJPA extends JpaRepository<ReferenceEntity, String> {
    @Query(value = "select * from REFERENCE where PARENT= ?1",nativeQuery=true)
    List<ReferenceEntity> findPlatForm(String key);

    @Query(value = "select * from REFERENCE t where t.PARENT= ?1",nativeQuery=true)
    List<ReferenceEntity> findSystem(String key);
}
