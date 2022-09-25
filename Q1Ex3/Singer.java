public class Singer{
    public String name;
    public int noOfPerformances;
    public double earnings;
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
    public void changeFavSong(Song newFavSong) {
      favoriteSong = newFavSong;
    }
}