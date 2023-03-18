public class Slizerrin extends Hogwarts {
//    хитрость, решительность, амбициозность, находчивость и жажда власти.
    private int trick;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;
    private  int lustForPower;

    public Slizerrin (String name,String surname,String faculty,int transgress,int magic,int trick, int decisiveness, int ambition, int resourcefulness,int lustForPower) {
        super(name, surname, faculty, transgress, magic);
        this.trick =trick;
        this.decisiveness =decisiveness;
        this.ambition =ambition;
        this.resourcefulness =resourcefulness;
        this.lustForPower = lustForPower;

    }
    public int getTrick(){
        return trick;
    }
    public int getDecisiveness(){
        return decisiveness;
    }
    public int getAmbition(){
        return ambition;
    }
    public int getResourcefulness(){
        return resourcefulness;
    }
    public int getLustForPower(){
        return lustForPower;
    }
    public void setTrick(int trick){
        this.trick=trick;
    }
    public void setDecisiveness(int decisiveness){
        this.decisiveness=decisiveness;}

    public void setAmbition(int ambition){
        this.ambition=ambition;
    }
    public void setResourcefulness(int resourcefulness){
        this.resourcefulness=resourcefulness;
    }
    public void setLustForPower(int lustForPower){
        this.lustForPower=lustForPower;
    }
    public  int ability(){
        return decisiveness+ambition+resourcefulness+lustForPower;
    }

    public void compareSlizerin(Slizerrin slizerrin){
        int ability1 =ability();
        int ability2= slizerrin.ability();
        if(ability1>ability2){
            System.out.printf("Слизоровец %s лучше, чем слизоровец %s ",
                    getName(),
                    slizerrin.getName());

        } else if (ability2>ability1) {
            System.out.printf("Слизоровец %s лучше, чем слизоровец %s ",
                    slizerrin.getName(),
                    getName());

        }
        else {
            System.out.printf("Слизоровец %s такой же как слизоровец %s ",
                    slizerrin.getName(),
                    getName());
        }
    }
    @Override
    public String toString() {
        return  String.format(" %s  хитрость %d, решительность %d,  амбициозность %d, находчивость %d и жажда власти %d."
                ,super.toString(), trick, decisiveness, ambition,resourcefulness,lustForPower);
    }
}
