echo ----- executer un fichie java
echo saisir le fichier 
read  filename
echo traitement du fichier : $filename.java
javac $filename.java
echo compliation ok 
java $filename
echo ---------
