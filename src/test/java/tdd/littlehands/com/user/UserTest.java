package tdd.littlehands.com.user;

import org.junit.jupiter.api.Test;
import tdd.littlehands.com.demo_user.DemoUser;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest {
  @Test
  void test_createUser_success() {
    // when: ユーザーネーム(10文字以上)、パスワード(8文字以上)を入力すると
    String userName = "1234567890";
    String password = "12345678";
    User user = new User(userName, password);

    // Then: ユーザーオブジェクトが作られる
    assertThat(user, is(notNullValue()));
    assertThat(user.getUserName(), is(userName));
    assertThat(user.getPassword(), is(password));
  }

  @Test
  void test_createUser_fail_userNameLength() {
    // When: ユーザーネームに9文字以下を入力すると
    String userName = "123456789";
    String password = "12345678";

    // Then: 例外が投げられる
    assertThrows(IllegalArgumentException.class,
        () -> new User(userName, password));
  }


  @Test
  void test_createUser_fail_passwordLength() {
    // When: ユーザーネームに9文字以下を入力すると

    // Then: 例外が投げられる
  }

}
