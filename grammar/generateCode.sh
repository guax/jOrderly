#!/bin/bash

# Orderly Grammar
java -jar antlr-3.4-complete.jar -o ../src/net/guax/jorderly/parser Orderly.g

# JSON Grammar
java -jar antlr-3.4-complete.jar -o ../src/net/guax/jorderly/parser JSON.g
