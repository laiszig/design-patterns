package videoBridge;

// Concrete Implementor
public class HDProcessor implements VideoProcessor {
    @Override
    public void process(String videoFile) {
        System.out.println("Processing HD video file: " + videoFile);
    }
}
