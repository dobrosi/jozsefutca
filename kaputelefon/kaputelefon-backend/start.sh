java \
-Dspring.datasource.url=jdbc:h2:file://$HOME/.config/kaputelefon/kaputelefon:kaputelefondb \
-Dspring.jpa.hibernate.ddl-auto=update \
-jar target/kaputelefon-backend-0.0.1-SNAPSHOT.jar