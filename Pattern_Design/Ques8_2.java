class SortArray extends MyArray{
	SortArray(int leng){
		super(leng);
		}

	public void sort(){
		int min=this.alist[0];
		int tmp;
		for(int i=0; i<this.length;i++){
			for(int j=0; j<this.length-1;j++){
				if(this.alist[j]>alist[j+1]){
					tmp = alist[j+1];
					alist[j+1] = alist[j];
					alist[j] = tmp;
				}
			}
		}
	}
}

public class Ques8_2{
	public static void main(String[] args){
		SortArray array = new SortArray(5);
		array.init();
		System.out.println("排序前：");
		array.display();
		array.sort();
		System.out.println("排序后:");
		array.display();
	}
}
	
