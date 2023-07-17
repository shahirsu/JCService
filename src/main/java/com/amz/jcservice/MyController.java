package com.amz.jcservice;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {

    @GetMapping("/")
    @ResponseBody
    public Resource getPage() {
        // Path to the HTML file relative to the "resources" folder
        String filePath = "image_downloader/index.html";

        // Load the HTML file as a resource
        Resource resource = new ClassPathResource(filePath);

        return resource;

    }
}
