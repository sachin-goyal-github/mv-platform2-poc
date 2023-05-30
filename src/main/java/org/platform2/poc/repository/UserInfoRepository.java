package org.platform2.poc.repository;

import org.platform2.poc.repository.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long> {
    UserInfoEntity findByEmail(String email );
}