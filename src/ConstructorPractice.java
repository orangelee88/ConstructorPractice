
public class ConstructorPractice {

	public static void main(String[] args) {
		Test people = new Test("george", 28);// �ŧi�P�s�W����
		people.mathod();// ���檫�󪺤�k
	}
}

class Test {
	// �����ܼ�
	public String Name;
	public int Age;

	public Test(String name) {
		this.Name = name;
	}

	public Test(String name, int age) {
		this.Name = name;
		this.Age = age;
	}

	// ��k
	public void mathod() {
		System.out.println("�m �W =" + Name + " ,�~ �� =" + Age);
	}
}
