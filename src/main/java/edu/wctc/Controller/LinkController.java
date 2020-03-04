package edu.wctc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/snacks")
public class LinkController {


        @RequestMapping("/home")
        public String showHome()
        {
            return "index";
        }

        @RequestMapping("/item")
        public String showDetail()
        {
            return "detail";
        }

        @RequestMapping("/search")
        public String showFacilitator()
        {
            return "search2";
        }

        @RequestMapping("/list")
        public String showList()
        {
            return "list2";
        }

        @RequestMapping("/login")
        public String showLogin()
        {
            return "login";
        }



}
