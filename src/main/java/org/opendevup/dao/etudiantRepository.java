package org.opendevup.dao;

import org.opendevup.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface etudiantRepository extends JpaRepository<Etudiant, Long> {

}
