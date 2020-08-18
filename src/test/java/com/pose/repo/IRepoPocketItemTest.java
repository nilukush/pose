package com.pose.repo;

import com.pose.entity.EPocketItem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@DataJdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class IRepoPocketItemTest {
    @Autowired
    IRepoPocketItem iRepoPocketItem;

    @Test
    @Transactional
    @Rollback(false)
    public void testSaveEPocketItem() {
        String title = "title";
        String url = "url";
        String status = "status";
        iRepoPocketItem.save(new EPocketItem(title, url, status));
    }
}