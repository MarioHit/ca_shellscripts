# Ca_shellscripts
to play with shell 

and to learn toOO

Test after using the repo 
### Terre1 : L’alphabet
        il faut écrire programme qui affiche tout l'alphabet en miniscule 
        suivi d'un retour à la ligne.

        Attention le programe doit comporter une boucle

        Solution : 
        - créer un string contenant l'alpabet
        - faire un split et mettre l'alpabet dans un tableau
        - boucler sur le tableau créé et afficher chaque lettre
        - mettre un retour à la ligne  après la boucle 

les notions vu c'est le fait travailler avec un tableua et boucler dessus 

### Terre2 : Nom du programme
        il faut écrire programme qui affiche son nom de fichier.

        Exemples d’utilisation :
        $> node exo.js
        exo.js
        
        $> node crevette.js
        crevette.js

        Solution : 
        - récuperer le nom du fichier/classe
        - afficher le nom du fichier

les notions vu : 
    - Trouver le nom du fichier

### Terre3 : Afficheur d’arguments
        il faut écrire programme quiCréez un programme qui affiche les arguments qu’il reçoit ligne par ligne, peu importe le nombre d’arguments.

        Exemples d’utilisation :
        $> ruby exo.rb je suis solide !
        je
        suis
        solide
        !
    
        Solution : 
        - récuperer les arguments separés par des espace
        - les mettre dans un tableau
        - boucler sur le tableu et afficher chaque arguments

les notions vu :
- gerer les arguments en entrée d'un programme
- boucler sur un tableau
- gerer le cas d'erreur

### Terre4 : L’alphabet à partir de
        il faut écrire programme qui affiche l’alphabet à partir de la lettre donnée en argument en lettres minuscules suivi d’un retour à la ligne.


        Exemples d’utilisation :
        $> python exo.py n
        nopqrstuvwxyz
        $>
        
        
        Attention : votre programme devra utiliser une boucle.
        
        Solution : 
        - créer une variable avec l'alphabet 
        - le mettre sous format de tableau
        - récuperer la valeur entrée
        - s'assurer que c'est bien une lettre
        - boucler sur le tableau
        - si on trouve un qu'une valeur est égale à la valeur en entrée 
        - on commence à imprimer sur la même ligne
        - on peut aussi mettre les lettre suivante dans une variable string puis afficher la variables string



les notions vu :
- gerer les arguments en entrée d'un programme
- boucler sur un tableau
- gerer le cas d'erreur
- passer d'un string à un tableau 
- comparer les elements d'un tableau afin de vérifier si une valeur est presente


### Terre5 : Pair ou impair
        il faut écrire programme qui permet de déterminer si l’argument donné est un entier pair ou impair..


        Exemples d’utilisation :
        $> ruby exo.rb 2
        pair
        
        $> ruby exo.rb 5
        impair
        
        
        $> ruby exo.rb Bonjour
        Tu ne me la mettras pas à l’envers.
        
        $> ruby exo.rb
        Tu ne me la mettras pas à l’envers.
        
        
        Attention : gérez aussi les entiers négatifs.

    
        Solution : 
        - comprendre mathematiquement ce que pair/pair veux dore
        - récuperer l'argument en entrée
        - vérifier que c'est chiffre 
        - gèrer les erreurs le cas avec 0 ou négatif
        - vérifier si c'est divisible par 2 ou non

les notions vu :
- gerer les arguments en entrée d'un programme
- vérifier qu'un param est un chiffre
- gerer le cas d'erreur
- appliquer une formule mathematique

### Terre6 : Divisions
        il faut écrire programme qui affiche le résultat et le reste d’une division entre deux nombres.


        Exemples d’utilisation :
        $> python exo.py 5 2
        résultat: 2
        reste: 1
        
        
        $> python exo.py 10 0
        erreur.
        
        
        $> python exo.py 3 5
        erreur.



        Solution : 
        - récuperer les arguments en entrée
        - vérifier que ce sont des chiffres
        - vérifier que le deuxième est inférieur
        - gèrer les erreurs pour les 0 et les chiffre supérieur
        - faire la division 
        - calculer le résultat et le reste
            - utiliser un modulo
            - trouver une autre solution
        - afficher le rési=ultat
les notions vu :
- gerer les arguments en entrée d'un programme
- vérifier qu'un param est un entier
- utiliser un modulo
- gerer le cas d'erreur

