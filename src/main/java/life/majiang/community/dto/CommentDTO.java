package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @author plancer16
 * @create 2020-02-08 19:31
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
