
public class Customer {
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String address;
	private String city;
	private String state;
	private int zip;
	private int id;
	private String checkin;
	private String checkout;
	
	public String getfirstName(){
		return firstName;
	}
	
	public void setfirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getlastName(){
		return lastName;
	}
	
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
	
	public int getphoneNumber(){
		return phoneNumber;
	}
	
	public void setphoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String getaddress(){
		return address;
	}
	
	public void setaddress(String address){
		this.address = address;
	}
	
	public String getcity(){
		return city;
	}
	
	public void setcity(String city){
		this.city = city;
	}
	
	public String getstate(){
		return state;
	}
	
	public void setstate(String state){
		this.state = state;
	}
	
	public int getzip(){
		return zip;
	}
	
	public void setzip(int zip){
		this.zip = zip;
	}
	
	public int getid(){
		return id;
	}
	
	public void setid(int id){
		this.id = id;
	}
	
	public String getcheckin(){
		return checkin;
	}
	
	public void setcheckin(String checkin){
		this.checkin = checkin;
	}
	
	public String getcheckout(){
		return checkout;
	}
	
	public void setcheckout(String checkout){
		this.checkout =  checkout;
	}
}
