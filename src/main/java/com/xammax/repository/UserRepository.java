package com.xammax.repository;

import com.xammax.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    List<UserEntity> findAllBy();

    @Query(value = "SELECT u FROM UserEntity u WHERE u.uniqueId = :id")
    UserEntity getFirstValueTest(Long id);
}
