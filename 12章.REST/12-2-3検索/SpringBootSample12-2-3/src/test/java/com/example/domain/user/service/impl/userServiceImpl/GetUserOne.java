package com.example.domain.user.service.impl.userServiceImpl;

import com.example.domain.user.model.Department;
import com.example.domain.user.model.MUser;
import com.example.domain.user.service.UserService;
import com.example.repository.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Date;

public class GetUserOne {

    @InjectMocks
    UserService userService;

    @Mock
    UserMapper userMapper;

    @InjectMocks
    MUser mUser;

    @Test
    public void test1() {
        MUser mUser = new MUser();
        mUser.setUserId("1");
        mUser.setPassword("");
        mUser.setUserName("テスト太郎");
        mUser.setBirthday(new Date());
        mUser.setAge(18);
        mUser.setGender(1);
        mUser.setDepartmentId(1);
        mUser.setRole("");
        mUser.setDepartment(new Department());
        mUser.setSalaryList(new ArrayList<>());

        Mockito.doReturn(mUser).when(userMapper).findOne("1");
        Assertions.assertEquals(1, userService.getUserOne("1"));
    }

    @Test
    public void hoge() {
        Mockito.when(userService.getUserOne("1"));
    }
}
