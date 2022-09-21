public class Ex03MuonTan {
    public static void main(String[] args){
        //1. Student class instances
        Student Mu01 = new Student();
        Student Mu04= new Student();
        Student Mu09 = new Student();
        
        //2. Song class instances
        Song song1 = new Song();
        song1.name = "Never Gonna Give You Up";
        
        Song song2 = new Song();
        song2.name = "Baby Shark";
        
        //3. Singer class instance and operations
        Singer singer1 = new Singer();
        singer1.favoriteSong = song1;
        System.out.println(singer1.favoriteSong.name);
    }
}
