package hust.soict.hedspi.garbage;
import java.io.FileReader;
import java.io.File;

public class NoGarbage {

	private StringBuffer sbf;
	private double[] arr;
	private int i = 0;
	public NoGarbage() {
		arr = new double[30000];
		sbf = new StringBuffer();
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Aimsproject\\src\\hust\\soict\\hedspi\\garbage\\script.txt");
		try (FileReader reader = new FileReader(file)){
            char[] cs = new char[1];
            int bytes = reader.read(cs);
            System.out.println(bytes);
            while (bytes != -1) {
            	sbf.append((char) cs[0]);
				arr[i] = sbf.hashCode();
                i++;
                bytes = reader.read(cs);
            }
            reader.close();
            System.out.println(sbf);
            int gab = arr.length;
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] == arr[i + 1]) gab--;
			}
			assert gab < 20000 : "ERROR! - Too much garbages!";
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
	}
}
