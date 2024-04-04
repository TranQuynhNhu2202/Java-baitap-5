

	import java.io.FileWriter;
import java.io.IOException;

import Model.Student;
	import View.*;
	public class Main {
	    public static void main(String[] args) {
	    Student st1;
	    st1 = NhapTT.InputStudent();
	    NhapTT.Print(st1);
	    
		    try {
		      FileWriter myWriter = new FileWriter("filename.txt");
		      myWriter.write("Họ và tên ");
		      myWriter.close();
		      System.out.println("Tuổi:");
		      myWriter.close();
		      System.out.println("Lớp:");
		      myWriter.close();
		    } catch (IOException e) {
		      System.out.println("Đã xả ra lỗi.");
		      e.printStackTrace();
		    }
		  }
	    }
	

