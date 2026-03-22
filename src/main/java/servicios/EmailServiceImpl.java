package servicios;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import interfaces.InterfazEmail; 

@Service
public class EmailServiceImpl implements InterfazEmail {
    private final Logger logger;

    public EmailServiceImpl(Logger logger) { 
        this.logger = logger;
    }

    @Override
    public void enviarEmail(String direccion, String mensaje) {
        logger.info("Enviando email a {}: {}", direccion, mensaje); 
    }
}
