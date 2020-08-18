package com.pose.entity;

import com.pose.core.ITableNames;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;

/**
 * @author nileshkumar
 */
@Data
@Table(ITableNames.TN_POCKET_ITEM)
public class EPocketItem {
    @Id
    Long id;
    String givenTitle;
    String givenUrl;
    String status;
    Set<EUserRef> eUserIds;

    public EPocketItem(Long id, String givenTitle, String givenUrl, String status) {
        this.id = id;
        this.givenTitle = givenTitle;
        this.givenUrl = givenUrl;
        this.status = status;
    }

    public EPocketItem(String givenTitle, String givenUrl, String status) {
        this.givenTitle = givenTitle;
        this.givenUrl = givenUrl;
        this.status = status;
    }

    void addUser(@org.jetbrains.annotations.NotNull EUser eUser) {
        this.eUserIds.add(new EUserRef(eUser.getId()));
    }
}
