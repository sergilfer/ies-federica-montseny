#! /bin/bash

if [[ $# -ne 3 ]]
then
	echo "ERROR debe tener 3 argumentos de entrada"
else	
	FILE=$1
	TEXT=$2
	OUTPUT=$3
	cat $FILE | grep $TEXT >> $OUTPUT
fi

