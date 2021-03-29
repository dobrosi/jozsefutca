package com.github.jozsefutca.kaputelefon.model;

import java.time.LocalDateTime;
import javax.persistence.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Settings {
  private @GeneratedValue @Id Long id;

  @JsonIgnore private @CreatedDate LocalDateTime createdDate;

  @Embedded private WifiSettings wifiSettings;

  @Embedded private Gate gate;

  @Lob
  private String contacts;

  @Lob
  private String accounts;

  @Lob
  private String config;

  @Lob
  private String indexPage;

  public Settings() {
    init();
  }

  private void init() {
    wifiSettings = new WifiSettings();
    gate = new Gate();
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

  public Gate getGate() {
    return gate;
  }

  public void setGate(Gate gate) {
    this.gate = gate;
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

  public String getIndexPage() {
    return indexPage;
  }

  public void setIndexPage(String indexPage) {
    this.indexPage = indexPage;
  }
}
