#!/bin/sh

setup() {
  mkdir work
  cd work
  cp ../gulpfile.js . 
  npm install gulp
  npm install gulp --save-dev
  npm i gulp-inline-source

  gulp inlinesource

  cd ..
}

setup_git() {
  git config --global user.email "travis@travis-ci.org"
  git config --global user.name "Travis CI"
}

commit() {
  git switch master
  git remote set-url origin https://dobrosi:${GH_TOKEN}@github.com/dobrosi/jozsefutca.git
  git add .
  git commit --message "Travis build: $TRAVIS_BUILD_NUMBER"
}

upload_files() {
  git push origin master
}

setup
setup_git
commit
upload_files

