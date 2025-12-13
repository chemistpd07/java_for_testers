import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void CanCreateGroup() {
        openGroupsPage();
        createGroup(new GroupData("group name", "group header", "group footer"));
    }

    @Test
    public void CanCreateGroupWithEmptyNape() {
        openGroupsPage();
        createGroup(new GroupData());

    }

    @Test
    public void CanCreateGroupWithName() {
        openGroupsPage();
        var emptyGroup = new GroupData();
        var groupWithName = emptyGroup.withName("");
        createGroup(groupWithName);

    }
}
