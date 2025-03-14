package videoBridge;

// RefinedAbstraction
public class PrimeVideo extends Video {

    public PrimeVideo(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String videoFile) {
        videoProcessor.process(videoFile);
    }

}
