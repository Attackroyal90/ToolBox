package exerciceAnimal;

public interface Criant {

    /**
     *L'animal crie en fonction du niveau de stress
     * @return
     */
    public void crier();

    /**
     * Si niveau de stress trop élevé, l'animal est en colère
     * @return
     */
    public boolean estEnColere();
}
