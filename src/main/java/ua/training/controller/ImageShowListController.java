package ua.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.training.service.ImageService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImageShowListController {
    private ImageService imageService;

    @Autowired
    public ImageShowListController(ImageService imageService) {
        this.imageService = imageService;
    }

    @RequestMapping(value = "/image/list", method = RequestMethod.GET)
    public ModelAndView showList(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("image/list");
        modelAndView.addObject("images", imageService.findAll());

        return modelAndView;
    }

}
