package com.laiszig.proxy.cacheProxy.mediaLib;

import java.util.HashMap;

/**
 * The interface of a remote service.
 */
public interface ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
