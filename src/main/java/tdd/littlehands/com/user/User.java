package tdd.littlehands.com.user;

public class User {
  private String userName;
  private String password;

  public User(String userName, String password) {
    validateUserName(userName);
    this.userName = userName;
    this.password = password;
  }

  private void validateUserName(String userName) {
    if (userName.length() <= 9) {
      throw new IllegalArgumentException("");
    }
  }

  public String getUserName() {
    return userName;
  }

  public String getPassword() {
    return password;
  }
}
