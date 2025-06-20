package exerciceAnimal;

public class BergerAllemand extends Chien implements Mangeant{

    private MangeantImpl mangeantImpl;


    public BergerAllemand(String nom, int age, int appetit) {
        super(nom, age);
        this.mangeantImpl = new MangeantImpl(appetit, age);
    }

    @Override
    public void manger() {
        mangeantImpl.manger();
    }

    @Override
    public int getAppetit() {
        return mangeantImpl.getAppetit();
    }

    @Override
    public int besoinEnergie(int appetit, int age) {
        return mangeantImpl.besoinEnergie(appetit, age);
    }
}
