package main

import "fmt"

// HDProcessor implements the VideoProcessor interface
type HDProcessor struct{}

func (p *HDProcessor) process(videoFile string) {
	fmt.Println("Processing HD video:", videoFile)
}
