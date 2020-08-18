package com.pose.repo;

import com.pose.entity.EPocketItem;
import org.springframework.data.repository.CrudRepository;

/**
 * @author nileshkumar
 */
public interface IRepoPocketItem extends CrudRepository<EPocketItem, Long> {
}
