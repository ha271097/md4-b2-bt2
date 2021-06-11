package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CaculatorSerivce;

@Controller
//@RequestMapping("/caculator")
public class CaculatorController {
    CaculatorSerivce serivce = new CaculatorSerivce();
    @GetMapping("/home")
    public String toHome(){
        return "/home";
    }
    @PostMapping("/home")
    public ModelAndView caculatorOperator(String vl1, String vl2, String operation){
        ModelAndView mav = new ModelAndView("/home");
        mav.addObject("result", serivce.result(vl1, vl2, operation));
    return mav;
    }
}
