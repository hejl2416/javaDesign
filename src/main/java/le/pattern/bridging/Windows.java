package le.pattern.bridging;

public class Windows extends OperatingSystem{
    public Windows(VideoFile videoFile){
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
