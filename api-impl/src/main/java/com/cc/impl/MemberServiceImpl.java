package com.cc.impl;

import com.cc.api.MemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService {


    @Value("${server.port}")
    private String serverPort;

    @Override
    public String getUser(Integer userId) {
        return "我是会员服务" + userId;
    }

}
