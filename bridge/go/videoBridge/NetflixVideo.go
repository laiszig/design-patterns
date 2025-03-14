package main

// NetflixVideo is a concrete Video implementation
type NetflixVideo struct {
	*Video
}

// NewNetflixVideo constructor for NetflixVideo
func NewNetflixVideo(processor VideoProcessor) *NetflixVideo {
	return &NetflixVideo{NewVideo(processor)}
}
