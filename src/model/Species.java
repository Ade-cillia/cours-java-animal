package src.model;

public class Species {
  private String m_species;
  private String m_lifeTime; // lifeTime (ex: 10-18 Years, 80 Years, 156 Days, etc...)
  private String m_gestationTime; // lifeTime (ex: 10-18 Days, 9 Month, etc...)

  // ------------- Constructors ------------- //
  public Species()
  {
    m_species = "chat";
    m_lifeTime = "12-18 Years";
    m_gestationTime = "65 Days";
  }

  // ------------- Getters ------------- //

  /**
     * Get species name
    * @return string m_species
    */
  public String getSpecies()
  {
      return m_species;
  }

  /**
     * Get lifeTime
    * @return string m_lifeTime
    */
  public String getLifeTime()
  {
      return m_lifeTime;
  }

  /**
     * Get gestationTime
    * @return string m_gestationTime
    */
  public String getGestationTime()
  {
      return m_gestationTime;
  }

  // ------------- Setters ------------- //

  /**
     * Set species name
    * @param string p_species
    * @return void 
    */
  public void setSpecies(String p_species)
  {
      m_species = p_species;
      return;
  }

  /**
     * Change the gestationTime
    * @param string p_gestationTime
    * @return void 
    */
  public void setGestationTime(String p_gestationTime)
  {
      m_gestationTime = p_gestationTime;
      return;
  }

  /**
     * For Change the lifetime
    * @param string p_lifeTime
    * @return void
    */
  public void setLifeTime(String p_lifeTime)
  {
      m_lifeTime = p_lifeTime;
      return;
  }

}
