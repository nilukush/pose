package com.pose.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table()
public class EUserRef {
    Long userId;

    public EUserRef(Long id) {
        this.userId = id;
    }
}
