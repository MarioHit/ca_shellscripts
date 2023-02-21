# Ca_shellscripts
to play with shell 

and to learn toOO

Test after using the repo 

## Terre10 : Nombre premier
        Pour afficher ce nombre il faut qu'il n y ai que son modulo 
        et le modulo 1 qui sont égales à 0

        en gros un boucle sur les modulos depuis 1, jusqu'au chiffre
        et vérifier qu'il n'y en a que 2 en tout.


## Terre 11 : 24 to 12 
    Creéer un programme qui prend en entrée une heure au format 24h
    et qui le met au format de 12h avec AM et PM
    ex : 
        21:40 => 09:40PM
        11:40 => 09:40AM
        12:40 => 12:40 PM
        00:40 => 12:40 AM

    On va donc tout simplement split vavec ":" 
    puis calculer si c'est supérieur à 12  ou pas 
        si sup : alors -12 et ajout PM 
        si inf : alors ne pas changer puis ajout AM
    pour le cas de minuit et 12:
        si l'heure finale est 00
            Alors on met 12
    