package videoBridge;

// Concrete Implementor
public class HDProcessor implements VideoProcessor {
    @Override
    public void Play(String videoFile) {
        System.out.println("Processing HD video file: " + videoFile);
    }
}
