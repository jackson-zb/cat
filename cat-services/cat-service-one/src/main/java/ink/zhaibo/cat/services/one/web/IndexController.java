package ink.zhaibo.cat.services.one.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index/")
public class IndexController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        return "hello,i'am service one";
    }
}
