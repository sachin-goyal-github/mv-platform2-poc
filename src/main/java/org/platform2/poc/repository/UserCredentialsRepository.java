package org.platform2.poc.repository;

import org.platform2.poc.repository.entity.UserCredentialsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialsRepository extends JpaRepository<UserCredentialsEntity, Long> {
    UserCredentialsEntity findByUserId(Long userId );
}