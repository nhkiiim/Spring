package com.spring.notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoticeController {

    @GetMapping("/notice")
    public String main(Model model){
        model.addAttribute("name","안녕하세요, 김나현입니다. ^0^");
        return "notice";
    }

}
