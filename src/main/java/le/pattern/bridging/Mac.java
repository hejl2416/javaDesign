package le.pattern.bridging;

public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile){
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
