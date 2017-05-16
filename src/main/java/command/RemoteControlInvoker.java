package command;

import command.impl.NoCommand;

public class RemoteControlInvoker {
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControlInvoker() {
		onCommands=new Command[7];
		offCommands=new Command[7];
		Command noCommand=new NoCommand();
		for(int i=0;i<7;i++){
			onCommands[i]=noCommand;
			offCommands[i]=noCommand;
		}
	}
	
	public void setCommand(int slot,Command onCommand,Command offCommand){
		this.onCommands[slot]=onCommand;
		this.offCommands[slot]=offCommand;
	}
	public void onButtonWasPushed(int slot){
		this.onCommands[slot].execute();
	}
	public void offButtonWasPushed(int slot){
		this.offCommands[slot].execute();
	}
	public String toString(){
		StringBuffer sbf=new StringBuffer();
		sbf.append("  Remote");
		for(int i=0;i<onCommands.length;i++){
			sbf.append(" onCommands is： ")
			.append(onCommands[i].getClass().getName())
			.append(" offCommands is： ")
			.append(offCommands[i].getClass().getName()).append("\n");
		}
		return sbf.toString();
	}
}
