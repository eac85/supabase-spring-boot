// --- Reservation Repository ---
package com.pool.app.repository;

import com.pool.app.model.Pool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoolRepository extends JpaRepository<Pool, Long> {}
