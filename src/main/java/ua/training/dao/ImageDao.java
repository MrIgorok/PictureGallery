package ua.training.dao;

import ua.training.model.Image;

public interface ImageDao {
    Image findById(Long id);
    Image findByName(String name);
    void create(Image image);
    void update(Image image);
    void delete(Long id);
}
