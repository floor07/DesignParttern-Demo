package command.impl;

import command.Command;
import command.Light;

public class LightOffCommand implements Command{
	
	Light light;
	
	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	public void execute() {
		System.out.println( this.light.getName()+" is off !!!");
	}

}
