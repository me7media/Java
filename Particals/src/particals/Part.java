package particals;

public abstract class Part  {

	private String name;
	private int power;
	
	 public Part(String name, int power) {
		    this.setName(name); 
		    this.setPower(power); 
		  }
	 
		public void outPart() {}

	public String getName() {
		return name;
	}

	public String outName() {
		System.out.println(name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public int outPower() {
		System.out.println(power);
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
}
