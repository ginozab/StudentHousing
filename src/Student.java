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
	private double fKey;
	private double sKey;
	private double jKey;
	private boolean used;

	public void setName(String n) {
		name = n;
	}

	public String getName(){
		return name;
	}

	public void setYear(String y) {
		year = y;
	}

	public String getYear(){
		return year;
	}

	public void setUsed(boolean u){
		used = u;
	}

	public boolean getUsed(){
		return used;
	}

	/**
	 * 
	 * Set and get freshman variables
	 * 
	 */

	public void setFH(String fh) {
		fHousing = fh;
	}

	public String getFH(){
		return fHousing;
	}

	public void setfKey (double f){
		fKey = f;
	}

	public double getfKey(){
		return fKey;
	}

	public void setfRDN(int fRD){
		fRDN = fRD;
	}

	public int getfRDN(){
		return fRDN;
	}

	/**
	 * Set and get sophmore variables
	 * @param
	 */

	public void setSH(String sh) {
		sHousing = sh;
	}

	public String getSH(){
		return sHousing;
	}

	public void setsKey (double s){
		sKey = s;
	}

	public double getsKey(){
		return sKey;
	}

	public void setsRDN(int sRD){
		sRDN = sRD;
	}

	public int getsRDN(){
		return sRDN;
	}

	/**
	 * Set and get Junior variables
	 * @param
	 */

	public void setJH(String jh) {
		jHousing = jh;
	}

	public String getJH(){
		return jHousing;
	}

	public void setjKey (double j){
		jKey = j;
	}

	public double getjKey(){
		return jKey;
	}

	public void setjRDN(int jRD){
		jRDN = jRD;
	}

	public int getjRDN(){
		return jRDN;
	}

}
