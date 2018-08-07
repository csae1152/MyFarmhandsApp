package com.enterprise.farmhands.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * <p>Stores information about the uploaded retina image.</p>
 */

@Entity
@Table(name = "RETINAMETAINFORMATION")
public class RetinaMetaInformation implements Serializable {
  @Id
  private long id;
  private String name;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
