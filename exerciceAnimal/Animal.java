package exerciceAnimal;

public class Animal implements Mangeant, Criant{

    private String nom;
    private int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void afficherInfos(){
        System.out.println("C'est "+ nom + ", il est age de "+ age + " ans !");
    }

    @Override
    public void crier() {

    }

    @Override
    public boolean estEnColere() {
        return false;
    }

    @Override
    public void manger() {

    }

    @Override
    public int getAppetit() {
        return 0;
    }

    @Override
    public int besoinEnergie(int appetit, int age) {
        return 0;
    }
}
