package com.amz.jcservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class Index {

    @GetMapping("/")
    public ModelAndView AtoredPage() {
        return new ModelAndView("login");
    }
}
