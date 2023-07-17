package com.amz.jcservice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private static final String CLIENT_ID_PARAM_NAME = "id";
    private static final String WEB = "/image_downloader/index.html";

    @GetMapping("/{id}/index")
    public String welcome(@PathVariable String id, Model model) {
        model.addAttribute(CLIENT_ID_PARAM_NAME, id);
        return WEB;
    }
}

