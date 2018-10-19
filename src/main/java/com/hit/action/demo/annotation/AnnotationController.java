package com.hit.action.demo.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AnnotationController {

    @RequestMapping("/test")
    public String toIndex(HttpServletRequest request) {
        System.out.println(request.getRequestURL());
        return "index";
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String getJsonString(){
        return "My test spring-mvc";
    }


}
