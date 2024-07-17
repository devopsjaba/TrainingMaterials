package kr.co.kosta.mysql2;

/*
	userid		varchar(50)		primary key,
    username	varchar(50)		not null,
    userpassword	varchar(50)	not null,
    userage		numeric(3)		not null,
    useremail	varchar(50)		not null
 */
public class User {
    private String userId;
    private String userName;
    private String userPassword;
    private int userAge;
    private String userEmail;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userAge=" + userAge +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
