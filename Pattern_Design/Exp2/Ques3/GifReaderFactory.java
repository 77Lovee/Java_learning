class GifReaderFactory implements ImageReaderFactory{
	public ImageReader createImageReader(){
		System.out.println("创建一个GifReader");
		return new GifReader();
	}
}


