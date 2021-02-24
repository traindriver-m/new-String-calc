package operation;


import main.Massive;

public class Minus  {

    public void operation(String a) {
       // System.out.println("сработал класс -");
        Massive l=new Massive();
        String[] minusMassive=l.getMassive(a);
       // System.out.println(minusMassive[0]+minusMassive[1]);
        String result = new String("");
        String[] m1 = minusMassive[0].split(" ");
        String[] m2 = minusMassive[1].split(" ");
        boolean b = true;
        for(String s: m1){
            for (String s2:m2) if(s.equals(s2)) b = false;
            if(b){
                result +=s;
            }else b = true;
        }
        System.out.println("\"" + result + "\"");
    }
}
