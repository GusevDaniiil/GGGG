import org.testng.annotations.Test;

public class TestPost {
    StepUser stepUser = new StepUser();

    @Test
    public  void firsTest(){
        stepUser.createUser("name","job");
    }
}
