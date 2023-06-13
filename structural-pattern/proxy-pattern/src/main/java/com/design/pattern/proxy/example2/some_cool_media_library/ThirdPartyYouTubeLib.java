package com.design.pattern.proxy.example2.some_cool_media_library;

import java.util.HashMap;

/**
 * ThirdPartyYouTubeLib
 *
 * @author Wenzhou
 * @since 2023/6/13 16:53
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
