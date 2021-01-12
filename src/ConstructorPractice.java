
public class ConstructorPractice {

	public static void main(String[] args) {
		Test people = new Test("george", 28);// 宣告與新增物件
		people.mathod();// 執行物件的方法
	}
}

class Test {
	// 成員變數
	public String Name;
	public int Age;

	public Test(String name) {
		this.Name = name;
	}

	public Test(String name, int age) {
		this.Name = name;
		this.Age = age;
	}

	// 方法
	public void mathod() {
		System.out.println("姓 名 =" + Name + " ,年 紀 =" + Age);
	}
}
