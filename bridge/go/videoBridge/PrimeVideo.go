package main

type PrimeVideo struct {
	*Video
}

// NewPrimeVideo constructor for PrimeVideo
func NewPrimeVideo(processor VideoProcessor) *PrimeVideo {
	return &PrimeVideo{NewVideo(processor)}
}
