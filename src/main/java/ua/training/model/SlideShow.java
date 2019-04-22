package ua.training.model;

import java.util.List;

public class SlideShow {
    private Long id;
    private String name;
    private List<Image> slides;
    private double speed = 1.0;

    public SlideShow() {

    }

    public SlideShow(List<Image> slides) {
        this.slides = slides;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Image> getSlides() {
        return slides;
    }

    public void setSlides(List<Image> slides) {
        this.slides = slides;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Image getPresentation() {
        return slides.get(0);
    }

    public int numberOfImages() {
        return slides.size();
    }

    public long getSize() {
        long resultSize = 0;

        for (Image image : slides) {
            resultSize += image.getProperties().getSize();
        }

        return resultSize;
    }
}
