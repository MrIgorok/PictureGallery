package ua.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.training.service.SlideShowService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeMenuController {
    private SlideShowService slideShowService;

    @Autowired
    public HomeMenuController(SlideShowService slideShowService) {
        this.slideShowService = slideShowService;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView showHomeMenu(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("slideShowList", slideShowService.findAll());
        return modelAndView;
    }

}
