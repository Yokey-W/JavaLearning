package Encapsulation;

public class Girl extends Human{

	public Girl(String sex, int age, double hight, double wight, String address,String name) {
		super(sex, age, hight, wight, address,name);
		// TODO Auto-generated constructor stub
	}
	private Lipstick lip;
	private int beautyScore;
	public int getBeautyScore() {
		return beautyScore;
	}
	public void setBeautyScore(int beautyScore) {
		this.beautyScore = beautyScore;
	}
	public Lipstick getLip() {
		return lip;
	}
	public void setLip(Lipstick lip) {
		this.lip = lip;
	}
	public void beautfyCompare(Girl girl){//this关键字表示当前对象
		Girl thisGirl = this;
		Girl anotherGirl = girl;
		if(thisGirl.beautyScore>anotherGirl.beautyScore){
			System.out.println(thisGirl.getName()+"更漂亮！");
		}else if(thisGirl.beautyScore<anotherGirl.beautyScore){
			System.out.println(anotherGirl.getName()+"更漂亮！");
		}else{
			System.out.println("两个都漂亮！");
		}
	}

}
