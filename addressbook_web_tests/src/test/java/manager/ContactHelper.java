package manager;


import model.ContactData;
import org.openqa.selenium.By;

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

    public void removeContact() {
        selectContact();
        removeSelectedContact();
        openContactPage();

    }

    private void selectContact() {
        click(By.name("selected[]"));
    }
    private void removeSelectedContact() {
        click(By.name("delete"));
    }

}
