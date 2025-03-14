package videoBridge;

// Concrete Implementor
public class UHD4KProcessor implements VideoProcessor {
    @Override
    public void Play(String videoFile) {
        System.out.println("Processing UHD4K video file: " + videoFile);
    }
}
