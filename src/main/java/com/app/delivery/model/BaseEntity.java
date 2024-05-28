package com.app.delivery.model;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @CreatedBy
    @Column(updatable = false)
    public String createdBy;
    @CreatedDate
    @Column(updatable = false)
    public LocalDateTime createdAt;

    @LastModifiedBy
    @Column(insertable = false)
    public String updatedBy;

    @LastModifiedDate
    @Column(insertable = false)
    public LocalDateTime updatedAt;


}
