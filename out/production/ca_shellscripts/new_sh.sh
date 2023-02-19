
# creation du fichier avec saisie du nom
echo saisir le nom du fichier
#lecture du nom saisie
read nomFichier
echo nom de  fichier à créer $nomFichier.sh
# création du fichier
> $nomFichier.sh
# ajout des droits d'éxecution
chmod +x $nomFichier.sh
# ouvrir le fichier avec nano
nano $nomFichier.sh

