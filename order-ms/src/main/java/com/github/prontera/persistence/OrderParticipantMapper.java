package com.github.prontera.persistence;

import com.github.prontera.MyBatisRepository;
import com.github.prontera.domain.OrderParticipant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisRepository
public interface OrderParticipantMapper extends CrudMapper<OrderParticipant> {

	List<OrderParticipant> selectByOrderId(@Param("orderId") Long orderId);
}