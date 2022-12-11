package src.model;

public class Diet {
  private String m_diet;

  // ------------- Constructors ------------- //

  /**
   * ctor
   */
  public Diet()
  {
    this.m_diet = "carnivorus";
  }

  /**
   * ctor
   * @param p_diet
   */
  public Diet(String p_diet)
  {
    this.m_diet = p_diet;
  }

  // ------------- Getters ------------- //

  /**
    * Get diet name
    * @return string m_diet
    */
  public String getDietString(){
    return this.m_diet;
  }

  // ------------- Setters ------------- //

  /**
    * Set diet name
    * @param string p_diet
    * @return void 
    */
  public void setDietString(String p_diet){
    this.m_diet = p_diet;
    return;
  }
}
