/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edu04
 */
public class Container {



    

    
    
    /**
     * The id.
     */
    private int id;

    /**
     * The storage.
     */
    private long storage;
    
    private long velocity;
    
    

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
        return "Container{" + "id=" + id + '}';
    }
    
    
} 

