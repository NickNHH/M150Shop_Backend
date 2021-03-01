package ch.bbw.shop.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FrontController {

    @GetMapping("registrationlink/{token}")
    public String registration(@PathVariable("token") String registrationToken) {
        System.out.println("Token: " + registrationToken);
        return "redirect:" + "/login";
    }

    @GetMapping("login")
    public String loginDummy() {
        return "index";
    }
}
