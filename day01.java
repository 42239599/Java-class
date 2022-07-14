/*
class helloword
{
	public static void main (String[] args){
	
		System.out.println("helloword");
	}
}
*/
/*
<!-- import java.util.Scanner;
class ScannerTest{

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入你的名字 ");
		String name = scan.next();
		System.out.println(name);

		System.out.println("请输入你的年龄");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.println("请输入你的体重");
		double weight = scan.nextDouble();
		System.out.println(weight);

		System.out.println("你是否相中我呢");
		boolean islove = scan.nextBoolean();
		System.out.println(islove);

		System.out.println("请输入你的性别：");
		String gender = scan.next();
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);
		
		}

} -->
*/


/*
import java.util.Scanner;

class Scannertest
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入成绩：");

		double score = scan.nextDouble();
		if(score >= 90){
			System.out.println("奖励BMW");
		}else if(score >=80){
			System.out.println("奖励iPad");
		}else if(score >= 60){
			System.out.println("奖励棒棒糖");
		}else{
			System.out.println("啥也没有");
		}

	}
}
*/
/*
import java.util.Scanner;

class IfTest{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入第一个整数");
		int num1 = scanner.nextInt();

		System.out.println("请输入第二个整数");
		int num2 = scanner.nextInt();

		System.out.println("请输入第三个整数");
		int num3 = scanner.nextInt();

		
		if(num1 >= num2){
			
			if (num2 >= num3)
				System.out.println(num1 + "," + num2 + "," + num3);
			else if (num2 <= num3)
				System.out.println(num1 + "," + num3 + "," + num2);
			else
				System.out.println(num3 + "," + num1 + "," + num2);
		}

		else{//(num1 <= num2 )
			if(num1 >= num3)
				System.out.println(num2 + "," + num1 + "," + num3);
			else if(num2 <= num3)
				System.out.println(num3 + "," + num2 + "," + num1);
			else
				System.out.println(num2 + "," + num3 + "," + num1);
		}
	}
}
*/
/*
import java.util.Scanner;

class IfTest2
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入狗狗的年龄");
		
		int dogAge = scan.nextInt();

		if(dogAge > 0 && dogAge <= 2)
			dogAge = dogAge * 10;
		else if(dogAge > 2 )
			dogAge = ( dogAge - 2 ) * 4 + 21 ;

		System.out.println("狗的实际年龄是 " + dogAge  + "岁");
		
double value = Math.random();
System.out.println(value);
	}


}

double value = Math.random()[0.0,1.0)
double value = Math.random()*10;[0.0,100.0)

*/





import java.util.Scanner;

class IfTest3
{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("请输入两位数：");

		int num = scan.nextInt();

		int value = (int)(Math.random() * 90 + 10 );

		System.out.println("随机数字是 " + value);
		
		if (num == value)//数字且顺序匹配
			System.out.println("奖金10000美元");

		else if(value % 10 == num / 10 && value / 10 == num % 10)//数字相同但顺序不匹配
			System.out.println("奖金3000美元");
		
		else if(value / 10 == num /10 || value % 10 == num % 10)//一个数字仅满足顺序
			System.out.println("奖金1000美元");

		else if(value / 10 == num % 10 || value / 10 == num / 10 || value % 10 == num % 10 || value % 10 == num / 10)//一个数字满足非顺序
			System.out.println("奖金500美元");
		
		else
			System.out.println("啥也没有");
		
	}
}