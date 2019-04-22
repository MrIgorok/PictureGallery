package ua.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.training.service.SlideShowService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SlideShowPlayController {
    private SlideShowService slideShowService;

    @Autowired
    public SlideShowPlayController(SlideShowService slideShowService) {
        this.slideShowService = slideShowService;
    }

    @RequestMapping(value = "/slide-show/play/{id}", method = RequestMethod.GET)
    public ModelAndView playSlideShow(HttpServletRequest request, HttpServletResponse response,
                                      @PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("slide-show", slideShowService.findById(id));

        return modelAndView;
    }
}
