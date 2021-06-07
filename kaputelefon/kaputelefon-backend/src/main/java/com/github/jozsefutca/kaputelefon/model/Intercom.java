package com.github.jozsefutca.kaputelefon.model;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Intercom {
  private int ivol;

  private int rvol;

  private int cvol;

  private int mvol;

  private int hvol;

  @Enumerated(EnumType.STRING)
  private IntercomType type;

  private int code;

  public Intercom() {}

  public int getIvol() {
    return ivol;
  }

  public void setIvol(int ivol) {
    this.ivol = ivol;
  }

  public int getRvol() {
    return rvol;
  }

  public void setRvol(int rvol) {
    this.rvol = rvol;
  }

  public int getCvol() {
    return cvol;
  }

  public void setCvol(int cvol) {
    this.cvol = cvol;
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

  public void setType(IntercomType type) {
    this.type = type;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }
}