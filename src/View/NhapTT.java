package View;
import Model.Student;

import java.util.ArrayList;
import java.util.Scanner;



public class NhapTT {

    public static Student InputStudent(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ho va ten: ");
        String name = sc.nextLine();
        System.out.print("Tuoi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Lop: ");
        String lop = sc.nextLine();
        sc.close();
        System.out.println("=========================");
        return new Student(age, name, lop);
    }
    public static ArrayList<Student> ListInputStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong hoc sinh muon nhap: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> list = new ArrayList<>();

        for(int i = 0; i <n ; i++){
            list.add(InputStudent());
        }
        return list;
    }
    public static void Print(Student st){
        System.out.println(st.toString());
    }
    public static void Print(ArrayList<Student> list){
        for(Student st : list){
            System.out.println(st.toString());
        }
    }
}


