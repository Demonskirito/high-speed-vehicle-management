package com.example.studypractice.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.studypractice.pojo.Wzinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * VIEW Mapper 接口
 * </p>
 *
 * @author jojo
 * @since 2024-12-13
 */
@Mapper
public interface WzinfoMapper extends BaseMapper<Wzinfo> {
	List<Wzinfo> selectMonth();  //线型

	@Select("SELECT zname, SUM(mprice) mprice FROM mrecord r,zhandian z " +
			"WHERE mstate=0 AND YEAR(edate)=YEAR(NOW()) AND r.endid=z.zid " +
			"GROUP BY zname ORDER BY SUM(mprice) DESC LIMIT 10")
	List<Wzinfo> selectZhan();	//饼型

	@Select(" SELECT wz.wcontent type, COUNT(v.vid) cnt " +
			" FROM vrecord v JOIN wzitem wz ON v.wid = wz.wid WHERE YEAR(v.vtime) = YEAR(NOW()) AND v.vstate = 1 " +
			" GROUP BY wz.wcontent order by cnt desc")
	List<Wzinfo> selectWzitem();	//柱型
}
