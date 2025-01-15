import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        //es 1

        Scanner scanner=new Scanner(System.in);
        Set<String> parole = new HashSet<>();
        System.out.println("N elementi:");
        int n= Integer.parseInt(scanner.nextLine());
        int DupeCounter =0;
        for (int i=0;i<n;i++){
            System.out.println("Cosa vuoi inserire in lista?");
            String element = scanner.nextLine();
            if(parole.add(element))
                parole.add(element);
            else DupeCounter++;
        }
        System.out.println("Parole duplicate:" +DupeCounter);
        for (String parola : parole) System.out.println(parola);
        System.out.println("N parole diverse:" +parole.size());

        //es 2

        ArrayList<Integer> numeri = new ArrayList<Integer>();
        for (int i = 0; i < 99; i++) {
            int r = (int) (Math.random()*100);
            numeri.add(r);
        }
        Main.bool(numeri,true);

        //es 3

        Map<String,Integer> rubrica = new HashMap<>();

        rubrica.put("Giuliano",111);
        rubrica.put("Alessio",222);
        rubrica.put("Alesia",333);

    }

    private static ArrayList<Integer> ordina(ArrayList<Integer> list){
        Collections.sort(list);
        return list;
    }

    private static ArrayList<Integer> reverse(ArrayList<Integer> list){
        Collections.reverse(list);
        return list;
    }

    private static void bool(ArrayList<Integer> list, boolean pari){
        if(pari){
            for(Integer numero : list){
                if (numero%2==0) System.out.println(numero);
            }
        } else {
            for(Integer numero : list){
                if (numero%2!=0) System.out.println(numero);
            }
        }
    }
}