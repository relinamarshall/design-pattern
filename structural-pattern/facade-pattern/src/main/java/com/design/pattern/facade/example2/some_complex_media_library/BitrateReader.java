package com.design.pattern.facade.example2.some_complex_media_library;

/**
 * BitrateReader
 *
 * @author Wenzhou
 * @since 2023/6/14 15:35
 */
public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
