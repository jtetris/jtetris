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
import jota.ClsXGirar;

/**
 *@author componentej
* @version 0.0.8
 */
@Path ("girar")
public class Girar {
    /**
     * Recibe un parámetro tipo string que indica la dirección en que debe girar el tetromino, el parámetro definirá dos posibles movimientos, girar a la izquierda (contrario a las manecillas del reloj), o girar a la derecha (en el sentido de las manecillas del reloj). El Web Service responderá con una matriz ordenada de manera que el tetromino se encuentre girado en la dirección indicada.
     * @param direccion Direccion “derecha”, “izquierda” hacia donde se debe girar el tetromino
     * @return objeto JSON con la Matriz de 3 x 3 con el tetrominorepresentado en posiciones String
     */
    @GET
    @Produces ("application/json")

    public String girar(@QueryParam("stl_direccion") String direccion) {        
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
           ClsXGirar clgirar = new ClsXGirar();
        Jota = clgirar.girar(Jota);
        }else{
           ClsXGirar clgirar = new ClsXGirar();
        Jota = clgirar.girar(Jota);
        }       
        
         Gson gson=new GsonBuilder().create();
         String jsonArray=gson.toJson(Jota);
        return jsonArray;
    }
}
