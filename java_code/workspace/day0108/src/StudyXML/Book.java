package StudyXML;

public class Book {
	private String name;
	private int id;
	private double price;
	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */ 
	@Override
	public String toString() {
		return "Books [name=" + name + ", id=" + id + ", price=" + price
				+ ", type=" + type + "]";
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Ҫ���õ� name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id Ҫ���õ� id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price Ҫ���õ� price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type Ҫ���õ� type
	 */
	public void setType(String type) {
		this.type = type;
	}
	private String type;
	
}