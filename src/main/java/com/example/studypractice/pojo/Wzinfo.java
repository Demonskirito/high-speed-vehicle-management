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
 * VIEW
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
public class Wzinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String jname;

    private String cid;

    private String cname;

    private String jid;

    private String cpic;

    private String cbackup;

    private String wid;

    private String wcontent;

    private Integer wmoney;

    private Integer wscore;

    private String wbackup;

    private Integer vid;

    private String vtime;

    private String vaddr;

    private Integer vstate;

    //饼型图结果
    private String zname;
    private Integer mprice;

    private String type;
    private int cnt;
}
