import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		demodriven d =new demodriven();
		ArrayList result = d.getdata("Delete Profile");
		System.out.println(result.get(0));
		System.out.println(result.get(1));
		System.out.println(result.get(2));
		System.out.println(result.get(3));
		
		
		
	}

}
