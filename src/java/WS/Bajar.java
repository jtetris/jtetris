/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Arrays;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import jdk.nashorn.internal.parser.JSONParser;
import jota.ClsXBajar;

/**
 *
 * @author componentej
 *  @version 0.0.8
 * 
 */

@Path ("bajar")
public class Bajar {
    /**
     * El Web Service responderá con una matriz ordenada donde el tetromino indique un movimiento descendente de una posición.
     * @return objeto JSON con la Matriz de 3 x 3 con el tetromino representado en posiciones String
     */
    @GET       
    @Produces ("application/json")
    public String bajar() {        
        String pos1 = "20,5";
        String pos2 = "21,5";
        String pos3 = "22,5";
        String pos4 = "22,4";
        String[][] Jota = {
            {null, pos1, null},
            {null, pos2, null},
            {pos4, pos3, null}
        };        
        int bajar =1;        
        ClsXBajar clbajar = new ClsXBajar();
        Jota = clbajar.bajar(Jota, bajar);
         Gson gson=new GsonBuilder().create();
         String jsonArray=gson.toJson(Jota);
        return jsonArray;
    }

}
