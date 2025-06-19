package exerciceAnimal;

public interface Mangeant {

    /**
     *Permet à l'animal de prendre des bouchées et de voir le niveau en énergie
     * @return
     */
    public void manger();

    /**
     * Calcule le besoin en énergie de l'animal
     * @return
     */
    int besoinEnergie(int appetit, int age);
}
