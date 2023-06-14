package com.design.pattern.facade.example2;

import com.design.pattern.facade.example2.facade.VideoConversionFacade;

/**
 * Demo
 *
 * @author Wenzhou
 * @since 2023/6/14 15:36
 */
public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
