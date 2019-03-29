class MyArray{
public MyArray(int leng)
{
		if(leng<=0)
		{
			System.out.println("error length");
    		System.exit(1);
}
    	alist=new int [leng];
    	length=leng;
    	System.out.println("MyArray 类对象已创建。");
}
public void init()
{
		int i;
		for(i=0;i<length;i++)
		alist[i] = length - i;
}
public void display()
{
		int i;
		System.out.print("MyArray中的元素为：");
		for(i=0;i<length;i++)
			System.out.print("\t" + alist[i]);
	System.out.println();
}
protected int alist[];
protected int length;
}
public class ArrayTest
{
public static void main(String args[])
{
		MyArray a = new MyArray(5);
		a.init();
		a.display();
}
}
