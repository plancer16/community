package life.majiang.community.dto;

import lombok.Data;

/**
 * @author plancer16
 * @create 2020-02-12 15:39
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
