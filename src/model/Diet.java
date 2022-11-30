package src.model;

public class Diet {
  private String m_diet;

  // ------------- Constructors ------------- //
  public Diet()
  {
    m_diet = "carnivorus";
  }
  public Diet(String p_diet)
  {
    m_diet = p_diet;
  }

  // ------------- Getters ------------- //

  /**
    * Get diet name
    * @return string m_diet
    */
  public String getDietString(){
    return m_diet;
  }

  // ------------- Setters ------------- //

  /**
    * Set diet name
    * @param string p_diet
    * @return void 
    */
  public void setDietString(String p_diet){
    m_diet = p_diet;
    return;
  }
}
