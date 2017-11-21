
package collectionssortbinary;

import java.util.Objects;

class Artist implements Comparable<Artist> {
    String name;
    String yearOfBirth;
    
    public Artist(String name, String yearOfBirth){
    this.name = name;
    this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Artist){//ako objectot e Artist
        Artist artist = (Artist) o;//novokreiraniot objekt od userot, neka ja zeme 
        //vrednosta na "o" za da gi sporedime value na name i yearOfBirth
        return (artist.name.equals(this.name))&&(artist.yearOfBirth.equals(this.yearOfBirth));
        }else//ako 2-ta uslovi se ispolneti = true t.s ispecati go
            return false; 
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.yearOfBirth);
        return hash;
    }

    @Override
    public int compareTo(Artist t) {//zema ime kako parametar
         return(this.name.compareTo(t.name));//ja sporeduva vrednosta na dadenoto ime so iminjata na objektite
    }
    
    
}
