package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)// id olmadiginda hata vermesin diye ekledik
public class Account {

  //        accounts”: [
  //        {
  //        “id”: 107250,
  //        “description”: “New Account_6thGenQA_01",
  //        “balance”: 11190,
  //        “accountType”: “CHECKING”,
  //        “accountStatusType”: “ACTIVE”,
  //        “createDate”: “2021-11-24T23:00:00Z”,
  //        “closedDate”: “2022-11-24T23:00:00Z”,
  //        “employee”: null,
  //        “accountlogs”: null
  //        }

    private int id;
    private  String description;
    private int balance;
    private String accountType;
    private String accountStatusType;
    private String createDate;
    private String closedDate;
    private boolean employee;
    private boolean accountlogs;

    public Account() {
    }

    public Account(int id, String description, int balance, String accountType, String accountStatusType, String createDate, String closedDate, boolean employee, boolean accountlogs) {
        this.id = id;
        this.description = description;
        this.balance = balance;
        this.accountType = accountType;
        this.accountStatusType = accountStatusType;
        this.createDate = createDate;
        this.closedDate = closedDate;
        this.employee = employee;
        this.accountlogs = accountlogs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountStatusType() {
        return accountStatusType;
    }

    public void setAccountStatusType(String accountStatusType) {
        this.accountStatusType = accountStatusType;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(String closedDate) {
        this.closedDate = closedDate;
    }

    public boolean isEmployee() {
        return employee;
    }

    public void setEmployee(boolean employee) {
        this.employee = employee;
    }

    public boolean isAccountlogs() {
        return accountlogs;
    }

    public void setAccountlogs(boolean accountlogs) {
        this.accountlogs = accountlogs;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                ", accountStatusType='" + accountStatusType + '\'' +
                ", createDate='" + createDate + '\'' +
                ", closedDate='" + closedDate + '\'' +
                ", employee=" + employee +
                ", accountlogs=" + accountlogs +
                '}';
    }
}
