package com.amz.jcservice;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SimpleController {

    private static final String CLIENT_ID_PARAM_NAME = "id";
    private static final String WEB = "/image_downloader/index.html";

    @RequestMapping(value = "/{id}/index", method = RequestMethod.GET)
    public ModelAndView welcome(@PathVariable String id) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put(CLIENT_ID_PARAM_NAME, id);
        ModelAndView modelAndView = new ModelAndView(WEB, modelMap);
        return modelAndView;
    }
}
