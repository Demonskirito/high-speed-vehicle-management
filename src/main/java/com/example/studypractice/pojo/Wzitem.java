package com.example.studypractice.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Wzitem implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "wid")
    private String wid;

    private String wcontent;

    private Integer wmoney;

    private Integer wscore;

    private String wbackup;


}
