package ua.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.training.model.Image;
import ua.training.service.ImageService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ImageAddController {
    private ImageService imageService;

    @Autowired
    public ImageAddController(ImageService imageService) {
        this.imageService = imageService;
    }

    @RequestMapping(value = "/image/add", method = RequestMethod.GET)
    public ModelAndView addImage(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("image/add");
        modelAndView.addObject("image", new Image());

        return modelAndView;
    }

    @RequestMapping(value = "/image/addProcess", method = RequestMethod.POST)
    public ModelAndView processAddImage(HttpServletRequest request, HttpServletResponse response,
                                     @ModelAttribute("image") Image image) {
        imageService.add(image);

        return new ModelAndView("created", "image", image.getProperties().getName());
    }
}
