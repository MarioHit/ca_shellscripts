# Eau

### Eau00 : Combinaisons de 3 chiffres
    
    Créez un programme qui affiche toutes les différentes combinaisons possibles de trois chiffres dans l’ordre croissant, dans l’ordre croissant. La répétition est volontaire.
    
    
    Exemples d’utilisation :
    $> python exo.py
    012, 013, 014, 015, 016, 017, 018, 019, 023, 024, ... , 789
    $>
    
    987 n’est pas là parce que 789 est présent.
    
    020 n’est pas là parce que 0 apparaît deux fois.
    
    021 n’est pas là parce que 012 est présent.
    
    000 n’est pas là parce que cette combinaison ne comporte pas exclusivement des chiffres différents les uns des autres


    Solution :
    - faire un tableua qui va contenir les combinaisons
    - vu que ce sont de chiffres on ne va pas créer des variables mais juste boucler 
        - nous allons faire 3 boucles
        - la première pour le premier chiffre  X( de 0 0 9 )
        - la deuxième pour le chiffre du milieu Y ( de X+1 à 9)
        - la trousième pour le chiffre de droite Z  ( de y+1 à 9)
    - une fois que nous avons les 3
        - on charge la combinaison dans la liste créée plus haut
        - on continue de boucler sur Z 
        - puis sur  y z puis on recommence avec X, y ? Z
    - faire des tests qu'ils sont trié 
    - faire des tests que des valeurs sont uniques

notions : 
    - tableau 
    - tableua imbriqués
    - gestion des strings
    - gestion des erreurs


### Eau01 : Combinaisons des 2 chiffres
    Créez un programme qui affiche toutes les différentes combinaisons de deux nombre entre 00 et 99 dans l’ordre croissant.


    Exemples d’utilisation :
    $> python exo.py
    00 01, 00 02, 00 03, 00 04, ... , 00 99, 01 02, ... , 97 99, 98 99
    $>

    Solution : 
    - voir c'est quoi la différence entre nombre et chiffre
    - faire un tableau qui va contenir les combiansons
    - faire 2 boucles un sur les unités de 0 à 9 
    - et l'autre de 1 à 9
    - chauqe combinaison fait est ajouté au tableau des combinaisons.


notions : 
- tableau
- gestion des strings
- gestion des erreurs



### Eau02 : Paramètres à l’envers
    Créez un programme qui affiche ses arguments reçus à l’envers.
    
    
    Exemples d’utilisation :
    $> python exo.py “Suis” “Je” “Drôle”
    Drôle
    Je
    Suis
    
    
    $> python exo.py ha ho
    ho
    ha
    
    $> python exo.py “Bonjour 36”
    Bonjour 36
    
    Afficher error et quitter le programme en cas de problèmes d’arguments.

        Solution : 
    - boucler sur les args en commenceant par le dernier
    - afficher les elemts un à un 

    - utilisere une stack 
        - la remplir en bouclan sur les args
        - faire un boucle while sur la stack et enlever chaque élément avec .pop() 
        - puis l"afficher 
        - avec la stack on boucle 2 fois!!!

notions :
- gèrer les arguments en entrée
- tableau
- boucler dans l'autre sens / utiliser une stack
- gestion des strings 
- gestion des erreurs


### Eau03 : Suite de Fibonacci
    Créez un programme qui affiche le N-ème élément de la célèbre suite de Fibonacci. (0, 1, 1, 2) étant le début de la suite et le premier élément étant à l’index 0.

    
    Exemples d’utilisation :
    $> python exo.py 3
    2
    $>
    
    Afficher -1 si le paramètre est négatif ou mauvais.

    Solution : 
    - comprendre c'est quoi fibonaci : 
    - faire un tableau trié contenant la suite
    - regler l'index avec le test pour trouver le bon N eme element en entrée
    - savoir quand s'arreter si pas d'entrée



notions :
- suite de fibonacci :
    un tableau contenant O et 1  ,puis le chiffre est égale à la somme des deux précents , dans l'index-1 , et index-2
  0 1 1 2 3 5 8 13 21 34 55 89 144 
  Xn = Xn-1 + Xn_2
- gèrer les arguments en entrée
- tableau
- gestion des strings 
- gestion des erreurs


### Eau04 : Prochain nombre premier

``` 
Créez un programme qui affiche le premier nombre premier supérieur au nombre donné en argument.


Exemples d’utilisation :
$> python exo.py 14
17
$>

Afficher -1 si le paramètre est négatif ou mauvais.

```

#### Solution
* comprendre les chiffre premier
* créer un algo pour les mettre dans un tableau
* bucler sur un tableau
* transformer entrée en int
*comparer le chiffre en entrée pour comprendre

####Tests :
* les entrée est ce qu'il y a quelque chose
* voir si c'est un string ou un int
* tester l'exemple en entrée

#### Notions vu :
* comprendre formule chiffre premier : 
  c'est tout chiffre supérieur à 1 , qui est uniquement divisible par 1 et par lui même.  
  donc pour ça je vais utiliser un modulo : s'il est égal à zéro c'est que c'est divisible
* gèrer les entrées / erreurs
* boucler sur un tableau
    * boucler avec while et ++
    * arreter une boucle 



### Eau05 : String dans string

``` 
Créez un programme qui détermine si une chaîne de caractère se trouve dans une autre.


Exemples d’utilisation :
$> python exo.py bonjour jour
true


$> python exo.py bonjour joure
false


$> python exo.py 42
error

Afficher error et quitter le programme en cas de problèmes d’arguments.

```

#### Solution
* prendre les deux arguments
* comparer une à une
* si une lettre de la second est dans le premier
    * alors on compare les suivant jusqu'à ce que le deuxième mot soit fini
    * si  une de lettres est fausse
    

* on peue aussi prendre le premier lettre du 2eme mot
* l'utiliser pour split le premier mot ,
* le spliter encore à la fin à la taille du 2eme mot
* puis comparer juste les deux tableau ,
    * si c'est pas égale
    * passer à la prochaine lettre de la 1er,
    * si c'est bon , on a notre répeition


* créer un algo pour les mettre dans un tableau
* bucler sur un tableau
* transformer entrée en int
  *comparer le chiffre en entrée pour comprendre

####Tests :
* les entrée est ce qu'il y a quelque chose
* voir si c'est un string
* vérifier le split
* comparer 2 tableau 
* tester l'exemple en entrée

#### Notions vu :
* gèrer les entrées / erreurs
* gerer les strings
* boucler sur un tableau
    * boucler avec while et ++
    * arreter une boucle 
    

