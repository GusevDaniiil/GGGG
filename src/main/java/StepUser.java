import Model.UserRecrestModel;

public class StepUser {
    ApiUser apiUser = new ApiUser();

    public void createUser(String name,String job){
        UserRecrestModel model = new UserRecrestModel(name, job);
        apiUser.createUser(model);
    }

}
