public class Ques3{
	public static void main(String[] args){
		ImageReaderFactory imgF;
		ImageReader imgR;
		imgF = new GifReaderFactory();
		imgR = imgF.createImageReader();
		imgR.getImage();
		System.out.println("**********************");
		imgF = new JpgReaderFactory();
		imgR = imgF.createImageReader();
		imgR.getImage();

	}
}

