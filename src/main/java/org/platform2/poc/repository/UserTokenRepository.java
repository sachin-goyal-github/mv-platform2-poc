package org.platform2.poc.repository;

import org.platform2.poc.repository.entity.UserTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UserTokenRepository extends JpaRepository<UserTokenEntity, Long> {
    Set<UserTokenEntity> findByUserId(Long userId );

    UserTokenEntity findByUserToken(String userToken );
}