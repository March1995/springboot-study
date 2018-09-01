package com.example.chapter4.jpa;

import com.example.chapter4.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Kunzite
 */
public interface LoggerJPA extends JpaRepository<LoggerEntity, Long> {
}
