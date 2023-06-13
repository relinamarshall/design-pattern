package com.design.pattern.proxy.example2.proxy;

import com.design.pattern.proxy.example2.some_cool_media_library.ThirdPartyYouTubeClass;
import com.design.pattern.proxy.example2.some_cool_media_library.ThirdPartyYouTubeLib;
import com.design.pattern.proxy.example2.some_cool_media_library.Video;

import java.util.HashMap;

/**
 * YouTubeCacheProxy
 *
 * @author Wenzhou
 * @since 2023/6/13 16:54
 */
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private final ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private final HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
