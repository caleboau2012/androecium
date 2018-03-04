package assignment1;

/**
 * Created by KayLee on 16/02/2018.
 */
public class AddressBook {

    private String firstName;
    private String middleName;
    private String lastName;
    private String homeAddress;
    private String homePhone;
    private String cellPhone;
    private String skypeId;
    private String facebookId;
    private String personalWebsite;

    public String getPersonalWebsite() {
        return personalWebsite;
    }

    public void setPersonalWebsite(String personalWebsite) {
        String regex = "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        if(personalWebsite.matches(regex))
            this.personalWebsite = personalWebsite;

    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getSkypeId() {
        return skypeId;
    }

    public void setSkypeId(String skypeId) {
        this.skypeId = skypeId;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        String pattern = "\\d{11}|(?:\\d{4}-){1}\\d{3}-){1}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
        if(cellPhone.matches(pattern))
            this.cellPhone = cellPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        String pattern = "\\d{11}|(?:\\d{4}-){1}(\\d{3}-){1}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
        if(homePhone.matches(pattern))
            this.homePhone = homePhone;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String regex = "^[\\p{L} .'-]+$";
        if(lastName.matches(regex))
            this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        String regex = "^[\\p{L} .'-]+$";
        if(middleName.matches(regex))
            this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String regex = "^[\\p{L} .'-]+$";
        if(firstName.matches(regex))
            this.firstName = firstName;
    }

    public String compareNames(String name1, String name2){
        String[] names1 = name1.split("\\s");
        String[] names2 = name1.split("\\s");

        if(names1.length != names2.length)
            return "false";

        for(int i = 0; i < names1.length; i++){
            return (names1[i].equalsIgnoreCase(names2[i]))?"true":"false";
        }

        return "true";
    }


}
