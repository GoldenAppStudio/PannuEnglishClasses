package studio.golden.pannu_eng_classes;

public class YoutubeVideo {

    String videoUrl;

    public YoutubeVideo(){

    }
    public YoutubeVideo(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
