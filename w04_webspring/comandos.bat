docker build -t webspring:1.0 .
docker run -p 7070:7070 webspring:1.0
docker ps -a