package com.mall.parking.card.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.mall.parking.card.entity.MemberCard;
import com.mall.parking.card.mapper.MemberCardMapper;
import com.mall.parking.card.service.MemberCardService;
import com.mall.parking.common.exception.BusinessException;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 公众号：歪脖贰点零 , See more at : https://xiaozhuanlan.com/msa-practice
 *
 */
@Service
@Slf4j
public class MemberCardServiceImpl implements MemberCardService {

	
	@Autowired
	MemberCardMapper cardMapper;

	@Override
	public int addMemberCard(String json) throws BusinessException {
		MemberCard card = JSONObject.parseObject(json,MemberCard.class);
		log.debug("");
		return cardMapper.insertSelective(card);
	}
}
