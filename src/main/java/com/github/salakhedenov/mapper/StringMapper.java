package com.github.salakhedenov.mapper;

import org.apache.ibatis.annotations.Select;

public interface StringMapper {

	@Select("select name from string where id=1")
	public String getTbName();

}
