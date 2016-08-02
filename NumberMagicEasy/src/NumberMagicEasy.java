import java.util.*;

public class NumberMagicEasy {

    public int theNumber(String answer){
        HashSet<Integer> card1 = new HashSet<Integer>();
        HashSet<Integer> card2 = new HashSet<Integer>();
        HashSet<Integer> card3 = new HashSet<Integer>();
        HashSet<Integer> card4 = new HashSet<Integer>();


        card1.add(1);
        card1.add(2);
        card1.add(3);
        card1.add(4);
        card1.add(5);
        card1.add(6);
        card1.add(7);
        card1.add(8);

        card2.add(1);
        card2.add(2);
        card2.add(3);
        card2.add(4);
        card2.add(9);
        card2.add(10);
        card2.add(11);
        card2.add(12);

        card3.add(1);
        card3.add(2);
        card3.add(5);
        card3.add(6);
        card3.add(9);
        card3.add(10);
        card3.add(13);
        card3.add(14);

        card4.add(1);
        card4.add(3);
        card4.add(5);
        card4.add(7);
        card4.add(9);
        card4.add(11);
        card4.add(13);
        card4.add(15);

        ArrayList< HashSet<Integer> > list = new ArrayList();
        list.add(card1);
        list.add(card2);
        list.add(card3);
        list.add(card4);

        HashSet<Integer> card = new HashSet<Integer>();
        for(int i=0; i < 4; i++){
            if(answer.charAt(i) == 'Y'){
                card = list.get(i);
                break;
            }
        }

        if( answer.charAt(0) == 'Y' ){
            card.retainAll( card1 );
        }else{
            card.removeAll( card1 );
        }
        if( answer.charAt(1) == 'Y' ){
            card.retainAll( card2 );
        }else{
            card.removeAll( card2 );
        }
        if( answer.charAt(2) == 'Y' ){
            card.retainAll( card3 );
        }else{
            card.removeAll( card3 );
        }
        if( answer.charAt(3) == 'Y' ){
            card.retainAll( card4 );
        }else{
            card.removeAll( card4 );
        }




        Iterator iterator = card.iterator();

        while(iterator.hasNext()){
            /*Map.Entry entry = (Map.Entry)*/
            return /*(int)entry.getValue();*/(int)iterator.next();
        }

        return 16;
    }

    public static void main(String[] args) {
//        String answer = "YNYY";
//        String answer = "NNNN";
//        String answer = "YNNN";
//        String answer = "YYYY";
        String answer = "NYNY";
        NumberMagicEasy magic = new NumberMagicEasy();
        System.out.println( magic.theNumber( answer ) );
//        magic.test();

    }

    public void test(){
        HashSet<Integer> card1 = new HashSet<Integer>();
        HashSet<Integer> card2 = new HashSet<Integer>();
        HashSet<Integer> card3 = new HashSet<Integer>();
        HashSet<Integer> card4 = new HashSet<Integer>();


        card1.add(1);
        card1.add(2);
        card1.add(3);
        card1.add(4);
        card1.add(5);
        card1.add(6);
        card1.add(7);
        card1.add(8);

        card2.add(1);
        card2.add(2);
        card2.add(3);
        card2.add(4);
        card2.add(9);
        card2.add(10);
        card2.add(11);
        card2.add(12);

        card3.add(1);
        card3.add(2);
        card3.add(5);
        card3.add(6);
        card3.add(9);
        card3.add(10);
        card3.add(13);
        card3.add(14);

        card4.add(1);
        card4.add(3);
        card4.add(5);
        card4.add(7);
        card4.add(9);
        card4.add(11);
        card4.add(13);
        card4.add(15);

        card1.removeAll(card2);

        System.out.println(card1.toString());


    }
}
