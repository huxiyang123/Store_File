package homewowk14_17;

import java.util.LinkedList;

public class WashDish17<A> {

	LinkedList<A> ll =  new LinkedList<A>();
	public void add(A  d){
		ll.addFirst(d);
	}
	public A getDish(){
		
		return   ll.pollFirst();
		
	}
}
class Dish{
	private String dish;
	/* £¨·Ç Javadoc£©
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dish [dish=" + dish + "]";
	}

	
	public Dish(String dish) {
		super();
		this.dish = dish;
	}


	public static void main(String[] args) {
		WashDish17<Dish> wd = new WashDish17<Dish>();
		for(int i=0;i<10;i++){
			Dish d = new Dish("dish"+i);
			wd.add(d);
		}
		for(int j=0;j<10;j++){
			System.out.println(wd.getDish());
		}
	}
	
}
