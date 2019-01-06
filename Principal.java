import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) throws FileNotFoundException, IOException { 
        BufferedReader BR = new BufferedReader(new FileReader("Email-EuAll.txt"));
        
        ArrayList<Integer> nodosArrayListUno = new ArrayList<Integer>();
        ArrayList<Integer> nodosArrayListDos = new ArrayList<Integer>();
        ArrayList<Integer> nodosArrayListUnoComprimido = new ArrayList<Integer>();
        ArrayList<Integer> nodosArrayListDosComprimido = new ArrayList<Integer>();
        
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
            
            nodosArrayListUno.add(numeroNodoParseado);
            nodosArrayListDos.add(numeroNodoParseadoDos);
            nodosArrayListDosComprimido.add(numeroNodoParseadoDos);
            
            
            if((Integer.parseInt(campos[0]))!=nodosParseados){
                nodosParseados=Integer.parseInt(campos[0]);
                nodosArrayListUnoComprimido.add(nodosParseados);
                contador=contador+1;
            }  
            
                
            }
        System.out.println("Termine 1");
            for(int i =0; i < nodosArrayListUnoComprimido.size();i++){
                    for(int x=0;x<nodosArrayListDosComprimido.size();x++){
                        if(nodosArrayListUnoComprimido.get(i)==nodosArrayListDosComprimido.get(x)){
                            
                            nodosArrayListDosComprimido.remove(x);
                            
                        }
                                
                    }
            }
            System.out.println("Termine 2");
            System.out.println(nodosArrayListDosComprimido.size());
            
            for(int i=0;i<nodosArrayListDosComprimido.size();i++){
                for(int x=1;x<nodosArrayListDosComprimido.size();x++){
                    if(nodosArrayListDosComprimido.get(i)==nodosArrayListDosComprimido.get(x)&&i!=x){
                        nodosArrayListDosComprimido.remove(x);
                    }
                }
            }
            
        
        
        
        
        
        System.out.println(contador);
        System.out.println(aristas);
        System.out.println(nodosArrayListUno.size());
        System.out.println(nodosArrayListDos.size());
        System.out.println(nodosArrayListUnoComprimido.size());
        System.out.println(nodosArrayListDosComprimido.size());

        /*
        for (int i = 0; i < nodosArrayList.size(); i++) {
			
		}
        for (int i = 0; i < nodosArrayListDos.size(); i++) {
			
		}
        System.out.println("Termine");*/
    }
}
