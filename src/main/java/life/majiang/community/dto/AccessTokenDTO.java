package life.majiang.community.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author plancer16
 * @create 2020-01-15 9:37
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
