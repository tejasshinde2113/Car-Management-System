package com.packt.cardatabase.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Car {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long id;
  private String brand, model, color, registrationNumber;
  private int modelYear, price;

  @Column(name="explanation", nullable=true, length=512)
  private String description;

  @ManyToOne(fetch= FetchType.LAZY)
  @JoinColumn(name="owner")
  private Owner owner;

  public Car() {
  }
  public Car(String brand, String model, String color,
             String registrationNumber, int modelYear, int price, Owner owner) {
    super();
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.registrationNumber = registrationNumber;
    this.modelYear = modelYear;
    this.price = price;
    this.description = description;
    this.owner = owner;
  }

  public long getId() {
    return id;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public int getModelYear() {
    return modelYear;
  }

  public int getPrice() {
    return price;
  }

  public String getDescription() {
    return description;
  }


  public void setId(long id) {
    this.id = id;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public void setModelYear(int modelYear) {
    this.modelYear = modelYear;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Owner getOwner() {
    return owner;
  }
  public void setOwner(Owner owner) {
    this.owner = owner;
  }

}
