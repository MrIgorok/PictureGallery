package ua.training.dao;

import org.springframework.beans.factory.annotation.Autowired;
import ua.training.model.Image;

import javax.sql.DataSource;

public class JdbcImageDao implements ImageDao {
    private DataSource dataSource;

    @Autowired
    public JdbcImageDao(DataSource dataSource) {
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
    public void create(Image image) {

    }

    @Override
    public void update(Image image) {

    }

    @Override
    public void delete(Long id) {

    }
}
