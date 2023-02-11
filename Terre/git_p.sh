git status;
echo  ----------1 status
git add --all ;
echo -----------2 add
git status;
echo -----------3 status 
echo message de commit svp ? 
read message
echo  ceci est le message " $message " 
git diff;
echo ----------3.1 diff
echo ----------4 message
git commit -m " $message ";
echo ----------5 commit
git status;
echo ----------6 status 
git diff;
echo ----------6.1 diff 

git push;
echo ----------7 push

git status;
echo ----------8 status
