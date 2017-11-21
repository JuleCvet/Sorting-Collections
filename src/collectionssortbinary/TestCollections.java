
package collectionssortbinary;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);
   
 //List<Artist> artists = new ArrayList<>();  //kreirame prazna i ja popolnuvame
HashSet<Artist> artists = new HashSet<>();//so 2-ta metoda prepishani vo Artist, moze da koristime HashSet
//vrednosta Artist ja pravime so konstruktor vo dr klasa vo istiov paket kako nov objekt
Artist art1 = new Artist("Azad", "1981");
Artist art2 = new Artist("Bita", "1984");
Artist art3 = new Artist("Pauline", "1975");
Artist art4 = new Artist("Haajde", "1976");


artists.add(art1);
artists.add(art2);
artists.add(art3);
artists.add(art4);

System.out.println("Give me the artist with the name and year, so we can see if it is in the collection");//true
System.out.println("Name: ");
String name = sc.next();//zema i string i integer kako string
System.out.println("Year of birth: ");
String yearOfB = sc.next();//zema i string i integer kako string

Artist artist = new Artist(name, yearOfB);//kreirame nov objekt so podatocite od userot.Artist nema equals() pa
if(artists.contains(artist)){//go povikuva equals() od parent class po difolt  - Object Class will be called
    System.out.println("We have a record of: " + name);
}else   //proveruva samo dali e ist objectot(referensite), a ne dali imat ista godina ili ime
    {//za da prebaruvame vnatre vo vrednostite, treba override equals() vo Artist Class 
  System.out.println("We have a record of: " + name);//se smeta ednakvo, iako e napishano so mala bukva
   }//go zema prepishaniot metod od Artist klasata equalsTo() za sporedba na value, sekogash odi zaedno so HashCode()
}

//so samoto to shto vnesuvame String("Haajde") kako argument, go povikuvame equalsTo()
    }

