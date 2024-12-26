package com.example.spring_boot_migration_with_flyway.models;
import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity
public class Post {

    @Id
    Long id;

    String title;

    @Column(columnDefinition = "TEXT")
    String body;



}