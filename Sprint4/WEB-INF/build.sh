
#!/bin/bash.

# se mettre dans la repertoire des classes
cd /usr/share/apache-tomcat/webapps/Sprint4/WEB-INF/classes
# construire le fichier jar
jar -cvf ../etu1894.jar .
# copie du jar dans le projet de test
cd ../
cp etu1894.jar /usr/share/apache-tomcat/webapps/Sprint4a/WEB-INF/lib
