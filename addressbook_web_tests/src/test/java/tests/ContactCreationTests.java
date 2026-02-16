package tests;

import model.ContactData;
import model.GroupData;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

public class ContactCreationTests extends TestBase {


    public static List<ContactData> contactProvider() {
        var result = new ArrayList<ContactData>();
        for (int i = 0; i < 5; i++) {
            result.add(new ContactData(
                    randomString(i *10),
                    randomString(i *10),
                    randomString(i *10),
                    randomString(i *10),
                    randomString(i * 10)
                    ));
        }
        return result;
    }
    @ParameterizedTest
    @MethodSource("contactProvider")
    public void canCreateMultipleContact(ContactData contact){
        app.contacts().createContact(contact);
    }
}
