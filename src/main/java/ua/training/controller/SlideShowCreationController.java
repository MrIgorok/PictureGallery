package ua.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import ua.training.model.Image;
import ua.training.model.ImageDto;
import ua.training.model.SlideShow;
import ua.training.service.SlideShowService;
import ua.training.util.exception.FileUploadException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class SlideShowCreationController {

    private SlideShowService slideShowService;

    @Autowired
    public SlideShowCreationController(SlideShowService slideShowService) {
        this.slideShowService = slideShowService;
    }

    @RequestMapping(value = "/slide-show/create", method = RequestMethod.GET)
    public ModelAndView showCreator(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("slide-show/create");
        modelAndView.addObject("slideShow", new SlideShow());

        return modelAndView;
    }

    @RequestMapping(value = "/slide-show/createProcess", method = RequestMethod.POST)
    public ModelAndView addSlideShow(HttpServletRequest request, HttpServletResponse response,
                                     @ModelAttribute("slideShow") SlideShow slideShow,
                                     @RequestParam("name") String [] names, @RequestParam("file") MultipartFile [] files) {
        ModelAndView modelAndView = new ModelAndView("created", "slideShow", slideShow.getName());
        ImageDto[] images;

        if (files.length != names.length) {
            // TODO: Handle this
            return modelAndView;
        }

        images = new ImageDto[files.length];
        for (int i = 0; i < files.length; i++) {
            try {
                images[i] = createImageDto(names[i], files[i]);
            } catch (FileUploadException e) {
                // TODO: message + Log this
                System.err.println(e.getMessage());
            }
        }

        slideShowService.create(slideShow, images);

        return modelAndView;
    }


    private ImageDto createImageDto(String name, MultipartFile file) throws FileUploadException {
        ImageDto image;
        try {
            image = new ImageDto(name, file.getBytes());
        } catch (IOException e) {
            throw new FileUploadException("Can't upload file: " + name, e);
        }

        return image;
    }
}
