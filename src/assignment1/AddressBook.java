package assignment1;

/**
 * Created by KayLee on 16/02/2018.
 */
public class AddressBook {
    private String businessPhone;
    private String firstName;
    private String middleName;
    private String lastName;
    private String homeAddress;
    private String homePhone;
    private String cellPhone;
    private String skypeId;
    private String facebookId;
    private String personalWebsite;

    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

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
        String pattern = "\\d{11}|(?:\\d{4}-){1}(\\d{3}-){1}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
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

    public static String compareNames(String name1, String name2){
        String[] names1 = name1.split("\\s");
        AddressBook person1 = new AddressBook(names1[0], names1[1], names1[2]);

        String[] names2 = name2.split("\\s");
        AddressBook person2 = new AddressBook(names2[0], names2[1], names2[2]);

        boolean[] status = {false, false, false};

        if(names1.length == names2.length){
            for(int i = 0; i < names1.length; i++){
                if(names1[i].equalsIgnoreCase(names2[i]))
                    status[i] = true;
            }
        }

        if(status[0] && status[1] && status[2])
            return "The names are the same";
        else
            return "Sorry, the names are different";
    }

    public AddressBook(String fn){
        this.firstName = fn;
    }

    public AddressBook(String fn, String mn){
        this.firstName = fn;
        this.middleName = mn;
    }

    public AddressBook(String fn, String mn, String ln){
        this.firstName = fn;
        this.middleName = mn;
        this.lastName = ln;
    }

    public AddressBook(String fn, String mn, String ln, String homeAddress,
                       String businessPhone, String homePhone, String cellPhone,
                       String skypeId, String facebookId, String personalWebsite){
        this.firstName = fn;
        this.lastName = ln;
        this.middleName = mn;
        this.homeAddress = homeAddress;
        this.businessPhone = businessPhone;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
        this.skypeId = skypeId;
        this.facebookId = facebookId;
        this.personalWebsite = personalWebsite;
    }

    public static void main(String[] args) {
        System.out.println(AddressBook.compareNames("Mbakwe Caleb Chukwuzugo", "Mbakwe Caleb Chukwuzugo"));
    }

}
