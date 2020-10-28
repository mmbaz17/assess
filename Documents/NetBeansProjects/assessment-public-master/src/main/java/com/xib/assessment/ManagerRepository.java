package com.xib.assessment;

import com.xib.assessment.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
