FROM ubuntu
WORKDIR /hafeez/
ADD newfile.txt newfile.txt
ENTRYPOINT  cat newfile.txt

