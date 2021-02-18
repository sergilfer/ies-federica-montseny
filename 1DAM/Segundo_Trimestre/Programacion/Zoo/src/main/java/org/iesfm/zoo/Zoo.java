package org.iesfm.zoo;

public class Zoo implements IZoo{
    private String name;
    private Animal [] animals;

    public Zoo(String name, Animal[] animals) {
        this.name = name;
        this.animals = animals;
    }
private Animal foundAnimalCage (int numberCage) throws CageNotFoundException {
        Animal result = null;
        for (int i = 0 ; i < animals.length; i++){
            Animal animal = animals[i];
            if (animal.getCage() == numberCage){
                result = animal;
            }
        }
        if (result == null){
            throw new CageNotFoundException(numberCage);
        }
        return result;
}

    public int getNumberAnimalsCage(int numberCage) {
        int cont = 0 ;
        for (int i = 0 ; i < animals.length; i++){
            if (animals[i].getCage() == numberCage){
                cont++;
            }
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
        return cont;
    }

    public int getNumberAnimalsSpecie(String species, int cage) {
        int cont = 0 ;
        for (int i = 0 ; i < animals.length; i++){
            if (animals[i].getSpecie().equals(species) &&
                    animals[i].getCage() == cage){
                cont++;
            }
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
