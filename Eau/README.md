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

