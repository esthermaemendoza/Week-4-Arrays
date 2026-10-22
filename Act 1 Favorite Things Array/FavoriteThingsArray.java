/**
 *
 * @author ADMIN
 */
public class FavoriteThingsArrayWeek5 {
     public static void main(String[] args) {
        String[] faves = {"Singing", "Dancing", "Swimming", "Travel", "Movies"};
        
        for (int a = 0; a < faves.length; a++) {
            System.out.println((a + 1) + ". " + faves[a]);
        }
        
        System.out.println("Total Favorites: " + faves.length);
    }
}
