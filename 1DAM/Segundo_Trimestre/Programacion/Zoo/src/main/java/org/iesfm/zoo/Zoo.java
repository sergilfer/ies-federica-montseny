package org.iesfm.zoo;

public class Zoo implements IZoo{
    private String name;
    private Animal [] animals;

    public Zoo(String name, Animal[] animals) {
        this.name = name;
        this.animals = animals;
    }

    public int getNumberAnimalsCage(int numberCage) {
        int cont = 0 ;
        for (int i = 0 ; i < animals.length; i++){
            if (animals[i].getCage() == numberCage){
                cont++;
            }
        }
        if (cont == 0){
            throw new CageNotFoundException(numberCage);
        }
        return cont;
    }

    public int getNumberAnimalsFeeding(String feeding) {
        int cont = 0 ;
        for (int i = 0 ; i < animals.length; i++){
            if (animals[i].getFeeding().equals(feeding)){
                cont++;
            }
        }
        if (cont == 0){
            throw new FeedingNotFoundException(feeding);
        }
        return cont;
    }

    public int getNumberAnimalsSpecie(String species, int numberCage) {
        int cont = 0 ;
        for (int i = 0 ; i < animals.length; i++){
            if (animals[i].getSpecie().equals(species) &&
                    animals[i].getCage() == numberCage){
                cont++;
            }
        }
        if (cont == 0){
            throw new CageNotFoundException(numberCage);
        }
        return cont;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
}
