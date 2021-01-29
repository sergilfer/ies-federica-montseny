#! /bin/bash

COMMAND=$1
if [[ $# -lt 1 ]]
then
	echo "ERROR debe introducir 1 argumentos de entrada como minimo"
else
	
	if [[ $COMMAND == "count" ]]
	then
		if [[ $# -ne 3 ]]
		then
			echo "ERROR se necesitan 3 argumentos"
		else
		read -p "introduce un fichero para leer " INPUT_FILE
		read -p "introduce un texto para buscar " TEXT

		cat $INPUT_FILE | grep $TEXT | wc -l
		fi
	elif [[ $COMMAND == "remove" ]]
	then 
		if [[ $# -ne 2 ]]
		then 
			echo "son necesarios 2 argumentos"
		else
			read -p "introduce un fichero para borrar " FILE
			rm -rf $FILE
		fi
	elif [[ $COMMAND == "list" ]] 
	then 
		if [[ $# -ne 2 ]]
		then
			echo "debe introducir 2 argumentos de entrada"
		else
			read -p "introduce la ruta la cual quieres listar " ROUTE
			ls -lah $ROUTE
		fi
	else
		echo "no ha introducido ningun comando valido"
	fi
fi
