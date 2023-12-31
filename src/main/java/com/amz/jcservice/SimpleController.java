package com.amz.jcservice;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController

public class SimpleController {

    private static final String CLIENT_ID_PARAM_NAME = "id";
    private static final String WEB = "index.html";
    @RequestMapping(value = {"/{id}/index"}, // Endpoint to handle GET requests for /{id}/index with id controlled by user
            method = RequestMethod.GET)
    // Create a model map to hold the "id" parameter. Parameter id is extracted from the path as a variable
    public ModelAndView welcome(@PathVariable String id) {
        Map modelMap = new HashMap<>();
        modelMap.put(CLIENT_ID_PARAM_NAME,id);
        ModelAndView modelAndView = new ModelAndView(WEB,modelMap); // Create a ModelAndView object with the "WEB" view and the model map
        return modelAndView;


    }
    @GetMapping("/hello")
    public ModelAndView AtoredPage() {
        return new ModelAndView("index");
    }

}