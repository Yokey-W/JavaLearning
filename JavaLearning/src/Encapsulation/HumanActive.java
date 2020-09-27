package Encapsulation;

public class HumanActive {
	public static void main(String args[]){
		Girl xyw = new Girl("girl", 18, 165, 45, "heart","ET");
		xyw.setBeautyScore(80);;
		Girl qr = new Girl("girl", 19, 165, 55, "heart","QR");
		qr.setBeautyScore(85);
		Human child = new Human("boy",1,50,8,"heart","BB");
		xyw.successfulCreated(1,"girlfriend", xyw.getName());
		Lipstick lip = new Lipstick();
		lip.setColor("red");
		lip.setGirl(xyw);
		xyw.setChild(child);
//		System.out.println("这是"+lip.getGirl().getName()+"的口红!");
		xyw.beautfyCompare(qr);
	}

}
