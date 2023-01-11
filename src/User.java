public class User {
    private String name;
    private String email;
    private String cpf;
    private int age;
    private String school;

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public String getSchool(){
        return this.school;
    }
}
