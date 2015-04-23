import java.util.*;

public class Student{
	private String name;
	private String year;
	private String fHousing;
	private String sHousing;
	private String jHousing;
	private int fRDN;
	private int sRDN;
	private int jRDN;

	public void setName(String n) {
		name = n;
	}

	public String getName(){
		return name;
	}

	public void setYear(String y) {
		year = y;
	}

	public void setFH(String fh) {
		fHousing = fh;
	}

	public void setSH(String sh) {
		sHousing = sh;
	}

	public void setJH(String jh) {
		jHousing = jh;
	}

	public void setfRDN(int fRD){
		fRDN = fRD;
	}

	public void setsRDN(int sRD){
		sRDN = sRD;
	}

	public void setjRDN(int jRD){
		jRDN = jRD;
	}
}
