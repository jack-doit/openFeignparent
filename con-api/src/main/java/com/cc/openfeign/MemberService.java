package com.cc.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("mayikt-member")
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
