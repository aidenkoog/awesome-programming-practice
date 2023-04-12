# how to release study note.
git stash
git pull origin master
git stash pop
git add .
git commit -m "[feat.] Update programming practice code"
git push origin master