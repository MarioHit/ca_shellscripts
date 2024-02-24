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
