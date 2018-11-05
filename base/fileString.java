import java.io.*;
	
public class fileString{
	public static void main(String args[]){
		try{
			byte bWrite[] = {11,21,3,40,5};
			File f = new File("./a.txt");
			OutputStream os = new FileOutputStream(f);
			for(int x=0; x<bWrite.length; x++){
				os.write(bWrite[x]);
				}
			os.close();

			InputStream is = new FileInputStream(f);
			int size = is.available();
			
			for(int i=0; i<size; i++){
				System.out.print((char)is.read()+"  ");
				}
			is.close();
			}
		catch(IOException e){
			System.out.print("Exception");
		}
	}
	}
