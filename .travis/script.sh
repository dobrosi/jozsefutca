#!/bin/sh

build() {
  cd kaputelefon/kaputelefon-frontend

  npm install -g gulp-cli
  npm install gulp --save-dev
  npm i gulp-inline-source

  gulp inlinesource

  git config --global user.email "dobrosi@gmail.com"
  git config --global user.name "Travis CI"
  git tag $TRAVIS_BUILD_NUMBER
}

build