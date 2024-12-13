package pkg;

public class Movie{
    String movie;
    double rating;
    int num;
    int rev;
    public Movie(){
        movie=new String("Avengers");
        rating=8;
        num=33;
        rev=623357910;
    }
    
    public Movie(String movie,double rating,int num, int rev){
        this.movie=movie;
        this.rating=rating;
        this.num=num;
        this.rev=rev;
        
    }
    
    public void addRating(double rating){
       this.rating=this.rating*num;
       this.rating=this.rating+rating;
       num=num+1;
       this.rating=this.rating/num;
        
        
    }
    
    public String getMovieName(){
        return movie;
    }
    public int getRevenue(){
        return rev;
    }
    
    public void movieToString(){
        System.out.println("Movie: "+movie);
        System.out.println("Rating: "+rating);
        System.out.println("Number of Ratings: "+num);
        System.out.println("Reveue: "+rev);
        System.out.println(" ");
    }
    public double getRating(){
        return rating;
    }
    public boolean compareRatings(Movie a){
        return a.getRating()<this.rating;
        
    }
    

}
