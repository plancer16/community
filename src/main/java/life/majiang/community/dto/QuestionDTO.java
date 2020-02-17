package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * @author plancer16
 * @create 2020-01-18 13:55
 */
@Data
public class QuestionDTO {

    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}

