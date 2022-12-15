package com.cc.impl;

import com.cc.openfeign.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ServiceImpl {
    @Autowired
    private MemberService memberService;

    /**
     * 基于我们的fegin客户端形式实现rpc远程调用
     *
     * @return
     */
    @RequestMapping("/orderFeignToMember")
    public String orderFeignToMember() {
        String result = memberService.getUser(1);
        return "我是订单服务调用会员服务的接口,返回结果" + result;
    }
}
