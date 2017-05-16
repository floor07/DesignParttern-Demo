package command.impl;

import command.Command;
import command.Light;

public class LightOnCommand implements Command{
	
	Light light;
	
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	public void execute() {
		System.out.println( this.light.getName()+" is on ");
	}

}
