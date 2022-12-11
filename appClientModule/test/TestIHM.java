package test;
import src.model.*;

public abstract class TestIHM {
  /**
   * Test the IHM for the creation of animal
   * @return void
   */
  public static void lunchTest(){
    System.out.println("Start TestIHM"); 
    // Basic animal
    Animal animal = new Animal();
    System.out.println(animal);

    // Basic animal with name
    Animal bernard = new Animal("bernard");
    System.out.println(bernard);

    // Basic animal with name && string diet
    Animal phillipeCarnivorus = new Animal("phillipeCarnivorus","pizza");
    System.out.println(phillipeCarnivorus);


    // Basic animal with name && Diet diet
    Diet phillipeDiet = new Diet("omnivorus");
    System.out.println("getonlyDiet : " + phillipeDiet.getDietString()); 
    Animal phillipeCarnivorus2 = new Animal("phillipeCarnivorus2", phillipeDiet);
    System.out.println(phillipeCarnivorus2);

    // Basic animal with name && string diet && string p_species
    Animal mamp = new Animal("mamp", "carnivorus", "elephant");
    System.out.println(mamp);

    // Basic animal with name && Diet diet && string p_species 
    Diet mamp2Diet = new Diet("carnivorus");
    Animal mamp2 = new Animal("mamp2", mamp2Diet, "elephant");
    System.out.println(mamp2);

    return;
  }
}
