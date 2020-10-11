
public class Movie {
	private String Movietitle ;
	private int year;
	private int length;
	private Production prodCompany;

	public Movie() {
		Movietitle="?";
		year = 0 ;
		length= 0 ;
		prodCompany = new Production();
         
	}
	public String getMovieTitle() {
		return Movietitle;
	}
	public int getMovieYear() {
		return year;
	}
	public int getMovieLength()
	{
		return length;
	}
	public Production getProdCompany() {
		return prodCompany;
	}
	public void setMovieTitle(String Mtitle) {
		Movietitle=Mtitle;
	}
	public void setYear(int Myear) {
		year=Myear;
	}
	public void setLength(int Mlength) {
		length=Mlength;
	}
	public void setProdCompany(String Mname , String Mcity , String MState) {
		prodCompany.setCompnayName(Mname);
		prodCompany.setLocationCity(Mcity);
		prodCompany.setLocationState(MState);
		
	
	}
	public String toString() {
		String move;
		move = "\nMovie Title:\t\t"+Movietitle+"\n"
				+"Movie Length:\t\t"+length+"\n"
				+"Movie Year:\t\t"+year+"\n"
				+"Movie Production:\t"+prodCompany+"\n\n";
		return move;
	}

}
