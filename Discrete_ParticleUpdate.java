/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edu04
 */

import java.util.*;
import java.util.Random;

public class Discrete_ParticleUpdate {

    private Discrete_PSO_Swarm swarm;
    private Object getBestPosition;
    
    
    
    
/**
 * Particle update strategy
 * 
 * Every Swarm.evolve() itereation the following methods are called
 * 		- begin(Swarm) : Once at the begining of each iteration
 * 		- update(Swarm,Particle) : Once for each particle
 * 		- end(Swarm) : Once at the end of each iteration
 * 
 

    Discrete_PSO_Swarm swarm;

    //A random weight r1.
    private final double WEIGHT_R1 = 0.2d;
    //The cognitive acceleration coefficient c1.
    private final double COGNIT_COEFFICIENT = 0.5d;

    //A random weight r2.
    private final double WEIGHT_R2 = 0.2d;
    //The social coefficient
    private final double SOCIAL_COEFFICIENT = 0.5d;

    
    /**
    public Discrete_ParticleUpdate() {
    }
    Update particle's velocity and position */
    
    
    
 public Discrete_ParticleUpdate() {
 }   
    
    //Update particle's velocity and position */
    public void update(Discrete_PSO_Swarm swarm, Discrete_Particle particle) {
    this.swarm = swarm;

    // Mensaje de depuración al inicio del método
    System.out.println("Iniciando la actualización de la partícula...");

    

//realizar una modificacion aleatoria 
List<Allocation> position = particle.getBestPosition();
ContainerVm vm = null;
int cont = 0;
for(Allocation asignacion : position){
    Random random = new Random();
    int randomNumber =random.nextInt(swarm.getVms().size());
    vm = swarm.getVms().get(randomNumber);
    asignacion.setVm(vm);
}

boolean vmExiste = false;
for(Allocation asignacion : position){
    if( vm.getId()== asignacion.getVm().getId()) {
        vmExiste = true;
        break;
    }
}
    if(!vmExiste){
    Random random = new Random();
     int randomNumber =random.nextInt(swarm.getVms().size());
     ContainerHost host = swarm.getHosts().get(randomNumber);
     
     boolean hostExiste = false;
for(Allocation asignacion : position){
    if( host.getId()== asignacion.getHost().getId()){
        vmExiste = true;
        break;
    }
    
    cont++;
    if(cont>1)
        break;
}
}
    
    
    
    
    
    
 
        // Obtener la lista de velocidades de la partícula
        List<Allocation> velocity = particle.getVelocity();
        
    
   

    // Inicializar las velocidades
    velocity.add(new Allocation(new Container(), new ContainerVm(), new ContainerHost()));
    
   
    
     // Asignar estas velocidades a la partícula
    particle.setVelocity(velocity);
    
    


        if (velocity.isEmpty()) {
    System.out.println("La lista de velocidades está vacía.");
    return;  // Salir del método si la lista está vacía
        }

        

        // Recorrer la lista de velocidades y modificar cada una aleatoriamente
        Allocation nuevaVelocidad= null;
        for (int i = 0 ; i < velocity.size(); i++) {
            Allocation velocidad = velocity.get(i);
            
            
            
             // Modificar los valores de la velocidad de manera aleatoria
    // generar un número aleatorio entre -10 y 10
    int containerModification = (int) (Math.random() * 20) - 10;
    int vmModification = (int) (Math.random() * 20) - 10;
    int hostModification = (int) (Math.random() * 20) - 10;
    
    
          // Crear el objeto Container
Container container = new Container();
container.setId(velocidad.getContainer().getId() + containerModification);

// Crear el objeto ContainerVm
ContainerVm containerVm = new ContainerVm();
containerVm.setId(velocidad.getVm().getId() + vmModification);

// Crear el objeto ContainerHost
ContainerHost containerHost = new ContainerHost();
containerHost.setId(velocidad.getHost().getId() + hostModification);

// Crear la nueva asignación con los objetos ya inicializados
 nuevaVelocidad = new Allocation(container, containerVm, containerHost);
 
            
            
             // Reemplazar la antigua velocidad con la nueva en la lista
            velocity.set(i, nuevaVelocidad);
            
}
            // Mostrar la nueva velocidad de cada elemento en la lista
        System.out.println("Nuevas velocidades de la partícula:");   
        System.out.println(nuevaVelocidad);
        // Esto llama al método toString() de cada Allocation
        
         // Mensaje de depuración al final del método
    System.out.println("Finalizando la actualización de la partícula...");
    
    
   
        }
    

    
     
    
   
}



    
    
    
    


        
  
        
        

        
    


   

   
            
            
        
       
    
 





    
   












    
    


        
        

    



