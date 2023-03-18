public class Coktevran extends Hogwarts {
//    умны, мудры, остроумны и полны творчества.
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Coktevran (String name,String surname,String faculty,int transgress,int magic,int mind, int wisdom, int wit, int creativity) {
       super(name, surname, faculty, transgress, magic);
        this.mind=mind;
        this.wisdom=wisdom;
        this.wit=wit;
        this.creativity=creativity;

         }
    public int getMind(){
        return mind;
    }
    public int getWisdom(){
        return wisdom;
    }
    public int getWit(){
        return wit;
    }
    public int getCreativity(){
        return creativity;
    }
    public void setMind(int mind){
        this.mind=mind;
    }
    public void setWisdom(int wisdom){
        this.wisdom=wisdom;
    }
    public void setWit(int wit){
        this.wit=wit;
    }
    public void setCreativity(int creativity){
        this.creativity=creativity;
    }
    public  int ability(){
        return creativity+wit+wisdom+mind;
    }
    public void compareCoktervan(Coktevran coktevran){
        int ability1 =ability();
        int ability2= coktevran.ability();
        if(ability1>ability2){
            System.out.printf("Коктевранец %s лучше, чем коктевранец %s ",
                    getName(),
                    coktevran.getName());
        } else if (ability2>ability1) {
            System.out.printf("Коктевранец %s лучше, чем коктевранец %s ",
                    coktevran.getName(),
                    getName());
        }
        else {
            System.out.printf("Коктевранец %s такой же как коктевранец %s ",
                    coktevran.getName(),
                    getName());
        }
    }
    @Override
    public String toString() {
        return  String.format(" %s ;ум,  %d мудрость,  %d остроумие , %d и творчество %d"
                ,super.toString(), mind, wisdom, wit,creativity);
    }
}
