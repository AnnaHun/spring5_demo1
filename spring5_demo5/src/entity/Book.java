package entity;

/**
 * Created by Intellij IDEA.
 *
 * @author ZhuZhaoMing
 * @Description
 * @date 2021/8/30-12:14 下午
 * @motto: Never say die Never give up
 */
public class Book {
    private String userId;
    private String userName;
    private String uStatus;

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getuStatus() {
        return uStatus;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setuStatus(String uStatus) {
        this.uStatus = uStatus;
    }
}
