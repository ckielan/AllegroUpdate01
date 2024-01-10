package pl.allegroupdate.domain;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 9000)
    private String client_token;
    @Column(length = 90000)
    private String client_refresh_token;

    @DateTimeFormat
    private LocalDateTime datecreated;

    @PrePersist
    public void prePersists(){
        datecreated = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient_token() {
        return client_token;
    }

    public void setClient_token(String client_token) {
        this.client_token = client_token;
    }

    public String getClient_refresh_token() {
        return client_refresh_token;
    }

    public void setClient_refresh_token(String client_refresh_token) {
        this.client_refresh_token = client_refresh_token;
    }

    public LocalDateTime getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(LocalDateTime date_created) {
        this.datecreated = date_created;
    }
}
