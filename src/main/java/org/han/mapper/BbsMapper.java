package org.han.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.han.vo.BbsVO;

public interface BbsMapper {
	
	@Select("select * from tbl_bbs")
	public String[] getList();
	
	
	@Insert("insert into TBL_BBS values (seq_bbs.nextval, #{title}, #{userid}, #{cont}, sysdate, 0, 0,'')")
	public void setData(BbsVO vo);
}
