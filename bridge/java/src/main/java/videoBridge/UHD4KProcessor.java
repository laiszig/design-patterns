package videoBridge;

// Concrete Implementor
public class UHD4KProcessor implements VideoProcessor {
    @Override
    public void process(String videoFile) {
        System.out.println("Processing UHD4K video file: " + videoFile);
    }
}
