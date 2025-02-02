package com.laiszig.proxy.cacheProxy.proxy;

import com.laiszig.proxy.cacheProxy.mediaLib.ThirdPartyYoutubeClass;
import com.laiszig.proxy.cacheProxy.mediaLib.ThirdPartyYoutubeLib;
import com.laiszig.proxy.cacheProxy.mediaLib.Video;

import java.util.HashMap;

/**
 *  To save some bandwidth, we can cache request results and keep
 *  them for some time. But it may be impossible to put such code
 *  directly into the service class. For example, it could have
 *  been provided as part of a third party library and/or defined
 *  as `final`. That's why we put the caching code into a new
 *  proxy class which implements the same interface as the
 *  service class. It delegates to the service object only when
 *  the real requests have to be sent.
 */
public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {
    private ThirdPartyYoutubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YoutubeCacheProxy() {
        this.youtubeService = new ThirdPartyYoutubeClass();
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
