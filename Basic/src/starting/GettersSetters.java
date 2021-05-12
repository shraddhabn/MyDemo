package starting;

public class GettersSetters {

	private String name;
	
	//getter
	public String getname() {
		return name;
	}
	
	//setter
	public void setname(String name) {
		this.name=name;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GettersSetters obj=new GettersSetters();
		obj.setname("Shraddh");
		obj.getname();
	}

}
