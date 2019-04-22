package ua.training.dao;

import ua.training.model.Image;
import ua.training.model.SlideShow;

import java.util.List;

public interface SlideShowDao {
    Image findById(Long id);
    Image findByName(String name);
    List<SlideShow> findAll();
    void create(SlideShow slideShow);
    void update(SlideShow slideShow);
    void delete(Long id);
}
