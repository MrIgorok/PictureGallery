package ua.training.model;

public class ImageDto {
    private String name;
    private byte [] data;

    public ImageDto(String name, byte [] data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public byte[] getData() {
        return data;
    }
}
