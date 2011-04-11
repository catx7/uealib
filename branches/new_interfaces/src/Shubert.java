package functions;

public class Shubert extends Functions{
	
	private static final int dimension = 2;
	private static final double left_border =  -10;
	private static final double right_border = 10;
	private static final double min = -186.7309;	
	
	public double getResult(double[] k){
		double x = k[0];
		double y = k[1];
		double rez = 0;
		//double ep = 0.00000000001;
		//if(x<ep && y<ep){return 0;}
		double sum1 = 0;
		double sum2 = 0;
		for(int i=1;i<6;i++){
			sum1+=i*Math.cos((i+1)*x+i);
			sum2+=i*Math.cos((i+1)*y+i);
		}
		rez = sum1*sum2;
		//System.out.println(rez);
		return rez;
	}
	
	public int getDimension(){
		return dimension;
	}
	
	public double getLeftBorder(){
		return left_border;		
	}
	
	public double getRightBorder(){
		return right_border;		
	}
	
	public double getMax(){
		// TODO Auto-generated method stub
		return 0;
	}


	public double getMin() {
		return min;
	}

}
