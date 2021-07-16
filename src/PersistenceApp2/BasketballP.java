package PersistenceApp2;

public class BasketballP {
    
    private String name,surname,team;
    private int dress_number,age;

    public BasketballP() {
    }

    public BasketballP(String name, String surname, String team, int dress_number, int age) {
        this.name = name;
        this.surname = surname;
        this.team = team;
        this.dress_number = dress_number;
        this.age = age;
    }

    public BasketballP(String name, String surname, int dress_number) {
        this.name = name;
        this.surname = surname;
        this.dress_number = dress_number;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDress_number() {
        return dress_number;
    }

    public void setDress_number(int dress_number) {
        this.dress_number = dress_number;
    }

    @Override
    public String toString() {
        return "BasketballP: " + "name:" + name + ", surname:" + surname + "team:"+ team + " , dress_number:" + dress_number + "age:" + age + '}';
    }
    
}
