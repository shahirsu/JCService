package com.amz.jcservice;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    @GetMapping("/page")
    public ModelAndView getPage1() {
        // Create a new ModelAndView object
        ModelAndView modelAndView = new ModelAndView();

        // Set the view name to the JSP file path
        modelAndView.setViewName("image_downloader/hello.jsp");

        // Add any necessary data to the model
        // modelAndView.addObject("attributeName", attributeValue);

        return modelAndView;
    }
}
