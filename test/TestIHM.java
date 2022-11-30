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
    animal.logSelf();

    // Basic animal with name
    Animal bernard = new Animal("bernard");
    bernard.logSelf();

    // Basic animal with name && string diet
    Animal phillipeCarnivorus = new Animal("phillipeCarnivorus","pizza");
    phillipeCarnivorus.logSelf();

    // Basic animal with name && Diet diet
    Diet phillipeDiet = new Diet("omnivorus");
    System.out.println("getonlyDiet : " + phillipeDiet.getDietString()); 
    Animal phillipeCarnivorus2 = new Animal("phillipeCarnivorus2", phillipeDiet);
    phillipeCarnivorus2.logSelf();

    // Basic animal with name && string diet && string p_species
    Animal mamp = new Animal("mamp", "carnivorus", "elephant");
    mamp.logSelf();

    // Basic animal with name && Diet diet && string p_species 
    Diet mamp2Diet = new Diet("carnivorus");
    Animal mamp2 = new Animal("mamp2", mamp2Diet, "elephant");
    mamp2.logSelf();

    return;
  }
}
