package Model;


public class UserRecrestModel {
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    private String name;

    public UserRecrestModel(String name, String job) {
        this.name = name;
        this.job = job;
    }

    private String job;


}



