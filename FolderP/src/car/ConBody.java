package car;

public class ConBody implements Body {
	
	public String typec;
	
	
	public ConBody(String typec) {
		this.typec = typec;
	}
	
	

	public String getTypec() {
		return typec;
	}



	public void setTypec(String typec) {
		this.typec = typec;
	}



	@Override
	public void color() {
	System.out.println(typec+"choose your color ");
		
	}

}
