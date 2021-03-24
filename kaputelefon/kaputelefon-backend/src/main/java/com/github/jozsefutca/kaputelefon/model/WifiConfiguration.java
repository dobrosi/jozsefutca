package com.github.jozsefutca.kaputelefon.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class WifiConfiguration {
  private @GeneratedValue @Id Long id;

  @JsonIgnore private @CreatedDate LocalDateTime createdDate;

  public WifiConfiguration() {}
}
