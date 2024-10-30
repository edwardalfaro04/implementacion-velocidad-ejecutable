/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edu04
 */
import java.util.ArrayList;
import java.util.List;

public class ContainerHost {
    
   
    



    /**
     * The id.
     */
    private int id;

    /**
     * The storage.
     */
    private long storage;
    
    private long velocity;


    /**
     * The vm list.
     */
    private final List<? extends ContainerVm> vmList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStorage() {
        return storage;
    }
    
    public long getvelocity(){
        return velocity;
    }
    
     public void setStorage(long storage) {
        this.storage = storage;
    }
     
     public void setvelocity(long velocity){
         this.velocity = velocity;
     }
     

    @Override
    public String toString() {
        return "ContainerHost{" + "id=" + id + '}';
    }
    
    
}