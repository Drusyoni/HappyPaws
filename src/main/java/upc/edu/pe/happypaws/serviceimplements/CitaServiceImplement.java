package upc.edu.pe.happypaws.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.happypaws.entities.Cita;
import upc.edu.pe.happypaws.repositories.ICitaRepository;
import upc.edu.pe.happypaws.serviceinterfaces.ICitaService;

import java.util.List;

@Service
public class CitaServiceImplement implements ICitaService {
    @Autowired
    private ICitaRepository citaRepository;


    @Override
    public List<Cita> list() {
        return citaRepository.findAll();
    }

    @Override
    public void insert(Cita cita) {
        citaRepository.save(cita);
    }

    @Override
    public void update(Cita cita) {
        citaRepository.save(cita);
    }

    @Override
    public void delete(int citaId) {
        citaRepository.deleteById(citaId);
    }

    @Override
    public List<Cita> findid(int id) {
        return citaRepository.findid(id);
    }

    @Override
    public List<Cita> findusuario(int id) {
        return citaRepository.findusuario(id);
    }

    @Override
    public List<Cita> findalbergue(int id) {
        return citaRepository.findalbergue(id);
    }

    @Override
    public List<Cita> findpendiente() {
        return citaRepository.findpendiente();
    }
}
