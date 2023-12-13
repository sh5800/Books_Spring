package com.shreyash.books.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.id.factory.spi.GenerationTypeStrategy;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title;
}
