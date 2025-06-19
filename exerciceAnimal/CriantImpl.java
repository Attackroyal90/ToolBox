package exerciceAnimal;

public class CriantImpl implements Criant{

    private int niveauStress;

    public CriantImpl(int niveauStress) {
        this.niveauStress = niveauStress;
    }

    @Override
    public void crier() {
        if(niveauStress < 2) {
            System.out.println("Ah là, on est bien !");
        } else {
            System.out.println("Oh non ! Il est triste");
        }
    }

    @Override
    public boolean estEnColere() {
        if(niveauStress > 5){
            return true;
        }else {
            return false;
        }
    }
}
