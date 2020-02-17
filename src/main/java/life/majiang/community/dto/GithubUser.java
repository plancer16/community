package life.majiang.community.dto;

import lombok.Data;

/**
 * @author plancer16
 * @create 2020-01-15 11:39
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
