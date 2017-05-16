package command;

public class Stereo {
 private Double volume;
 public void off(){
	 System.out.println("stereo is off");
 }
 public void getCD(){
	 System.out.println("cd is out");
 }
 
 public void on(){
	 System.out.println( "stereo is on");
 }
 public void setCD(){
	 System.out.println("cd is in");
 }
 public void setVolume(Double volume){
	 this.volume=volume;
 }
public Double getVolume() {
	return volume;
}
 
}
