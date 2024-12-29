package com.example.studypractice.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.studypractice.pojo.Mrecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jojo
 * @since 2024-12-13
 */
@Mapper
public interface MrecordMapper extends BaseMapper<Mrecord> {
	@Select("SELECT m.*,z1.zname inzname, z2.zname outzname FROM mrecord m " +
			" INNER JOIN zhandian z1 ON m.beginid=z1.zid " +
			" LEFT JOIN zhandian z2 ON m.endid=z2.zid ORDER BY mstate desc")
	Page<Mrecord> selectPage(Page p);
}
