package Encapsulation;

public class Human {
	private String sex;
	private int age;
	private String name;
	private Human child;
	public Human getChild() {
		return child;
	}
	public void setChild(Human child) {
		this.child = child;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private double hight;
	private double wight;
	private String address;
	public Human(String sex,int age,double hight,double wight,String address,String name){
		this.setSex(sex);
		this.setAge(age);
		this.setHight(hight);
		this.setWight(wight);
		this.setName(name);
	}
	public void successfulCreated(int number,String relation,String name){
		System.out.println("创建成功！我是您的第"+number+"号"+relation+":"+name+",余生请指教~");
	}
	public void selfInfo(){
		System.out.println("\t"+"性别："+getSex());
	}
	public String getSex(){
		return sex;
	}
	public double getWight() {
		return wight;
	}
	public void setWight(double wight) {
		this.wight = wight;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public void getAge(){
		
	}
	public void setAge(int age){
		this.age=age;
	}
	public void getHight(){
		
	}
	public void setHight(double hight){
		this.hight=hight;
	}
}
