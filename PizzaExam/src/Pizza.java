
public class Pizza extends Circle{
	private String name;
	
	
	
	public Pizza(int size, String name) {
		super(size);
		this.name = name;
	}


	@Override
	public String toString() {
		return "������ ����:" + name + ", ������ ũ��:"+size;
	}
}
