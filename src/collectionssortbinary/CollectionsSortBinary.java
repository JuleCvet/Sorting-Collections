package collectionssortbinary;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortBinary implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        List<String> str1 = Arrays.asList(o1.split(""));//samo go razdeluvame Stringot vo objekti(si igrame so nea)
        List<String> novaStr1 = Arrays.asList(o1.split(""));//ja zacuvuvame vo nova niza 
//vraka kako odgovor brojka (-1, 0, 1)
        int qvantity1 = Collections.frequency(str1, "1");//ja bara frekventnosta vo prvata niza
        int qvantityNova = Collections.frequency(novaStr1, "1");//ja zacuvuva frekventnosta vo novava
//za da mu kazeme po koj redosled sakame da ni gi pecati:
        if (qvantity1 == qvantityNova) {//ako imaat isti do;zini a razlicni brojki
            return -1;//od object so pomala vrednost kon object so pogolema
            //ili moze i : Integer.parseOnt(o1) - Integer.parseOnt(o2);
        } else if (qvantity1 != qvantityNova) {
            return 1;
        }
        return 0;
    }   
}
