package ua.training.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.training.model.ImageDto;
import ua.training.model.SlideShow;

import java.util.Collections;
import java.util.List;

@Service("slideShowService")
@Transactional
public class SlideShowService {

    public void create(SlideShow slideShow, ImageDto [] images) {

    }

    public List<SlideShow> findAll() {
        return Collections.emptyList();
    }

    public SlideShow findById(Long id) {
        return new SlideShow();
    }

}
