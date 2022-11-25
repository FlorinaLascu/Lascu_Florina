import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------a----------------");
        List<Sectiune>sectiuneList = new ArrayList<>();
        sectiuneList.add(new Sectiune("Sectiune 1",40));
        sectiuneList.add(new Sectiune("Sectiune 2",30));
        sectiuneList.add(new Sectiune("Sectiune 3",50));

        for (Sectiune s: sectiuneList)
             System.out.println(s);

        List<Sectiune>sectiuneList2 = new ArrayList<>();
        sectiuneList2.add(new Sectiune("Sectiune 1.2",23));
        sectiuneList2.add(new Sectiune("Sectiune 2.2",55));
        sectiuneList2.add(new Sectiune("Sectiune 3.2",19));

        List<Capitol>capitolList = new ArrayList<>();
        capitolList.add(new Capitol("Capitol 1",sectiuneList));
        capitolList.add(new Capitol("Capitol 1",sectiuneList2));

        for(Capitol c: capitolList)
            System.out.println(c);

        List<Capitol>capitolList2 = new ArrayList<>();
        capitolList2.add(new Capitol("Capitol 1.1",sectiuneList2));
        capitolList2.add(new Capitol("Capitol 1.2",sectiuneList));
        System.out.println("-------------b-------------");
       List<Carte>carteList = new ArrayList<>();
       carteList.add((new Carte("Viata ca o prada", "Marin Preda",capitolList,sectiuneList)));
        carteList.add((new Carte("Poezii", "Mihai Eminescu",capitolList2,sectiuneList2)));
        carteList.add((new Carte("Fat-Frumos din Lacrima", "Mihai Eminescu",capitolList,sectiuneList2)));

        for(Carte c:carteList)
            System.out.println(c);

        System.out.println("--------------c--------------");


        carteList.sort(Comparator.comparing(Carte::getNrCap).thenComparing(Carte::getTitlu));

        for (Carte c:carteList)
            System.out.println(c);


        System.out.println("--------------d--------------");
       // Set<String>autori;
        HashMap<String, ArrayList<String>>map=new HashMap<String, ArrayList<String>>();

        for(Carte c :carteList)
        {
            if (map.containsKey(c.getNumele_autorului()))
                map.get(c.getNumele_autorului()).add(c.titlu);
            else
            { ArrayList<String> l = new ArrayList<>();
             l.add(c.titlu);
             map.put(c.numele_autorului,l);
            }
        }
        for(Map.Entry<String, ArrayList<String>> e : map.entrySet())
          System.out.println(e.getKey() + "->" +e.getValue());




    }
}