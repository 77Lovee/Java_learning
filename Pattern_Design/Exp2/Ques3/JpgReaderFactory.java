class JpgReaderFactory implements ImageReaderFactory{
	public ImageReader createImageReader(){
		System.out.println("创建一个JpgReaer");
		return new JpgReader();
	}
 }
