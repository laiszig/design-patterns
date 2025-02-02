package com.laiszig.proxy.videoProxy;

import com.laiszig.proxy.internetProxy.Internet;
import com.laiszig.proxy.internetProxy.ProxyInternet;

public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        System.out.println("==========================================");

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("proxy-pattern");
        videoDownloader.getVideo("proxy-pattern");
        videoDownloader.getVideo("adapter-pattern");
        videoDownloader.getVideo("adapter-pattern");
        videoDownloader.getVideo("proxy-pattern");

    }
}
