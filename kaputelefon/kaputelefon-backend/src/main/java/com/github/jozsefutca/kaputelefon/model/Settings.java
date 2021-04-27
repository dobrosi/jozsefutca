package com.github.jozsefutca.kaputelefon.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Settings {
  private @GeneratedValue @Id Long id;

  @JsonIgnore private @CreatedDate LocalDateTime createdDate;

  @Embedded private WifiSettings wifiSettings;

  @Embedded private Intercom intercom;

  @Lob
  private String contacts;

  @Lob
  private String accounts;

  @Lob
  private String config;

  @Lob
  private byte[] indexPage;

  public Settings() {
    init();
  }

  private void init() {
    wifiSettings = new WifiSettings();
    intercom = new Intercom();
  }

  public Long getId() {
    return id;
  }

  public LocalDateTime getCreatedDate() {
    return createdDate;
  }

  public WifiSettings getWifiSettings() {
    return wifiSettings;
  }

  public void setWifiSettings(WifiSettings wifiSettings) {
    this.wifiSettings = wifiSettings;
  }

  public Intercom getIntercom() {
    return intercom;
  }

  public void setIntercom(Intercom intercom) {
    this.intercom = intercom;
  }

  public String getContacts() {
    return contacts;
  }

  public void setContacts(String contacts) {
    this.contacts = contacts;
  }

  public String getAccounts() {
    return accounts;
  }

  public void setAccounts(String accounts) {
    this.accounts = accounts;
  }

  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public byte[] getIndexPage() {
    return indexPage;
  }

  public void setIndexPage(byte[] indexPage) {
    this.indexPage = indexPage;
  }
}
