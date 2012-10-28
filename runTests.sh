#!/bin/bash

# Text color variables
txtund=$(tput sgr 0 1)          # Underline
txtbld=$(tput bold)             # Bold
bldred=${txtbld}$(tput setaf 1) #  red
bldblu=${txtbld}$(tput setaf 4) #  blue
bldwht=${txtbld}$(tput setaf 7) #  white
bldgrn='\e[1;32m'               #  green
txtrst=$(tput sgr0)             # Reset

TEST_PATH="tests/grammarBasics"

for testCase in `ls ${TEST_PATH}`; do

    if [ "$#" -ge 0 ] && [ "$testCase" == "$1" ] || [ "$#" -eq 0 ] ; then

        echo
        echo -e "${bldgrn}${testCase}"
        s=$( printf "%${#testCase}s" ); echo "${s// /=}"
        echo -e "${txtrst}\n"

        for jsonFile in `ls ${TEST_PATH}/${testCase}/*.json`; do
            echo "${bldwht}${jsonFile}${txtrst}"
            s=$( printf "%${#jsonFile}s" ); echo "${s// /-}"
            echo -n ${bldred}
            if [[ "$jsonFile" == *"not-"* ]]; then
                java -jar dist/jorderly.jar ${TEST_PATH}/${testCase}/*.orderly $jsonFile
                if [ $? = 0 ]; then
                    echo -e "FAILURE, NOT A SINGLE ERROR ON TEST!"
                fi
            else
                java -jar dist/jorderly.jar ${TEST_PATH}/${testCase}/*.orderly $jsonFile || echo -e "FAILURE ON TEST!"
            fi
            echo -n ${txtrst}
            echo -e "\n"
        done;
    fi
done;
