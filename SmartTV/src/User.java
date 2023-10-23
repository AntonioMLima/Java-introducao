public class User {
    
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        // classe personalizada

        smartTV.pressTurnOffButton();
        smartTV.pressTurnOffButton();
        smartTV.turnVolumeUp();
        smartTV.turnVolumeUp();
        smartTV.turnVolumeDown();
        smartTV.changeChannel(13);
        smartTV.turnChannelUp();
        smartTV.turnChannelDown();
        smartTV.pressTurnOffButton();


        System.out.println("Ligada: " + smartTV.on);
        System.out.println("Canal: " + smartTV.channel);
        System.out.println("Volume: " + smartTV.volume);
    }


    
}
