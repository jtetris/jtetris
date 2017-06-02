/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import jota.ClsXDerecha;
import jota.ClsXIzquierda;

/**
 *
 * @author componentej
 * @version 0.0.8
 */
@Path ("desplazar")
public class Desplazar {
    /**
     * Recibe un parámetro tipo entero que indica la dirección en que debe desplazarse el tetromino, el parámetro definirá dos posibles movimientos, a la izquierda, cuando el parámetro sea negativo, o a la derecha cuando sea positivo. El Web Service responderá con una matriz ordenada de manera que en las casillas del tetromino indique un movimiento usando números negativos y positivos.
     * @param direccion Direccion “derecha”, “izquierda” hacia donde se debe girar el tetromino
     * @return objeto JSON con la Matriz de 3 x 3 con el tetrominorepresentado en posiciones String
     */
      @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Response desplazar(@QueryParam("stl_direccion") String direccion) {        
        String pos1 = "20,5";
        String pos2 = "21,5";
        String pos3 = "22,5";
        String pos4 = "22,4";
        String[][] Jota = {
            {null, pos1, null},
            {null, pos2, null},
            {pos4, pos3, null}
        };    
        if(direccion.equals("derecha")){
            ClsXDerecha clderecha = new ClsXDerecha();
        Jota = clderecha.derecha(Jota);
        }else{
           ClsXIzquierda clizquierda= new ClsXIzquierda();
        Jota = clizquierda.izquierda(Jota);
        }
        
         Gson gson=new GsonBuilder().create();
         String jsonArray=gson.toJson(Jota);
        return Response.ok(jsonArray)
                .header("Access-Control-Allow-Origin", "*").build();
    }
}
