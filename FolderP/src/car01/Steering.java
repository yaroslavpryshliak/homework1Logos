package car01;

public class Steering {
	
	private String cover;

	public Steering(String cover) {
		this.cover = cover;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	@Override
	public String toString() {
		return " Steering " + cover;
	}

	
	
	
	
	
}
