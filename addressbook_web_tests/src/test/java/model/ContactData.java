package model;

public record ContactData(
        String lastName,
        String firstName,
        String address,
        String allEmail,
        String allPhone
) {
    public ContactData() {
        this("", "", "", "", "");
    }
}
