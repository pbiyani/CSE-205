
public class Production {
	private String companyName;
	private String locationCity;
	private String locationState;
	public Production() {
		companyName = "?";
		locationCity = "?";
		locationState = "?";
		}
	public String getComanyName() {
		return companyName;
	}
	public String getLocationCity() {
		return locationCity;
	}
	public String getLocationState()
	{
		return locationState;
	}
	public void setCompnayName(String Cname) {
		companyName=Cname;
	}
	public void setLocationCity(String Lcity) {
		locationCity=Lcity;
	}
	public void setLocationState(String Lstate) {
		locationState=Lstate;
	}
	public String toString(){
		String movie;
		movie = companyName+" at "+locationCity+","+locationState;
		return movie;
	}
}
