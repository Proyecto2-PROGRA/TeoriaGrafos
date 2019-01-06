import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
public class Principal {
    public static void main(String[] args) throws FileNotFoundException, IOException { 
        BufferedReader BR = new BufferedReader(new FileReader("Email-EuAll.txt"));
        
        ArrayList<Integer> nodosArrayListUno = new ArrayList<Integer>();
        ArrayList<Integer> nodosArrayListDos = new ArrayList<Integer>();
        ArrayList<Integer> nodosArrayListUnoComprimido = new ArrayList<Integer>();
        ArrayList<Integer> nodosArrayListDosCopia = new ArrayList<Integer>();
        ArrayList<Integer> nodosArrayListDosComprimido = new ArrayList<Integer>();
        ArrayList<Integer> nodosArrayListTodoComprimido = new ArrayList<Integer>();
        ArrayList<Integer> nodosArrayListTodoComprimidoFinal = new ArrayList<Integer>();
        
        ArrayList<Integer> nodosArrayListPosicion = new ArrayList<Integer>();
        ArrayList<Integer> nodosArrayListContadorRepeticiones = new ArrayList<Integer>();
        
        int[] nodosMasMensajesEnviados = new int[100];
        int[] nodosMasMensajesRecibidos = new int[100];
        
        int contador=0;
        int contadorDeNodosDos=0;
        int nodosParseados=-1;
        int nodosParseadosDos=-1;
        int nodosParseadosTres=-1;
        int nodosParseadosCuatro=-1;
        
        int aristas = 0;
        int numeroNodoParseado;
        int numeroNodoParseadoDos;
        int contadorLlenadoArray=100;
        int numeroMayor=-1;
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
            nodosArrayListDosCopia.add(numeroNodoParseadoDos);

            if((Integer.parseInt(campos[0]))!=nodosParseados){
                nodosParseados=Integer.parseInt(campos[0]);
                nodosArrayListUnoComprimido.add(nodosParseados);
                nodosArrayListTodoComprimido.add(nodosParseados);
                contador=contador+1;
            }  
   
        }
        BR.close();
        
        Collections.sort(nodosArrayListDosCopia);
        Collections.sort(nodosArrayListUnoComprimido);

        for(int recorridoVar : nodosArrayListDosCopia){
            if(recorridoVar!=nodosParseadosDos){
                nodosParseadosDos=recorridoVar;
                nodosArrayListDosComprimido.add(nodosParseadosDos);
                nodosArrayListTodoComprimido.add(nodosParseadosDos);
            }  
        }
        
        Collections.sort(nodosArrayListTodoComprimido);
        
        for(int recorridoVar : nodosArrayListTodoComprimido){
            if(recorridoVar!=nodosParseadosTres){
                nodosParseadosTres=recorridoVar;
                nodosArrayListTodoComprimidoFinal.add(nodosParseadosTres);
            }  
        }
        int x=0;
       
        for(int i=0;i<nodosArrayListUno.size();i++){
            
            if(nodosArrayListUno.get(i)!=nodosParseadosCuatro){
                nodosParseadosCuatro=nodosArrayListUno.get(i);
                
                nodosArrayListPosicion.add(i);
                 if(i>0){
                     
                    nodosArrayListContadorRepeticiones.add(x);
                 }
                x=1;
               
            }  else{
                x++;
            }
            
        }nodosArrayListContadorRepeticiones.add(x);
        /*
        for(int i =0;i<100;i++){
            int y=0;
            for(int recorridoVarDos:nodosArrayListContadorRepeticiones){
                for(int h=0;h<nodosArrayListContadorRepeticiones.size();h++){
                    recorridoVarDos=nodosArrayListContadorRepeticiones.get(h);
                    if(recorridoVarDos>numeroMayor){
                    numeroMayor =recorridoVarDos;
                    nodosMasMensajesEnviados[i]=nodosArrayListUno.get(nodosArrayListPosicion.get(y));
                    nodosArrayListContadorRepeticiones.remove(y);
                    nodosArrayListPosicion.remove(y);
                }
                y++;
                }
                
        
            }
        }*/
        int y=0;
        int h=0;
        int l=0;
        int var=-1;
        for(int i=0;i<100;i++){
            y=0;
            for(int recorridoVar : nodosArrayListContadorRepeticiones){
                if(numeroMayor<=recorridoVar){
                    numeroMayor=recorridoVar;
                    var = nodosArrayListPosicion.get(930);
                    System.out.println(numeroMayor);
                }
                y++;
                
            }

            nodosMasMensajesEnviados[i]=nodosArrayListUno.get(3);

        }
      
        
        System.out.println(contador);
        System.out.println(aristas);
        System.out.println("Aristas Total: "+nodosArrayListUno.size());
        System.out.println(nodosArrayListDos.size());
        System.out.println(nodosArrayListUnoComprimido.size());
        System.out.println(nodosArrayListDosComprimido.size());

        System.out.println("Nodos Total: "+nodosArrayListTodoComprimidoFinal.size());
        
        System.out.println(nodosArrayListPosicion.size()+"<== es igual a ==>"+ nodosArrayListContadorRepeticiones.size());
        System.out.println(nodosMasMensajesEnviados[1]);
    }
}
