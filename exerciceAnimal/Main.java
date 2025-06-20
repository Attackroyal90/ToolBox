package exerciceAnimal;

public abstract class Main implements Mangeant,Criant{
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new BergerAllemand("Rex",6,10);
        animals[1] = new Siamois("Coco",8,7,3);

        for(Animal animal : animals){
            animal.afficherInfos();
            if(animal instanceof Mangeant){
                animal.manger();
                System.out.println("Il a un besoin en energie de : "+animal.besoinEnergie(animal.getAppetit(), animal.getAge()));
            }
            if (animal instanceof Criant) {
                animal.crier();
                 if(animal.estEnColere() == true){
                     System.out.println("Il est en colère !");
                 } else {
                     System.out.println("Il est calme");
                 }
            }
        }
    }
}
