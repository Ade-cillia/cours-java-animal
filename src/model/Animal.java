package src.model;

public class Animal extends Species {
  private int m_nbLimbs = 0;
  private String m_name = "unknow";;
  private Diet m_diet = new Diet();;

  // ------------- Constructors ------------- //

  /**
   * ctor
   */
  public Animal() {
  }

  /**
   * ctor
   * 
   * @param p_name
   */
  public Animal(String p_name) {
    this.m_name = p_name;
  };

  /**
   * ctor
   * 
   * @param p_name
   * @param p_diet
   */
  public Animal(String p_name, String p_diet) {
    this.m_name = p_name;
    this.m_diet = new Diet(p_diet);
  }

  /**
   * ctor
   * 
   * @param p_name
   * @param p_diet
   */
  public Animal(String p_name, Diet p_diet) {
    this.m_name = p_name;
    this.m_diet = p_diet;
  }

  /**
   * ctor
   * 
   * @param p_name
   * @param p_diet
   * @param p_species
   */
  public Animal(String p_name, String p_diet, String p_species) {
    super(p_species);
    this.m_name = p_name;
    this.m_diet = new Diet(p_diet);
  }

  /**
   * ctor
   * 
   * @param p_name
   * @param p_diet
   * @param p_species
   */
  public Animal(String p_name, Diet p_diet, String p_species) {
    super(p_species);
    this.m_name = p_name;
    this.m_diet = p_diet;
  }

  // ------------- Override ------------- //

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder strBuilder = new StringBuilder("");
    strBuilder.append("--------------------------------\n");
    strBuilder.append("Name : ").append(getName()).append("\n");
    strBuilder.append("NbLimbs : ").append(getNbLimbs()).append("\n");
    strBuilder.append("Diet : ").append(getDiet().getDietString()).append("\n");
    strBuilder.append("Species : ").append(getSpecies()).append("\n");
    strBuilder.append("LifeTime : ").append(getLifeTime()).append("\n");
    strBuilder.append("GestationTime : ").append(getGestationTime()).append("\n");
    return strBuilder.toString();
  }

  // ------------- Getters ------------- //

  /**
   * Get animal Diet
   * 
   * @return Diet m_diet
   */
  public Diet getDiet() {
    return this.m_diet;
  }

  /**
   * Get animal name
   * 
   * @return string m_name
   */
  public String getName() {
    return this.m_name;
  }

  /**
   * Get the number of limbs
   * 
   * @return int m_nbLimbs
   */
  public int getNbLimbs() {
    return this.m_nbLimbs;
  }

  // ------------- Setters ------------- //

  /**
   * Change the name of animal
   * 
   * @param string p_name
   * @return void
   */
  public void setName(String p_name) {
    this.m_name = p_name;
    return;
  }

  /**
   * Change the number of limbs of an animal
   * 
   * @param string p_nbLimbs
   * @return void
   */
  public void setNbLimbs(int p_nbLimbs) {
    this.m_nbLimbs = p_nbLimbs;
    return;
  }
}