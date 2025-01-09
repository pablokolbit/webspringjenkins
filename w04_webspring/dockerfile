# imagen base para crea la nuestra
from openjdk:17-jdk-alpine

# copia el war en la imagen
copy target/w04_webspring-1.war w04_webspring-1.war

# lo que se ejecutará al ejecutar el contenedor
entrypoint ["java", "-jar", "/w04_webspring-1.war"]

# expone el puerto 7070 del contenedor
expose 7070