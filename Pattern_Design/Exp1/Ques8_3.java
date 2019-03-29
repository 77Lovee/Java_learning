class ReArray extends MyArray{
	ReArray(int leng){
		super(leng);
	}
	
	public void reverse(){
		int tmp;
		for(int i=0; i<this.length/2; i++){
			tmp = alist[this.length-1-i];
			alist[this.length-1-i] = alist[i];
			alist[i] = tmp;
		}
	}
}

public class Ques8_3{
	public static void main(String[] args){
		ReArray array = new ReArray(10);
		array.init();
		System.out.println("翻转前");
		array.display();
		array.reverse();
		System.out.println("翻转后");
		array.display();
	}
}
