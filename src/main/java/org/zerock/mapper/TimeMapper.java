package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	//SELECT sysdate From dual ;
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	//MyBatis의 XML형식으로 처리할 getTime2() 메서드를 선언함
	public String getTime2();
}
