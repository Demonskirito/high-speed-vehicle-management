package com.example.studypractice.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author jojo
 * @since 2024-12-13
 */
@Data
//使用@AllArgsConstructor自动生成有参构造
@AllArgsConstructor
//使用@NoArgsConstructor自动生成无参构造
@NoArgsConstructor
public class Mrecord implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "mid")
    private Integer mid;

    private String cid;

    private Integer beginid;

    private String bdate;

    private Integer endid;

    private String edate;

    private Integer mprice;

    private Integer mstate;

    private String mbackup;

    @TableField(exist = false)
    private String inzname;
    @TableField(exist = false)
    private String outzname;


}
