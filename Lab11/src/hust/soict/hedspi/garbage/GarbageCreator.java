package hust.soict.hedspi.garbage;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class GarbageCreator {

	private String string;
	private double[] arr;
	private int i = 0;
	public GarbageCreator() {
		string="";
		arr = new double[100000];
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\Aimsproject\\src\\hust\\soict\\hedspi\\garbage\\script.txt");
		try (FileReader reader = new FileReader(file)){
            char[] cs = new char[1];
            int bytes = reader.read(cs);
            System.out.println(bytes);
            while (bytes != -1) {
                string+=(char)cs[0];
                arr[i] = string.hashCode();
                i++;
                bytes = reader.read(cs);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		int gab = arr.length;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == arr[i + 1]) gab--;
		}
		System.out.println(gab);
		assert gab < 20000 : "ERROR! - Too much garbages!";
		
		
	}
}
