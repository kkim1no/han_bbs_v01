package org.han.mapper;

<<<<<<< HEAD
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
=======
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
>>>>>>> a7b933850419c765e92cdf9883138f6190cf8635
import org.han.vo.BbsVO;

public interface BbsMapper {
	
<<<<<<< HEAD
	@Select("select * from tbl_bbs")
	public String[] getList();
	
	
	@Insert("insert into TBL_BBS values (seq_bbs.nextval, #{title}, #{userid}, #{cont}, sysdate, 0, 0,'')")
	public void setData(BbsVO vo);
=======
	@Insert("insert into tbl_bbs (bno, title, userid, cont)"+
			" values(seq_bbs.nextval, #{title}, #{userid}, #{cont})")
	public void create(BbsVO vo);
	
	@Select("select * from tbl_bbs where bno=#{bno} order by bno desc")
	public BbsVO read(String bno);

	@Update("update tbl_bbs set title=#{title} where bno=#{bno}")
	public void update(BbsVO vo);
	
	@Delete("delete from tbl_bbs where bno=#{bno}")
	public void delete(String bno);
	
	@Select("select * from tbl_bbs where bno=#{bno} order by bno desc")
	public List<BbsVO> list(String page);
	
>>>>>>> a7b933850419c765e92cdf9883138f6190cf8635
}
