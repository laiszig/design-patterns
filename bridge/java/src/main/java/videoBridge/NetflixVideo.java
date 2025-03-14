package videoBridge;

// RefinedAbstraction
public class NetflixVideo extends Video{

    public NetflixVideo(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String videoFile) {
        videoProcessor.Play(videoFile);
    }
}
