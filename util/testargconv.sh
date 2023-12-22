#!/bin/sh

shift # run
shift # exit code

for arg in "$@"
do
    if [[ ("$prev") ]]
    then
        /bin/echo -n "\"$prev\", "
    fi
    prev="$arg"
done
echo "\"$arg\""
