package com.github.jozsefutca.kaputelefon.model;

import javax.persistence.Embeddable;

@Embeddable
public class WifiSettings {
  private String ssid;

  private String password;

  public WifiSettings() {}

  public String getSsid() {
    return ssid;
  }

  public void setSsid(String ssid) {
    this.ssid = ssid;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
