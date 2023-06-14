package com.design.pattern.facade.example2.facade;

import com.design.pattern.facade.example2.some_complex_media_library.AudioMixer;
import com.design.pattern.facade.example2.some_complex_media_library.BitrateReader;
import com.design.pattern.facade.example2.some_complex_media_library.Codec;
import com.design.pattern.facade.example2.some_complex_media_library.CodecFactory;
import com.design.pattern.facade.example2.some_complex_media_library.MPEG4CompressionCodec;
import com.design.pattern.facade.example2.some_complex_media_library.OggCompressionCodec;
import com.design.pattern.facade.example2.some_complex_media_library.VideoFile;

import java.io.File;

/**
 * VideoConversionFacade
 * <p>
 * 外观提供了进行视频转换的简单接口
 *
 * @author Wenzhou
 * @since 2023/6/14 15:36
 */
public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
