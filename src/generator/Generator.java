package generator;

import java.util.Vector;

public class Generator {
    
    enum Muvelet
    {
       szorzas, kivonas, osszeadas
    }

    int vel(int a, int b) {return (int)(Math.random()*(b-a+1)+a);}
    int eredmeny=0;
    Vector<Integer> szamok = new Vector<Integer>(1,1);
    Vector<Muvelet> muveletek = new Vector<Muvelet>(1,1);
    
    
    void generalas(){
        int mdb=vel(1,3);
        szamok.add(0);
        for (int i = 0; i < mdb; i++) {
            /*int b=vel(1,3);
            if (muveletek.get(i) == Muvelet.kivonas){
                int a=szamok.get(i)-szamok.get(1);
                szamok.set(0, a);
            }*/
            szamok.add(vel(1,9));
            switch (vel(1,3))
            {
                case 1: muveletek.add(Muvelet.szorzas); break;
                case 2: muveletek.add(Muvelet.kivonas); break;
                case 3: muveletek.add(Muvelet.osszeadas); break;
            }
        }
        eredmeny=szamok.get(0);
        System.out.println(eredmeny);
    }
    
    
    int szamit(int kezdoertek)
    {
        Vector<Muvelet> ujmuvelet = (Vector<Muvelet>)muveletek.clone();
        Vector<Integer> ujszam = (Vector<Integer>)szamok.clone();
        ujszam.set(0,kezdoertek);
        teszt(ujmuvelet, ujszam);
        
        
        return 44;
    }
    
    void teszt(Vector<Muvelet> ujmuvelet, Vector<Integer> ujszam )
    {
        System.out.print(ujszam.get(0));
        for(int i=1; i<ujszam.size(); i++)
        {
            System.out.print(" " + ujmuvelet.get(i-1) + " " + ujszam.get(i));
        }
        System.out.println("");
    }
    
    Generator(){
       generalas(); 
        szamit(szamit(szamit(66)));
    }
    
    public int getSorozatElem(int elemszam)
    {
        return 0;
    }
    
    public static void main(String[] args) {
        new Generator();
    }
    
}
