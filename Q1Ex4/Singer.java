public class Singer{
    private String name;
    private int noOfPerformances;
    private static int totalPerformances;
    private double earnings;
    Song favoriteSong;
    
    public Singer(){
        name = "Rick Astley";
        noOfPerformances = 0;
        earnings = 0;
    }

    public void performForAudience(int numberOfPeople) {
      noOfPerformances = noOfPerformances + 1;
      earnings = earnings + numberOfPeople * 100;
    }
  public void performForAudience(int numberOfPeople, Singer singer1, Singer singer2) {
    noOfPerformances = noOfPerformances + 1;
    singer1.earnings = earnings + numberOfPeople * 50;
    singer2.earnings = earnings + numberOfPeople * 50;
  }

    public void changeFavSong(Song newFavSong) {
      favoriteSong = newFavSong;
    }
}