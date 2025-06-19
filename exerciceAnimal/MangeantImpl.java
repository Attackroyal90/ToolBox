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

    @Override
    public void manger(){
        for (int i=1; i<3;i++){
            System.out.println("bouchée: "+i);
            if(Math.random()<0.3){
                System.out.println("pas terrible");
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
