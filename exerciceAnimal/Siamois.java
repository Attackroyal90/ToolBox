package exerciceAnimal;

public class Siamois extends Chat implements Mangeant, Criant{

    private MangeantImpl mangeantImpl;
    private CriantImpl criantImpl;


    public Siamois(String nom, int age, int niveauStress, int appetit) {
        super(nom, age);
        this.criantImpl = new CriantImpl(niveauStress);
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

    @Override
    public void crier() {
        criantImpl.crier();
    }

    @Override
    public boolean estEnColere() {
        return criantImpl.estEnColere();
    }
}
