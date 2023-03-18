public class Griffendor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

//    благородство, честь и храбрость

    public Griffendor(String name,String surname,String faculty,int transgress,int magic,int nobility, int honor, int bravery) {
        super(name, surname, faculty, transgress, magic);
    this.nobility=nobility;
    this.honor=honor;
    this.bravery=bravery;
    }
    public int getNobility(){
        return nobility;
    }

    public int getHonor(){
        return honor;
    }
    public int getBravery(){
        return bravery;
    }
    public void setHonor(int honor) {
        this.honor=honor;
    }
    public void setNobility(int nobility) {
        this.nobility=nobility;
    }
    public void setBravery(int bravery) {
        this.bravery=bravery;
    }

    public  int ability(){
        return nobility+bravery+honor;
    }
 public void compareGrifendor(Griffendor griffendorStudents){
        int ability1 =ability();
        int ability2= griffendorStudents.ability();
        if(ability1>ability2){
            System.out.printf("гриффендорец %s лучше, чем гриффендорец %s ",
            getName(),
            griffendorStudents.getName());
        } else if (ability2>ability1) {
            System.out.printf("гриффендорец %s лучше, чем гриффендорец %s ",
                    griffendorStudents.getName(),
                    getName());
        }
        else {
            System.out.printf("гриффендорец %s такой же как гриффендорец %s ",
                    griffendorStudents.getName(),
                    getName());
        }
 }
    @Override
    public String toString() {
        return  String.format(" %s ;благородство, %d ;честь %d и храбрость %d",super.toString(), nobility,honor, bravery);
    }

}
