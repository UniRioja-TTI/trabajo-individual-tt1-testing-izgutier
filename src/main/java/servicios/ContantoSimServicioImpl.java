package servicios;

import org.springframework.stereotype.Service;
import interfaces.InterfazContactoSim;
import modelo.DatosSolicitud;
import java.util.Arrays;
import java.util.List;

@Service
public class ContactoSimServiceImpl implements InterfazContactoSim {

    @Override
    public List<String> getEntities() {
        return Arrays.asList("Sensor_Norte", "Sensor_Sur", "Reactor_Principal"); [cite: 270]
    }

    @Override
    public int solicitarSimulation(DatosSolicitud ds) {
        return (int) (Math.random() * 1000); [cite: 269]
    }

    @Override
    public boolean isValidEntityId(int id) {
        return id >= 0; 
    }
}
