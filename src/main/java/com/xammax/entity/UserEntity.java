package com.xammax.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sys_users")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unique_id")
    private Long uniqueId;
    @Column(name = "is_deleted")
    private Boolean isDeleted = false;

    @Column(name = "is_relevant")
    private Boolean isRelevant = true;

    @Column(name = "created_timestamp")
    @CreationTimestamp
    private LocalDateTime createdTimestamp;

    @Column(name = "name")
    private String name;

}
