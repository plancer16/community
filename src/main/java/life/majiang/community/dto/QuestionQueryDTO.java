package life.majiang.community.dto;

import lombok.Data;

/**
 * @author plancer16
 * @create 2020-02-16 10:58
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
