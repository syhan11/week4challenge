import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Home(){
        return "/index";
    }

    @RequestMapping("/bootcamp")
    public String Bootcamp(){
    return"/bootcamp";
    }

    @RequestMapping("/authors")
    public String Authors(){
        return"/authors";
    }

}
