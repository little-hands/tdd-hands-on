package tdd.littlehands.com.user;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest {
  @Test
  void test_createUser_success() {
    // when: ユーザーネーム(10文字以上)、パスワード(8文字以上)を入力すると

    // Then: ユーザーオブジェクトが作られる
  }

  @Test
  void test_createUser_fail_userNameLength() {
    // When: ユーザーネームに9文字以下を入力すると

    // Then: 例外が投げられる
  }


  @Test
  void test_createUser_fail_passwordLength() {
    // When: ユーザーネームに9文字以下を入力すると

    // Then: 例外が投げられる
  }

}
