package except;

public class VectorT{
	private double[] x=new double[3];
	
	public VectorT(){
		for (int i = 0; i < 3; i++)
			x[i]=0;
	}

	public VectorT(double[] a){
		for (int i = 0; i < 3; i++)
			x[i]=a[i];
	}
	
	public void printVectorT(){
		System.out.print("[ ");
		for (int i = 0; i < 3; i++){
			System.out.print(x[i]+ " ");
		}
		System.out.println("]");
	}
	
	private double[]  getX(){
		return x;
	}
	
	public VectorT addVectorT(VectorT v2){
		double[] c= new double[3];
		c=v2.getX();
		for (int i = 0; i < 3; i++)
			x[i]+=c[i];
		return v2;
	}
	
	public static boolean isEqual(VectorT v1, VectorT v2){
		int k=0;
		double[] b= new double[3];
		b=v1.getX();
		double[] c= new double[3];
		c=v2.getX();
		for (int i = 0; i < 3; i++ )
			if(b[i]==c[i])
				++k;
		if(k==3)
			return true;
		else
			return false;
	}
		
	public VectorT difVectorT(VectorT v2){
		double[] c= new double[3];
		c=v2.getX();
		for (int i = 0; i < 3; i++)
			x[i]=x[i]-c[i];
		return v2;
	}
	
	public VectorT mulVectorT(int r){
		for (int i = 0; i < 3; i++)
			x[i]=x[i]*r;
		return null;
	}
	
	public static double Skalar(VectorT v1, VectorT v2) throws MyException{
		double a=0;
		double[] b= new double[3];
		b=v1.getX();
		double[] c= new double[3];
		c=v2.getX();
		for (int i = 0; i < 3; i++){
			a+=b[i]*c[i];
		}
		assert(a <=35.0):"ochen' mnogo:)";
		return a;
	}
	
	public static boolean Ortogonal(VectorT v1, VectorT v2) throws MyException{
		if (Skalar(v1, v2) == 0)
			return true;
		else
			return false;
	}
	
	public static boolean Kollinearnost (VectorT v1, VectorT v2) throws MyException{
		double[] b= new double[3];
		b=v1.getX();
		double[] c= new double[3];
		c=v2.getX();
		double[] a=new double[3]; 
		double[] d=new double[3];
		for (int i = 0; i < 3; i++){
			if (b[i]==0 || c[i]==0)
				throw new MyException("не верно введен вектор, делить на 0 нельзя");
			else
				a[i]=b[i]/c[i];
			    d[i]=b[i]%c[i];
		}
		if (a[0]==a[1] && a[1]==a[2] && d[0]==d[1] && d[1]==d[2])
			return true;
		else 
			return false;
	}
	
}

		
	
