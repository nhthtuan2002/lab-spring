package com.example.springproduct.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String gender;
    private String color;
    private String size;
    private double price;
    @CreationTimestamp
    protected LocalDateTime createAt;
    @UpdateTimestamp
    protected LocalDateTime updateAt;
    private int status;
}
