package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * Created by LaunchCode
 */
@Controller
public class HomeController extends TechJobsController {

    @RequestMapping(value = "")
    public String index() {

//        HashMap<String, String> actionChoices = new HashMap<>();
//        actions.put("search", "Search");
//        actions.put("list", "List");

//        model.addAttribute("actions", actionChoices);

        return "index";
    }

}
