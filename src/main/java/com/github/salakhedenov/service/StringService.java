package com.github.salakhedenov.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.salakhedenov.mapper.StringMapper;

@Service
public class StringService {

	@Resource
	private StringMapper stringMapper;

	@Transactional
	public String getTbName() {
		return stringMapper.getTbName();
	}

}
