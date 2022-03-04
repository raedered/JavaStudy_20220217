package a11_상속.User;

public class CompanyUser extends User{
	private String companyName;
	private String companyaddress;
	private String companyTel;
	
	public CompanyUser() {
		
	}

	public CompanyUser(String companyName, String companyaddress, String companyTel) {
		super();
		this.companyName = companyName;
		this.companyaddress = companyaddress;
		this.companyTel = companyTel;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyaddress() {
		return companyaddress;
	}

	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}

	public String getCompanyTel() {
		return companyTel;
	}

	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}
	
	
	
}
