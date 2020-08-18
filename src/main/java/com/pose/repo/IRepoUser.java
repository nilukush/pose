package com.pose.repo;

import com.pose.entity.EUser;
import org.springframework.data.repository.CrudRepository;

/**
 * @author nileshkumar
 */
public interface IRepoUser extends CrudRepository<EUser, Long> {
}
