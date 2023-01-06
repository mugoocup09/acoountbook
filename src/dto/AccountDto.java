package dto;

public class AccountDto {

	// 항목들
	private String date;   // 날짜 년,월,일   - 22/12/14  22/12/27
	private String use;    // 용도  		 - 영화관람      월급
	private String classfy; // 수입/지출  - 지출          수입 
	private int money;     // 금액       - 25000        3000000
	private String memo;    // 메모     - 아바타2        12월급여
	
	public AccountDto() {
		// TODO Auto-generated constructor stub
		
	
	}

	public AccountDto(String date, String use, String classfy, int money, String memo) {
		super();
		this.date = date;
		this.use = use;
		this.classfy = classfy;
		this.money = money;
		this.memo = memo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getClassfy() {
		return classfy;
	}

	public void setClassfy(String classfy) {
		this.classfy = classfy;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "AccountDto [date=" + date + ", use=" + use + ", classfy=" + classfy + ", money=" + money + ", memo="
				+ memo + "]";
	}
	
	
	
	
}
