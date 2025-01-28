package com.xworkz.xworkmodule.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;
@Data
@MappedSuperclass
@NoArgsConstructor
public class AbstractAuditEntity implements Serializable {

    private String createdBy;
    private String updatedBy;
    @Column(name="created_date")
    private LocalDateTime createdDate = LocalDateTime.now();
    @Column(name="updated_date")
    private LocalDateTime updatedDate = LocalDateTime.now();



}
