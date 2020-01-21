package Pet;

public class Cat extends Pet{
	private String id;
	private String name;
	
	public Cat(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public void eat() {
		System.out.println(name + "miaomiao");
	}
	
	@Override
	public void play() {
		System.out.println(name +"have fun!");
	}
}
