package com.pose.entity;

import com.pose.core.ITableNames;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(ITableNames.TN_USER)
public class EUser {
    @Id
    Long id;
    String username;
    String accessToken;

    EUser(Long id, String username, String accessToken) {
        this.id = id;
        this.username = username;
        this.accessToken = accessToken;
    }
}
