package dethi2022_2023_clc;

public class Author {
    private String name ;
    private String email ;
    private Character gender ;

    public Author(){
        name = null ;
        email = null ;
        gender = null ;
    }
    public Author(String name , String emai , Character gender)
    {
        this.name = name ;
        this.email = emai ;
        this.gender = gender ;
    }
    public String getName(){
        return name ;
    }
    public String getEmail(){
        return email;
    }
    public Character getGender()
    {
        return gender ;
    }
}
