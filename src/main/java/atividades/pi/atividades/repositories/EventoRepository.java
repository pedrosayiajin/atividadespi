package atividades.pi.atividades.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import atividades.pi.atividades.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{
	
	

}
