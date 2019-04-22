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
public class SlideShowListController {
    private SlideShowService slideShowService;

    @Autowired
    public SlideShowListController(SlideShowService slideShowService) {
        this.slideShowService = slideShowService;
    }

    @RequestMapping(value = "/slide-show/list", method = RequestMethod.GET)
    public ModelAndView showSlideShows(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("slide-show/list");
        modelAndView.addObject("slideShows", slideShowService.findAll());

        return modelAndView;
    }
}
