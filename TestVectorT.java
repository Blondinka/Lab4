package except;

public class TestVectorT{

	public void testSum(){
		VectorT adder = new VectorT();
		double[] c= {2, 2, 2};
		double[] b= {1, 1, 1};
		double[] g= {3, 3, 3};
		VectorT v1= new VectorT(c);
		VectorT v2= new VectorT(b);
		VectorT v3= new VectorT(g);
		assert(adder.isEqual( v2.addVectorT(v1),v3));
	}
}

