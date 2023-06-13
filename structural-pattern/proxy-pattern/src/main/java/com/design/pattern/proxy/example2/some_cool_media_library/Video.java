package com.design.pattern.proxy.example2.some_cool_media_library;

/**
 * Video
 *
 * @author Wenzhou
 * @since 2023/6/13 16:54
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
