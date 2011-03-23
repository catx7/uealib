package antcolony;



public class Context  {
	
	private static Context inst;	
	private int count = 1000;
	
	public static Context getInstance() {
		if (inst == null) {
			inst = new Context();
		}
		return inst;
	}
	
	public void setCount(int c){
		this.count = c;
	}

	public int getCount(){
		return this.count;		
	}
	
}
