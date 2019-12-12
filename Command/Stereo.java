public class Stereo{
	String location;

	public Stereo (String location){
		this.location = location;
	}

	public void on(){
		System.out.println(location + " stereo is on");
	}

	public void off(){
		System.out.println(location + " stereo is off");	
	}

	public void setCD(){
		System.out.println(location + "stereo is et for CD input");
	}

	public void setDVD(){
		System.out.println(location + "stereo is et for DVD input");
	}

	public void setRadio(){
		System.out.println(location + "stereo is et for Radio");
	}

	public void setVolume(int volume){
		System.out.println(location + " Stereo volume set to " + volume);
	}
}