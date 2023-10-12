package com.mirae.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
//@RequestMapping("/")
public class MainController {

    @GetMapping("/terms/doc1")
    public ModelAndView doc1() {
        ModelAndView mav = new ModelAndView("tiles/terms/doc1");
        return mav;
    }

    @GetMapping("/terms/doc2")
    public ModelAndView doc2() {
        ModelAndView mav = new ModelAndView("tiles/terms/doc2");
        return mav;
    }

    @GetMapping("/terms/doc3")
    public ModelAndView doc3() {
        ModelAndView mav = new ModelAndView("tiles/terms/doc3");
        return mav;
    }

    @GetMapping("/terms/doc4")
    public ModelAndView doc4() {
        ModelAndView mav = new ModelAndView("tiles/terms/doc4");
        return mav;
    }

    @GetMapping("/terms/doc5")
    public ModelAndView doc5() {
        ModelAndView mav = new ModelAndView("tiles/terms/doc5");
        return mav;
    }

    @GetMapping("/terms/doc6")
    public ModelAndView doc6() {
        ModelAndView mav = new ModelAndView("tiles/terms/doc6");
        return mav;
    }

    @GetMapping("/terms/doc7")
    public ModelAndView doc7() {
        ModelAndView mav = new ModelAndView("tiles/terms/doc7");
        return mav;
    }

    @GetMapping("/terms/doc8")
    public ModelAndView doc8() {
        ModelAndView mav = new ModelAndView("tiles/terms/doc8");
        return mav;
    }

    @GetMapping("/terms/doc9")
    public ModelAndView doc9() {
        ModelAndView mav = new ModelAndView("tiles/terms/doc9");
        return mav;
    }

    @GetMapping("/terms/doc10")
    public ModelAndView doc10() {
        ModelAndView mav = new ModelAndView("tiles/terms/doc10");
        return mav;
    }

    @GetMapping("/product/webview")
    public ModelAndView productWebView() {
        ModelAndView mav = new ModelAndView("tiles/product/webview");
        return mav;
    }

    @GetMapping("/magazine/webview")
    public ModelAndView magazineWebView() {
        ModelAndView mav = new ModelAndView("tiles/magazine/webview");
        return mav;
    }

}
