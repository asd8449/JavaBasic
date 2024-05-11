package remoteControl;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		RemoteControl.changeBattery();
	}

}
