import java.io.FileWriter;  
import java.io.IOException;
public class WriteToFile {
	 public static void main(String[] args) {
		    try {
		      FileWriter myWriter = new FileWriter("filename.txt");
		      myWriter.write("Họ và tên ");
		      myWriter.close();
		      System.out.println("Tuổi:");
		    } catch (IOException e) {
		      System.out.println("Đã xả ra lỗi.");
		      e.printStackTrace();
		    }
		  }
		}