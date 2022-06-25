package com.thymeleaftemplate.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SampleController {

    @RequestMapping("/")
    public String mainView() {
        return "index";
    }

//    @RequestMapping("/test")
//    public String getMessage(Model model) {
//        model.addAttribute("testSTR", "타임리프 사용하세요.");
//        return "testView";
//    }

    @RequestMapping(value = {"/test"}, method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView("testView");
        mav.addObject("testSTR", "test Thymeleaf");
        return mav;
    }
}
