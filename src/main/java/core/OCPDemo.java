package core;

public class OCPDemo {

 public static interface NumberValidate{
	 boolean validate(String drawNum);
 }
 
 public boolean validate(String lotteryType,String  drawNum){
	 if("PL3".equals(lotteryType)){
		 PL3Validate pL3Validate=new PL3Validate();
		 return pL3Validate.validate(drawNum);
	 }else if("PL5".equals(lotteryType)){
		 PL5Validate pL5Validate=new PL5Validate();
		 return pL5Validate.validate(drawNum);
	 }
	 return false;
 }
 
 public static class PL3Validate{
	 boolean validate(String drawNum){
		 return false;
	 }
 }
 public static class PL5Validate{
	 boolean validate(String drawNum){
		 return false;
	 }
 }
}
