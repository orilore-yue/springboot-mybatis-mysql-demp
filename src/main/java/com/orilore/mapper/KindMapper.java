package com.orilore.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.orilore.model.Kind;

@Mapper
public interface KindMapper {
	public List<Kind> select();
}
