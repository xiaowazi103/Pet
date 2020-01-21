package Pet;

public class Pet {
	private String id;
	private String name;
	
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(String id, String name) {
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
		return "Pet [id=" + id + ", name=" + name + "]";
	}
	
	public void eat() {
		System.out.println(name+"eating happily");
	}
	
	public void play() {
		System.out.println(name+"have fun");
	}
}
