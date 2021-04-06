package com.github.jozsefutca.kaputelefon.model;

import io.swagger.models.auth.In;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Intercom {

  private int gvol;

  private int rvol;

  private int cvol;

  private int mvol;

  private int hvol;

  @Enumerated(EnumType.STRING)
  private IntercomType type;

  private int code;

  public Intercom() {}

  public int getGvol() {
    return gvol;
  }

  public int getRvol() {
    return rvol;
  }

  public int getCvol() {
    return cvol;
  }

  public int getMvol() {
    return mvol;
  }

  public void setMvol(int mvol) {
    this.mvol = mvol;
  }

  public int getHvol() {
    return hvol;
  }

  public void setHvol(int hvol) {
    this.hvol = hvol;
  }

  public IntercomType getType() {
    return type;
  }

  public int getCode() {
    return code;
  }
}
