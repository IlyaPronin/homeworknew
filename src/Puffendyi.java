public class Puffendyi extends Hogwarts{
//    трудолюбивы, верны, честны
private int diligence;
    private int loyalty;
    private int honesty;


    public Puffendyi(String name,String surname,String faculty,int transgress,int magic,int diligence, int loyalty, int honesty) {
       super(name, surname, faculty, transgress, magic);
        this.diligence=diligence;
        this.loyalty=loyalty;
        this.honesty=honesty;
    }
    public int getDiligence(){
        return diligence;
    }

    public int getLoyalty(){
        return loyalty;
    }
    public int getHonesty(){
        return honesty;
    }
    public void setHonesty(int honesty) {
        this.honesty=honesty;
    }
    public void setDiligence(int diligence) {
        this.diligence=diligence;
    }
    public void setLoyalty(int loyalty) {
        this.loyalty=loyalty;
    }
    public  int ability(){
        return honesty+diligence+loyalty;
    }
    public void comparePuffendyi(Puffendyi puffendyi){
        int ability1 =ability();
        int ability2= puffendyi.ability();
        if(ability1>ability2){
            System.out.printf("Пуффендорец %s лучше, чем пуффендорец %s ",
                    getName(),
                    puffendyi.getName());
        } else if (ability2>ability1) {
            System.out.printf("Пуффендорец %s лучше, чем пуффендорец %s ",
                    puffendyi.getName(),
                    getName());
        }
        else {
            System.out.printf("Пуффендорец %s такой же как пуффендорец %s ",
                    puffendyi.getName(),
                    getName());
        }
    }
    @Override
    public String toString() {
        return  String.format(" %s ;трудолюбивость,  %d ;верность, %d и  честь %d"
                ,super.toString(), diligence,loyalty, honesty);
    }
}

