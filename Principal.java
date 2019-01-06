import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) throws FileNotFoundException, IOException { 
        BufferedReader BR = new BufferedReader(new FileReader("Email-EuAll.txt"));
        
        ArrayList<Integer> nodosArrayList = new ArrayList<Integer>();
        ArrayList<Integer> nodosArrayListDos = new ArrayList<Integer>();
        
        int contador=0;
        int contadorDeNodosDos=0;
        int nodosParseados=-1;
        int aristas = 0;
        int numeroNodoParseado;
        int numeroNodoParseadoDos;
        String cadena;
        BR.readLine();
        BR.readLine();
        BR.readLine();
        BR.readLine();
        while((cadena= BR.readLine())!=null){  
            
                    
            String[] campos=cadena.split("	"); 
            numeroNodoParseado=Integer.parseInt(campos[0]);
            numeroNodoParseadoDos=Integer.parseInt(campos[1]);
            
            nodosArrayList.add(numeroNodoParseado);
            nodosArrayListDos.add(numeroNodoParseadoDos);
            
            aristas++;
            if((Integer.parseInt(campos[0]))!=nodosParseados){
                nodosParseados=Integer.parseInt(campos[0]);
                contador=contador+1;
            }  
    }
        System.out.println(contador);
        System.out.println(aristas);
        System.out.println(nodosArrayList.size());
        System.out.println(nodosArrayListDos.size());
        
        for (int i = 0; i < nodosArrayList.size(); i++) {
			
		}
        for (int i = 0; i < nodosArrayListDos.size(); i++) {
			
		}
        System.out.println("Termine");
    }
}
