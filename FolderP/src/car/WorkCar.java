package car;

public class WorkCar implements Helm, Wheel, Body {
	
private String name;	

private final Helm helm;

private final Wheel wheel;

private final Body body;

	public WorkCar(String name, Helm helm, Wheel wheel, Body body) {
				this.name = name;
				this.helm = helm;
				this.wheel = wheel;
				this.body = body;
	}			
	
				public void design() {
					if(helm!=null) helm.design();
				}
			
				public void diametr(){
					if(wheel!=null) wheel.diametr();
				}
				public void color(){
					if(body!=null) body.color();
				}
				public void printWorkCar(){
					System.out.println(name);
					design();
					diametr();
					color();
				}
				
		
			



	}


	
	
	
	

