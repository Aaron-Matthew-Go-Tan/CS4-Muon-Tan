public class Song{
    private String name;
    private String songwriter;
    private int lengthInSeconds;
    private int releaseYear;
    
    public Song(){
        songwriter = "Rick Astley";
        lengthInSeconds = 200;
        releaseYear = 1980;
    }

    public void inputSongName(String a){
      name = a;
    }
}