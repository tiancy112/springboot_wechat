package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.utils.ResultVOUtil;
import com.example.demo.vo.ResultVO;

/**'
 * 手工获取
 *
 * 1、设置域名
 * 2、获取code(redirect_uri=http://sell.example.com/sell/weixin/auth)
 * 3、换取access_token
 * 2017-07-03 00:50
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    /**
     * 获取openid
     */
    @GetMapping("/auth")
    public ResultVO<?> auth(@RequestParam("code") String code) {
        log.info("进入auth方法。。。");
        log.info("code={}", code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxe8ea5d26ba192b82&secret=wxe8ea5d26ba192b82&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}", response);
        return ResultVOUtil.success(response);
        
    }
}
