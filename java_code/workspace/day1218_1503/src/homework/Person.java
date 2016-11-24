package homework;
//ʵ����Comparable,ʹperson������бȽϹ��ܡ�
public class Person	implements Comparable<Person>{
	/* ���� Javadoc��
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		result = prime * result + income;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* ���� Javadoc��
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		if (income != other.income)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private String name;
	private int income;
	private int age;
	private Book books;

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
	 * @return income
	 */
	public int getIncome() {
		return income;
	}

	/**
	 * @param income Ҫ���õ� income
	 */
	public void setIncome(int income) {
		this.income = income;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age Ҫ���õ� age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int income, int age, Book books) {
		super();
		this.name = name;
		this.income = income;
		this.age = age;
		this.books = books;
	}

	/**
	 * @return books
	 */
	public Book getBooks() {
		return books;
	}

	/**
	 * @param books Ҫ���õ� books
	 */
	public void setBooks(Book books) {
		this.books = books;
	}

	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", age=" + age
				+ ", books=" + books + "]";
	}

	@Override
	public int compareTo(Person o) {
		if(income==o.income){
			 if(age==o.age){
				 if(name==o.name){
					if(getBooks().getPrice()==o.getBooks().getPrice()){
						if(getBooks().getBookName()==o.getBooks().getBookName()){
							return 0;
						}
						return getBooks().getBookName().compareTo(o.getBooks().getBookName());
					}
					return getBooks().getPrice()-o.getBooks().getPrice();
				}
				 return name.compareTo(o.name);
			}
			return age-o.age;
		}
		return -(income-o.income);
	}


	
}