### Terre7 : Inverser une chaîne
        il faut écrire programme qui affiche l’inverse de la chaîne de caractères donnée en argument.

        
        Exemples d’utilisation :
        $> node exo.js “Hello world!”
        !dlrow olleH
        
        
        $> node exo.js “lehciM”
        Michel
        
        Attention : je compte sur vous pour gérer les potentielles erreurs d’arguments.
        
        
        Fonctions interdites:
        -La fonction reverse

    
        Solution : 
        - récuperer le mot en entrée
        - gerer  les erreur en cas d'entrée null
        - les mettre dans un tableau
        - boucler sur le tableu en partant de la fin
        - ajouter chaque lettre 

les notions vu :
- gerer les arguments en entrée d'un programme
- connaîttre la taille d'un tableau
- boucler sur un tableau dans le sens inverse
- gerer le cas d'erreur

### Terre8 : Taille d’une chaîne

        il faut écrire programme qui affiche le nombre de caractères d’une chaîne de caractères passée en argument.


        Exemples d’utilisation :
        $> python exo.py “Hello world!”
        12
        
        
        $> python exo.py
        erreur.
        
        
        $> python exo.py “Bonjour” “Aurevoir”
        erreur.
        
        $> python exo.py 10
        erreur.
        
        
        Fonctions interdites:
        -La fonction length
        -La fonction size


    
        Solution : 
        - récuperer les arguments en entrée
        - gérer les erreur d'arguments
        - les mettre dans un tableau
        - vu que length et size sont interdit 
            - on va créer un int qui va servir de compteur 
            - boucler avec for i in tab
            - incrementer le int
        - avoir la valeur du int en fin de boucle
        

les notions vu :
- gerer les arguments en entrée d'un programme
- boucler sur un tableau
- incrementer une valeur à chaque boucle d'un tableau
- gerer le cas d'erreur

### Terre9 : L’alphabet
        il faut écrire programme qui affiche le résultat d’une puissance.

        
        L’exposant ne pourra pas être négatif.
        
        
        Exemples d’utilisation :
        $> node exo.js 2 3
        8
        
        Attention : je compte sur vous pour gérer les potentielles erreurs d’arguments.
        
        
        Fonctions interdites:
        -La fonction pow


    
        Solution : 
        - récuperer les arguments en entrée
        - vérifier que l'exposant est positif
        - gèrer les erreurs
        - boucler n fois en multipliant le résultat par le chiffre
        - decroitre le n avec n--
        - afficher le résultat une fois n = 0.

les notions vu :
- gerer les arguments en entrée d'un programme
- boucler n fois 
- gerer le cas d'erreur

### Terre10 : Nombre premier
        Pour afficher ce nombre il faut qu'il n y ai que son modulo 
        et le modulo 1 qui sont égales à 0

        en gros un boucle sur les modulos depuis 1, jusqu'au chiffre
        et vérifier qu'il n'y en a que 2 en tout.


### Terre 11 : 24 to 12 
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

### Terre 12 : 12 to 24 

    Créer un pgm qui prend une date au format AM et PM 
    et qui le met au format 24h

    on va donc : 
    1. vérifer le format 
    2. Split la partie des heures et celle des str
    3. s'il s'agit de 12 et AM alors 00 
    4. s'il s'agit de 12 et PM alors 12
    5. s'il s'agit de PM alors hh + 12

### Terre13 : Trouver la Suissie
    
    Créer un programme qui prend 3 entier en entrée
    et qui retourne celui du milieu
    
    on va donc : 
    1. Vérifier qu'il y a exactement 3 arguments
    2. Vérifier que ce sont des entiers et les transformer
    3. Trouver celui du milieu
        1. si ce n'est ni le plus grand 
        2. si ce n'est ni le plus pétit

### Terre14 : Trié ou pas 

    Créer un programme qui prend un nombre d'entier en entrée
    et qui vérifie si c'est trie 

    1. Vérifier qu'il y'ait au moins 2 entrées
    2. Vérifier que ce sont tous des entier
    3. Transformer en entier 
    4. Vérifier que i est plus grand que i+1
        1. initialiser la valeur à Integer MIN
        2. la comparer au premier
        3. puis après chaque  i le mettre dedans
        4. par la suite on compare le i avec la valeur de l'ancier
        5. break si c'est n'est pas supérieur. 
    
    on peut pousser plus loin l'éxo et voir les parties
    qui sont trié ou non. 