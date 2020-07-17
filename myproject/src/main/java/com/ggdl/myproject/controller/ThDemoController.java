package com.ggdl.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
public class ThDemoController {
    @GetMapping(path = {"", "/", "/thIndex"})
    public ModelAndView index() {
        Map<String, Object> data = new HashMap<>();

        data.put("name", "YiHui Thymeleaf");
        data.put("now", LocalDateTime.now().toString());

        return new ModelAndView("admin/thIndex", data);
    }

    /**
     * 一般不建议直接使用jdk的String.split来分割字符串，内部实现是根据正则来处理的，虽然更强大，但在简单的场景下，性能开销更大
     */
    private static String[] contents =
            ("绿蚁浮觞香泛泛，黄花共荐芳辰。\n清霜天宇净无尘。\n登高宜有赋，拈笔戏成文。\n可奈园林摇落尽，悲秋意与谁论。\n眼中相识几番新。\n龙山高会处，落帽定何人。").split("\n");
    private static Random random = new Random();

    @GetMapping(path = "show1")
    public String showOne(Model model) {
        model.addAttribute("title", "临江仙");
        model.addAttribute("content", contents[random.nextInt(6)]);

        return "admin/show1";
    }

    @GetMapping(path = "show2")
    public String showTime(Map<String, Object> data) {
        data.put("name", "Show2---->");
        data.put("now", LocalDateTime.now().toString());

        return "admin/show2";
    }


}
