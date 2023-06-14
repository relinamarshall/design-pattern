package com.design.pattern.facade.example2.some_complex_media_library;

import java.io.File;

/**
 * AudioMixer
 *
 * @author Wenzhou
 * @since 2023/6/14 15:35
 */
public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
