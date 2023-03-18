public abstract class Hogwarts {
    private String name;
    private String surname;
    private String faculty;
    private int transgress;
    private int magic;

    public Hogwarts(String name,String surname,String faculty,int transgress,int magic){
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.transgress = transgress;
        this.magic= magic;
    }
    public int getTransgress() {
        return transgress;
    }

    public int getMagic() {
        return magic;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public  int ability(){
        return magic+transgress;
    }
    public void compareHogwarts(Hogwarts hogwarts){
        int ability1 =ability();
        int ability2= hogwarts.ability();
        if(ability1>ability2){
            System.out.printf("Студент %s лучше, чем студент %s ",
                    getName(),
                    hogwarts.getName());
        } else if (ability2>ability1) {
            System.out.printf("Студент %s лучше, чем студент %s ",
                    hogwarts.getName(),
                    getName());
        }
        else {
            System.out.printf("Студент %s такой же как студент %s ",
                    hogwarts.getName(),
                    getName());
        }
    }

    public void  print(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return  String.format("Студент %s ;сила магии%d ;сила трансгрессии%d ",name,magic,transgress);
    }
}
