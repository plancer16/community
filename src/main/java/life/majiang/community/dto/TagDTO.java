package life.majiang.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @author plancer16
 * @create 2020-02-11 18:44
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
