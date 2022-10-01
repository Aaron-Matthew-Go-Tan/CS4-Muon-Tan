public class Ex04MuonTan {
    public static void main(String[] args){
        //1. Student class instances
        Student Mu01 = new Student();
        Student Mu04 = new Student();
        Student Mu09 = new Student();
        
        //2. Song class instances
        Song song1 = new Song();
        song1.inputSongName("Never Gonna Give You Up");      
        Song song2 = new Song();
        song2.inputSongName("Baby Shark");      
        
        //3. Singer class instance and operations
        Singer singer1 = new Singer();
        singer1.favoriteSong = song1;
        singer1.performForAudience(12);
        singer1.changeFavSong(song2);
    }
}
