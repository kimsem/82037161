package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.sax.SAXResult;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/api/v1/user")
    public Map<String, String> getUserNo(HttpServletRequest request) {

        // 사번이 포함된 도메인 네임(ex: [사번].ce-aa.kubepia.net)
        String serverName = request.getServerName();

        // 도메인네임에서 사번만 추출
        String userNo = serverName.split("\\.")[0];

        Map<String, String> response = new HashMap<>();
        response.put("userNo", userNo);
        return response;
    }
}
