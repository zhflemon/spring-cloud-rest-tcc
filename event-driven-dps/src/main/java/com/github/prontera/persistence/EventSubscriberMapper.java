package com.github.prontera.persistence;

import org.apache.ibatis.annotations.Param;

import com.github.prontera.MyBatisRepository;
import com.github.prontera.domain.EventSubscriber;
import com.github.prontera.domain.type.EventStatus;

@MyBatisRepository
public interface EventSubscriberMapper extends CrudMapper<EventSubscriber> {

	int updateEventStatusByPrimaryKeyInCasMode(@Param("id") Long id, @Param("expect") EventStatus expect,
			@Param("target") EventStatus target);

}