package com.api.parkingcontroll.repositories;

import com.api.parkingcontroll.models.ParkingSpotModel;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dayon
 */

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{//Acesso ao banco de dados, JpaRepository já tem metodos CRUD
//Regras de negocio
    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);   
}
