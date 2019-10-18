package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/mypage")
    public String handler(Model model) {
        model.addAttribute("msg", "hihihihi");
        System.out.println("mypage ok");
        return "myPage";
    }

    @RequestMapping("/board")
    public String boarding(Model model) {
        model.addAttribute("msg", " THIS IS POST CONTENTS. THANK YOU");
        System.out.println("board ok");

        return "board";

    }
}
