package except;
import java.util.*;
import java.util.logging.LogManager;
import java.io.*;

public class MainClass {
	public static void main(String[] args){
		try{
			System.out.println("Введите координаты вектора");
			double[] c= Zapolnenie();
			double[] v=Zapolnenie();
			
			double[] g= {3,3,3};
			VectorT v3= new VectorT(g);

			VectorT v1= new VectorT(c);
			VectorT v2 = new VectorT(v);
			TestVectorT tv= new TestVectorT();
			v1.printVectorT();
			v2.printVectorT();
			tv.testSum();
			System.out.println("Скалярное произведение векторов: " + VectorT.Skalar(v1, v2));
			System.out.println("Равенство: " + VectorT.isEqual(v1.addVectorT(v2),v3));
			System.out.println("Коллинеарность векторов: " +VectorT.Kollinearnost(v1, v2));
		}
		catch (MyException e){
			System.err.println(e);
		}
	}
	private static double[] Zapolnenie() {
		Scanner scan=new Scanner(System.in);
		double[] arr=new double [3];
		for (int i = 0; i < 3; i++){
			System.out.print("a[" +i+ "]=");
			arr[i]=scan.nextDouble();
		}
		return arr;
	}
}


