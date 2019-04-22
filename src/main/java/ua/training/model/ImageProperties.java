package ua.training.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @version 1.0 20 Apr 2019
 * @author  Igor Klapatnjuk
 */
public class ImageProperties {
    private String name;
    private String format;
    private long size;
    private Set<String> tags;

    private LocalDateTime creationTimestamp;
    private LocalDateTime lastModificationTimestamp;

    public ImageProperties(String name, String format) {
        this.name = name;
        this.format = format;
    }

    public ImageProperties(String name, String format, long size,
                           List<String> tags, LocalDateTime creationTimestamp,
                           LocalDateTime lastModificationTimestamp) {
        this.name = name;
        this.format = format;
        this.size = size;
        this.tags = new HashSet<>(tags);
        this.creationTimestamp = creationTimestamp;
        this.lastModificationTimestamp = lastModificationTimestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFullName() {
        return name + "." + format;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = new HashSet<>(tags);
    }

    public LocalDateTime getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationDateTime(LocalDateTime creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public LocalDateTime getLastModificationDateTime() {
        return lastModificationTimestamp;
    }

    public void setLastModificationDateTime(LocalDateTime lastModificationTimestamp) {
        this.lastModificationTimestamp = lastModificationTimestamp;
    }
}
