package com.github.prontera.persistence;

import com.github.prontera.MyBatisRepository;
import com.github.prontera.domain.UserBalanceTcc;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

@MyBatisRepository
public interface UserBalanceTccMapper extends CrudMapper<UserBalanceTcc> {
	Set<UserBalanceTcc> selectExpireReservation(@Param("limitation") int limitation);

	int deleteTryingById(@Param("id") Long id);

	int updateToConfirmationById(@Param("id") Long id);
}