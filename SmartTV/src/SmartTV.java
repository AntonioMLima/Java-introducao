

public class SmartTV {
    boolean on = false;
    int channel = 1;
    int volume = 10;

    public void pressTurnOffButton() {
        on = !on;
    }

    public void turnVolumeUp() {
        ++volume;
    }

    public void turnVolumeDown() {
        --volume;
    }

    public void turnChannelUp() {
        ++channel;
    }

    public void turnChannelDown() {
        --channel;
    }
    
    public void changeChannel(int nextChannel){
        channel = nextChannel;
    }
}
