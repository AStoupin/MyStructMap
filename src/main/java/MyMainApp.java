 
public class MyMainApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		MySourceClass src = new MySourceClass();
		src.field1 = 10;
		src.field2 = "333";
		src.field3 = "33.13.2018";
		
		
		MyDestClass dest = MyMapInterface.INSTANCE.sourceToDest(src);
		
		System.out.println(dest.field3);
}

}
