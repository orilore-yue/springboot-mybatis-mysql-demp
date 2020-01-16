package com.orilore.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.orilore.mapper.KindMapper;
import com.orilore.model.Kind;

@Service
public class KindService implements IKindService{
	@Resource
	private KindMapper mapper;
	@Override
	public List<Kind> find() {
		return mapper.select();
	}
}
