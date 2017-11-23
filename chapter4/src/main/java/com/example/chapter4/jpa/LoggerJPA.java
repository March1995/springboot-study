package com.example.chapter4.jpa;

import com.example.chapter4.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LoggerJPA
        extends JpaRepository<LoggerEntity,Long>
{

}
