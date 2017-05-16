package command;

import command.impl.LightOffCommand;
import command.impl.LightOnCommand;
import command.impl.StereoOffCommand;
import command.impl.StereoOnWithCDCommand;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControlInvoker remoteControl=new RemoteControlInvoker();
		Light light1=new Light("A light");
		LightOffCommand lightOffCommand=new LightOffCommand(light1);
		LightOnCommand lightOnCommand=new LightOnCommand(light1);
		Stereo stereo=new Stereo();
		StereoOffCommand stereoOffCommand=new StereoOffCommand(stereo);
		StereoOnWithCDCommand stereoOnCommand=new StereoOnWithCDCommand(stereo);
		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.setCommand(1, stereoOnCommand, stereoOffCommand);
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		System.out.println(remoteControl.toString());
	}
}
