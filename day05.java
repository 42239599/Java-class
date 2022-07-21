
//九九乘法表
/*
class  NineNine
{
	public static void main(String[] args) 
	{
		int line , column ;
		for(line = 1 ; line <= 9 ;line ++)
		{
			for(column = 1 ; column <= line ; column ++){
				System.out.print(column + "*" + line + "=" + (line * column) + "  ");	
			}
			System.out.println();
		}
	}
}
*/



//100以内的质数
/*
class Prime
{
	public static void main(String[] args){
		System.out.println("质数如下");
		int j ;
		for(int i =2 ; i <= 100 ; i++ ){
			
			for(j =2 ; j <= i ; j ++){
				if(i % j == 0)
					break;
				}

				if(i <= j)
					System.out.println(i);
			
		}
	}
}*/

/*
class Prime1
{
	public static void main(String[] args){
		int  i , j ;
		boolean isFlag = true;
		System.out.println("质数如下：");
		for(i = 2 ; i < 200 ; i ++){
			for(j = 2 ; j < i ; j++)
				if(i % j == 0)
					isFlag = false ;
				if(isFlag == true)
					System.out.println(i);
		isFlag = true;
		}	
	}
}*/




class PrimeTest
{
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int i , j ;
		System.out.println("质数如下：");
		boolean isFlag = true ;
		for(i = 2 ; i < 20000 ; i++ )
		{
			for(j = 2 ; j <= Math.sqrt(i) ; j++)
			{
				if(i % j == 0){
					isFlag = false ;
					break;
				}
			}
			if(isFlag == true)
				System.out.println(i);
			isFlag = true ;
		}
		long end = System.currentTimeMillis();
		System.out.println("所花费的时间为" + (end - start));//859//172//125//94
	}
}