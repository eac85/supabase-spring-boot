// --- Reservation Repository ---
package com.pool.app.repository;

import com.pool.app.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {}
