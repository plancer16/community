package life.majiang.community.enums;

/**
 * @author plancer16
 * @create 2020-02-12 14:45
 */
public enum NotificationStatusEnum {
    UNREAD(0),READ(1)
    ;

    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}
