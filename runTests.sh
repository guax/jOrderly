#!/bin/bash

# Text color variables
txtund=$(tput sgr 0 1)          # Underline
txtbld=$(tput bold)             # Bold
bldred=${txtbld}$(tput setaf 1) #  red
bldblu=${txtbld}$(tput setaf 4) #  blue
bldwht=${txtbld}$(tput setaf 7) #  white
bldgrn='\e[1;32m'               #  green
txtrst=$(tput sgr0)             # Reset

echo
echo -e "${bldgrn}Testing Grammar Basics"
echo -e "======================${txtrst}\n"

TEST_PATH="tests/grammarBasics"

for testCase in `ls ${TEST_PATH}`; do
    for jsonFile in `ls ${TEST_PATH}/${testCase}/*.json`; do
        echo "${bldwht}${jsonFile}${txtrst}"
        s=$( printf "%${#jsonFile}s" ); echo "${s// /-}"
        echo -n ${bldred}
        java -jar dist/jorderly.jar ${TEST_PATH}/${testCase}/*.orderly $jsonFile || echo -e "FAILURE ON TEST!"
        echo -n ${txtrst}
        echo -e "\n"
    done;
done;
