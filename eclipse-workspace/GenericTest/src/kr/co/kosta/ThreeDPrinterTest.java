package kr.co.kosta;

public class ThreeDPrinterTest {
	public static void main(String[] args) {
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		Powder p1 = new Powder();
		printer.setMaterial(p1);		//자동 형 변환됨 
		
		Powder p2 =(Powder)printer.getMaterial();	// 직접 형 변환을 해야 함 
	}
}
