#!/bin/sh

setup_git() {
  git config --global user.email "travis@travis-ci.org"
  git config --global user.name "Travis CI"
}

commit() {
  git switch master
  git remote set-url origin https://dobrosi:${GH_TOKEN}@github.com/dobrosi/jozsefutca.git
  git add kaputelefon/kaputelefon-frontend/target/*.html
  git commit --message "Travis build: $TRAVIS_BUILD_NUMBER"
}

upload_files() {
  git push origin master
}

setup_git
commit
upload_files

