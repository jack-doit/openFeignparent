package com.cc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface MemberService {
    /**
     * 提供我们发布的接口
     *
     * @param userId
     * @return
     */
    @GetMapping("/getUser")
    String getUser(@RequestParam("userId") Integer userId);
}
