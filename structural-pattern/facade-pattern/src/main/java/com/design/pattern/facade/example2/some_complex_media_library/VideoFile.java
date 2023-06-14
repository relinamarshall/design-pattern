package com.design.pattern.facade.example2.some_complex_media_library;

/**
 * VideoFile
 * <p>
 * 复杂视频转换程序库
 *
 * @author Wenzhou
 * @since 2023/6/14 15:33
 */
public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }
}
