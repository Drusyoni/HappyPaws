package upc.edu.pe.happypaws.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import upc.edu.pe.happypaws.entities.Notificacion;

import java.time.LocalDate;
import java.util.List;

public interface INotificacionService {
    public List<Notificacion> list();
    public void insert(Notificacion notificacion);
    public void update(Notificacion notificacion);
    public void delete(int notificacionId);
    public List<Notificacion> findemisor(int id);
    public List<Notificacion> findreceptor(int id);
    public List<String[]> notifiacionxfecha(LocalDate fecha);
}
