package com.oldataraxia.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ??Ʒ???ۻظ???ϵ
 * 
 * @author oldataraxia
 * @email aqwanghaoxuan@163.com
 * @date 2021-10-17 16:59:02
 */
@Data
@TableName("pms_comment_replay")
public class CommentReplayEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ????id
	 */
	private Long commentId;
	/**
	 * ?ظ?id
	 */
	private Long replyId;

}
