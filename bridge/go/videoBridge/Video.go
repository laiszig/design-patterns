package main

// Video is the abstract class equivalent in Go, holding a reference to the VideoProcessor
type Video struct {
	processor VideoProcessor
}

// NewVideo constructor to create a new Video instance
func NewVideo(processor VideoProcessor) *Video {
	return &Video{processor: processor}
}

// Play method (abstract in Java), to be overridden by specific video types
func (v *Video) Play(videoFile string) {
	VideoProcessor.process(v.processor, videoFile)
}
