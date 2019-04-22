package ua.training.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.training.model.Image;

import java.util.Collections;
import java.util.List;

@Service("imageService")
@Transactional
public class ImageService {

    public void add(Image image) {

    }

    public List<Image> findAll() {
        return Collections.emptyList();
    }

    public Image findById(Long id) {
        return new Image();
    }

    public void uploadImages() {

    }
}
