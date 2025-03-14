package main

import "fmt"

// UHD4KProcessor implements the VideoProcessor interface
type UHD4KProcessor struct{}

func (p *UHD4KProcessor) process(videoFile string) {
	fmt.Println("Processing UHD 4K video:", videoFile)
}
