#!/bin/sh

setup_git() {
  git config --global user.email "travis@travis-ci.org"
  git config --global user.name "Travis CI"
}

commit() {
  git add . *.html
  git commit --message "Travis build: $TRAVIS_BUILD_NUMBER"
}

upload_files() {
  echo "Test1"
  ls
  echo "Test2"
  ls kaputelefon/kaputelefon-frontend
  echo "Test3"
  ls kaputelefon/kaputelefon-frontend/target
  echo "Test4"
  git remote rm origin
  git remote add origin https://dobrosi:${GH_TOKEN}@github.com/dobrosi/jozsefutca.git
  git add kaputelefon/kaputelefon-frontend/target/*.html
  git commit -m "target"
  git push origin master
}

setup_git
commit
upload_files

