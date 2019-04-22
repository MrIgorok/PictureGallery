package ua.training.model;

public class Image {
    private String base64Image;
    private ImageProperties properties;

    public Image() {

    }

    public Image(String base64Image, ImageProperties properties) {
        this.base64Image = base64Image;
        this.properties = properties;
    }

    public String getBase64Image() {
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }

    public ImageProperties getProperties() {
        return properties;
    }

    public void setProperties(ImageProperties properties) {
        this.properties = properties;
    }
}
