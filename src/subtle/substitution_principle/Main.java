package subtle.substitution_principle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Building building = new Building();
        Office office = new Office();
        House house = new House();
        build(building);
        build(office);
        build(house);

        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Office());
        buildings.add(new House());
        printBuildings(buildings);

        // The code below won't work before modifying main because 
        // the substitution principle is not implemented.
        // We need to add wildcards (? extends and ? super)
        // Not recommended abusing of this though, code can get messy
        
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        printBuildings(houses);
    }

    static void build(Building building) {
        System.out.println("Constructing a new " + building.toString());
    }

    // Adding <"? extends" Building>
    static void printBuildings(List<? extends Building> buildings){
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(i + 1 + ": " + buildings.get(i).toString());
        }
    }

    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
        System.out.println();
    }
}
