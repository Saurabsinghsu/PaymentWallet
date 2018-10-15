package wallet.pojo;

public class AccountEntity 
{
	private int id;
	private String user_name;
	private int user_cellNo;
	
	public AccountEntity(int id, String user_name, int user_cellNo) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_cellNo = user_cellNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getUser_cellNo() {
		return user_cellNo;
	}

	public void setUser_cellNo(int user_cellNo) {
		this.user_cellNo = user_cellNo;
	}
	
	
}
