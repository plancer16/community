package life.majiang.community.dto;

import lombok.Data;

/**
 * @author plancer16
 * @create 2020-02-05 19:32
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
