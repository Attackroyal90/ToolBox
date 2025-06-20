package exerciceAnimal;

public class MangeantImpl implements Mangeant{

    private int appetit;
    private int age;
    private int niveauEnergie;

    public MangeantImpl(int appetit, int age) {
        this.appetit = appetit;
        this.age = age;
        this.niveauEnergie = 0;
    }

    public int getAppetit() {
        return appetit;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNiveauEnergie() {
        return niveauEnergie;
    }

    public void setNiveauEnergie(int niveauEnergie) {
        this.niveauEnergie = niveauEnergie;
    }

    @Override
    public void manger(){
        for (int i=1; i<4;i++){
            System.out.println("bouchée: "+i);
            if(Math.random()<0.3){
                System.out.println("pas terrible");
            }else{
                System.out.printf("Mmmh, pas mal !\n");
            }
            niveauEnergie += 10;
        }
        System.out.println("fin du repas");
    }

    @Override
    public int besoinEnergie(int appetit, int age){
        this.appetit = appetit;
        this.age = age;
        return appetit * age /2;
    }
}
