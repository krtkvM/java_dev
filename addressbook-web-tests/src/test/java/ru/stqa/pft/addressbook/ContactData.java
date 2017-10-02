package ru.stqa.pft.addressbook;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String title;
    private final String company;
    private final String address;
    private final String telHome;
    private final String telMobile;
    private final String telWork;
    private final String fax;
    private final String email;

    public ContactData(String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String telHome, String telMobile, String telWork, String fax, String email) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.telHome = telHome;
        this.telMobile = telMobile;
        this.telWork = telWork;
        this.fax = fax;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getTelHome() {
        return telHome;
    }

    public String getTelMobile() {
        return telMobile;
    }

    public String getTelWork() {
        return telWork;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }
}
