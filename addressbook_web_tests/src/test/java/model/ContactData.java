package model;

public record ContactData(
        String id,
        String lastName,
        String firstName,
        String address,
        String allEmail,
        String allPhone
) {
    public ContactData() {
        this("", "", "", "", "", "");
    }

    public ContactData withId(String id) {
        return new ContactData( id, this.lastName, this.firstName, this.address, this.allEmail, this.allPhone);
    }
    public ContactData withName(String firstName) {
        return new ContactData( this.id, this.lastName, firstName, this.address, this.allEmail, this.allPhone);
    }

    public ContactData withLastName(String lastName) {
        return new ContactData( this.id, lastName, this.firstName, this.address, this.allEmail, this.allPhone);
    }
}
