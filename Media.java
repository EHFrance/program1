/*Media.java
 * Prospective Media class rewrite.
 * Inherited by audio, CD, video and DVD.
 * Utilises Aritst.
 * Author: Edward France
 * Date: 11/7/2020
 */

public class Media implements Cloneable
{
  private String title;
  private Artist majorArtist;
  private int playTime;
  private int numPlays;
  
  //Constructor
  public Media(String t, Artist ma, int pt, int np)
  {
    title = t;
    majorArtist = ma;
    playTime = pt;
    numPlays = np;
  }
  
  //Null Constructor
  public Media()
  {
    title = " ";
    majorArtist = new Artist();
    playTime = 0;
    numPlays = 0;
  }
  
  //Accessors
  public String getTitle()
  {
    return title;
  }
  
  public Artist getMajorArtist()
  {
    return majorArtist;
  }
  
  public int getPlayTime()
  {
     return playTime;
  }
  
  public int getNumPlays()
  {
    return numPlays;
  }
  
  //toString
  public String toString()
  {
    return "\nTitle: " + title + 
           "\nMajor Artist: " + majorArtist.toString() + 
           "\nPlay Time: " + playTime + 
           "\nNumber of Plays: " + numPlays;
  }
  
  //PlayMedia
  public void playMedia()
  {
    System.out.println("Now Playing: " + title);
    System.out.println("By: " + majorArtist);
    if(instanceof CD)
      System.out.println("On CD");
    if(instanceof DVD)
      System.out.println("On DVD");
    System.out.println("Number of plays: " + numPlays);
    numPlays++;
  }
  
  //Equals
  public boolean equals(Object o)
  {
    boolean equals;
    if(o instanceof Media)
    {
      Media other = (Media) o;
      if((other.title == title) &&(other.majorArtist == majorArtist) && (other.playTime == playTime) && (other.numPlays == numPlays))
        equals = true;
    }
    else
      equals = false;
    return equals;
  }
  
  //Clone
  public object clone()
  {
    Media cloned = new Media(title, majorArtist, playTime, numPlays);
    return cloned;
  }
}