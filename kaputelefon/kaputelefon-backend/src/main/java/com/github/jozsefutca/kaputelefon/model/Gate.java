package com.github.jozsefutca.kaputelefon.model;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Gate {

  private int gvol;

  private int rvol;

  private int cvol;

  @Enumerated(EnumType.STRING)
  private GateType type;

  private int code;

  public Gate() {}

  public int getGvol() {
    return gvol;
  }

  public int getRvol() {
    return rvol;
  }

  public int getCvol() {
    return cvol;
  }

  public GateType getType() {
    return type;
  }

  public int getCode() {
    return code;
  }
}
