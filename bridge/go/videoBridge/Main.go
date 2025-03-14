package main

func main() {
	youtubeVideo := NewPrimeVideo(&HDProcessor{})
	youtubeVideo.Play("abc.mp4")

	netflixVideo := NewNetflixVideo(&UHD4KProcessor{})
	netflixVideo.Play("abc.mp4")
}
