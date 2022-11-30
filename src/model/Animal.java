package src.model;

public class Animal extends Species {
  private int m_nbLimbs = 0;
  private String m_name = "unknow";;
  private Diet m_diet = new Diet();;

  // ------------- Constructors ------------- //
  public Animal(){
    //ctor
  }
  public Animal(String p_name){
    m_name = p_name;
  };
  public Animal(String p_name,String p_diet){
    m_name = p_name;
    m_diet = new Diet(p_diet);
  }
  public Animal(String p_name,Diet p_diet){
    m_name = p_name;
    m_diet = p_diet;
  }
  public Animal(String p_name,String p_diet, String p_species){
    m_name = p_name;
    m_diet = new Diet(p_diet);
    setSpecies(p_species);
  }
  public Animal(String p_name,Diet p_diet, String p_species){
    m_name = p_name;
    m_diet = p_diet;
    setSpecies(p_species);
  }

  // ------------- Log self ------------- //

  /**
    * Console log all animal attributs
    * @return void
    */
  public void logSelf(){
    System.out.println("--------------------------------");
    System.out.println("Name : " + getName()); 
    System.out.println("NbLimbs : " + getNbLimbs()); 
    System.out.println("Diet : " + getDiet().getDietString()); 
    System.out.println("Species : " + getSpecies());
    System.out.println("LifeTime : " + getLifeTime());
    System.out.println("GestationTime : " + getGestationTime());
    return;
  }


  // ------------- Getters ------------- //

  /**
    * Get animal Diet
    * @return Diet m_diet
    */
  public Diet getDiet()
  {
      return m_diet;
  }

  /**
    * Get animal name
    * @return string m_name
    */
  public String getName()
  {
      return m_name;
  }

  /**
    * Get the number of limbs
    * @return int m_nbLimbs
    */
  public int getNbLimbs()
  {
      return m_nbLimbs;
  }

  // ------------- Setters ------------- //

  /**
    * Change the name of animal
    * @param string p_name
    * @return void
    */
  public void setName(String p_name) {
      m_name = p_name;
      return;
  }

  /**
    * Change the number of limbs of an animal
    * @param string p_nbLimbs
    * @return void
    */
  public void setNbLimbs(int p_nbLimbs) {
      m_nbLimbs = p_nbLimbs;
      return;
  }
}