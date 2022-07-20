#!/bin/sh

build() {
  cd kaputelefon/kaputelefon-frontend
  export version = "1.$TRAVIS_BUILD_NUMBER"
  echo "var version = '$version';" > src/script/version.js

  npm install -g gulp-cli
  npm install gulp --save-dev
  npm i gulp-inline-source

  gulp inlinesource

  git config --global user.email "dobrosi@gmail.com"
  git config --global user.name "Travis CI"
  git tag "kaputelefon-frontend-$version"
}

build