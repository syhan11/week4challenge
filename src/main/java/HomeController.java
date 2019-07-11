import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{
    @RequestMapping("/")
    public String Home(){
        return "index";
    }

    @RequestMapping("/bootcamp")
    public String Bootcamp(){
    return "bootcamp";
    }

    @RequestMapping("/authors")
    public String Authors(){
        return "authors";
    }

    @RequestMapping("/github1")
    public String Github1(){
        return "github1";
    }

    @RequestMapping("/github2")
    public String Github2(){
        return "github2";
    }

    @RequestMapping("/design")
    public String Design(){
        return "design";
    }

    @RequestMapping("/algorithms")
    public String Algorithms(){
        return "algorithms";
    }

    @RequestMapping("/corejava1")
    public String CoreJava1(){
        return "corejava1";
    }

    @RequestMapping("/corejava2")
    public String CoreJava2(){
        return "corejava2";
    }

    @RequestMapping("/ooj1")
    public String ooj1(){
        return "ooj1";
    }

    @RequestMapping("/ooj2")
    public String ooj2(){
        return "ooj2";
    }

    @RequestMapping("/html")
    public String html(){
        return "html";
    }

    @RequestMapping("/bootstrap")
    public String bootstrap(){
        return "bootstrap";
    }



}
