import java.util.ArrayList;
import java.util.List;

public class Portal<T extends Pet> {
    List<T> pets;

    Portal(){
        this.pets=new ArrayList<>();
    }

    void add(T pet){
        pets.add(pet);
    }
    void displayData(){
        for(T pet : pets){
            System.out.println(pet.type+" "+pet.age+" "+pet.isAdopted);
        }
    }
}
