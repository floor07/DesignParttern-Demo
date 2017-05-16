package command.impl;

import command.Command;
import command.Stereo;

public class StereoOffCommand implements Command {
	
	Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.getCD();
		stereo.off();
	}

}
