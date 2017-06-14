package car;

public class ConHelm implements Helm {

	public String type;

	public ConHelm(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void design() {
		System.out.println(type+"black or white");
	}
	
	

}
