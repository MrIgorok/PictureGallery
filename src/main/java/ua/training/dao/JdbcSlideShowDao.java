package ua.training.dao;

import org.springframework.beans.factory.annotation.Autowired;
import ua.training.model.Image;
import ua.training.model.SlideShow;

import javax.sql.DataSource;
import java.util.List;

public class JdbcSlideShowDao implements SlideShowDao {
    private DataSource dataSource;

    @Autowired
    public JdbcSlideShowDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Image findById(Long id) {
        return null;
    }

    @Override
    public Image findByName(String name) {
        return null;
    }

    @Override
    public List<SlideShow> findAll() {
        return null;
    }

    @Override
    public void create(SlideShow slideShow) {

    }

    @Override
    public void update(SlideShow slideShow) {

    }

    @Override
    public void delete(Long id) {

    }
}
