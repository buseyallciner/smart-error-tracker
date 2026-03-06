package com.buse.smarterrortracker.repository;
import com.buse.smarterrortracker.model.ErrorLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ErrorLogRepository extends JpaRepository<ErrorLog, Long>{
    List<ErrorLog>findBySeverity(String severity );

}
