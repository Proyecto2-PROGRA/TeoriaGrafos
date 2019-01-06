import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Principal {
    public static void main(String[] args) throws FileNotFoundException, IOException { 
        BufferedReader BR = new BufferedReader(new FileReader("Email-EuAll.txt"));
        int contador=0;
        int contadorDeNodosDos=0;
        int nodosParseados=-1;
        int aristas = 0;
        String cadena;
        BR.readLine();
        BR.readLine();
        BR.readLine();
        BR.readLine();
        while((cadena= BR.readLine())!=null){        
            String[] campos=cadena.split("	");     
            aristas++;
            if((Integer.parseInt(campos[0]))!=nodosParseados){
                nodosParseados=Integer.parseInt(campos[0]);
                contador=contador+1;
            }  
    }
        System.out.println(contador);
        System.out.println(aristas);
    }
}
