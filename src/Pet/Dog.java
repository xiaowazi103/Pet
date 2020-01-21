package Pet;

public class Dog extends Pet{
	private String id;
	private String name;
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		return "Dog [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public void eat() {
		System.out.println(name + "wangwangwang");
	}
	
	@Override
	public void play() {
		System.out.println(name +"have fun!");
	}
}
