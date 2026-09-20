package Game;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Room {
    private List<Card> card=new ArrayList<>();
    private static final List<String> SIZE_ORDER = Arrays.asList(
            "3", "4", "5", "6", "7", "8", "9", "10", "j", "Q", "K", "A", "2"
    );
    {
        String size[]={"3","4","5","6","7","8","9","10","j","Q","K","A","2"};
        String color[]={"梅花","fangk","xin","taohua"};
        int num=0;
        for (String sizes : size) {
            num++;
            for (String colors : color) {
                Card card1=new Card(colors,sizes,num);
                card.add(card1);
            }
        }
        card.add(new Card("xiaowang","",++num));

        card.add(new Card("dawang","",++num));

        System.out.println("牌堆"+card);
    }

    private int getCardWeight(Card c) {
        if ("dawang".equals(c.getColor())) return 100;  // 大王最大
        if ("xiaowang".equals(c.getColor())) return 99; // 小王次之
        int index = SIZE_ORDER.indexOf(c.getSize());
        return index >= 0 ? index : -1;
    }

    public void start(){
        Collections.shuffle(card);
        System.out.println("洗牌后"+card);
        Map<String,List<Card>> player=new HashMap<>();
        List<Card> wh=new ArrayList<>();
        player.put("wh",wh);
        List<Card> ss=new ArrayList<>();
        player.put("ss",ss);
        List<Card> cc=new ArrayList<>();
        player.put("cc",cc);


        for (int i = 0; i < card.size()-3; i++) {
           Card card2=card.get(i);
            if(i%3==0){
                wh.add(card2);
            }if(i%3==1){
                ss.add(card2);
            }if(i%3==2){
                cc.add(card2);
            }
        }
        List<Card> lastcard=card.subList(card.size()-3,card.size());
        wh.addAll(lastcard);
//       for( Map.Entry<String ,List<Card>> entry: player.entrySet()){
//           List<Card> cards=entry.getValue();
//           cards.sort((a,b)->getCardWeight(a)-getCardWeight(b));
//
//           System.out.println(entry.getKey()+"牌是"+cards);
//       }
        for( Map.Entry<String ,List<Card>> entry: player.entrySet()){
            List<Card> cards=entry.getValue();
            Collections.sort(cards, new Comparator<Card>() {
                @Override
                public int compare(Card o1, Card o2) {
                    return o1.getNums()-o2.getNums();
                }
            });
            System.out.println(entry.getKey()+"牌是"+cards);
        }
    }


}
