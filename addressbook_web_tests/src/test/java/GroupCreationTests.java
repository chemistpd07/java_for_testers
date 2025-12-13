import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void CanCreateGroup() {
        openGroupsPage();
        createGroup("group name", "group header", "group footer");
    }

    @Test
    public void CanCreateGroupWithEmptyNape() {
        openGroupsPage();
        createGroup("", "", "");

    }
}
