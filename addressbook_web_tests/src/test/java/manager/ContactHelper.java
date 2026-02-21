package manager;


import model.ContactData;
import org.openqa.selenium.By;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }
    public void createContact(ContactData contact) {
        openContactPage();
        fillContactForm(contact);
        submitContactCreation();
        returnToHomePage();
    }

    public void openContactPage() {
        click(By.linkText("add new"));
    }

    public void fillContactForm(ContactData contact) {
        type(By.name("firstname"), contact.firstName());
        type(By.name("address"), contact.address());
        type(By.name("lastname"), contact.lastName());
        type(By.name("email"), contact.allEmail());
        type(By.name("mobile"), contact.allPhone());
    }
    private void submitContactCreation() {
        click(By.name("submit"));
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));

    }

    public boolean isContactPresent() {
        openContactPage();
        return manager.isElementPresent(By.name("selected[]"));
    }

    public void removeContact(ContactData contact) {
        selectContact(contact);
        removeSelectedContact();
        returnToHomePage();

    }

    private void selectContact(ContactData contact) {
        click(By.xpath(String.format("//td/input[@id='%s']", contact.id())));
    }
    private void removeSelectedContact() {
        click(By.name("delete"));
    }

    public List<ContactData> getList() {
        var contacts = new ArrayList<ContactData>();
        var tableRows = manager.driver.findElements(By.xpath("//tr[@name='entry']"));
        for (var tableRow: tableRows ) {
            var id = tableRow.findElement(By.xpath("td/input")).getAttribute("id");
            var lastName = tableRow.findElement(By.xpath("td[2]")).getText();
            var name = tableRow.findElement(By.xpath("td[3]")).getText();
            var address = tableRow.findElement(By.xpath("td[4]")).getText();
            var email = tableRow.findElement(By.xpath("td[5]")).getText();
            var phone = tableRow.findElement(By.xpath("td[6]")).getText();
            contacts.add(new ContactData(id, lastName,name, address, email,phone));
        }
        return contacts;
    }

}
