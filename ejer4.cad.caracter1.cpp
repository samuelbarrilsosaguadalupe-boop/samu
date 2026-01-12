#include <stdio.h>
#include <string.h>

char cad[80];
int ca, cb;
int i=0;

main(){
	printf ("contar a y b en una frase\n");
	ca=0;
	cb=0;
	printf ("frase:");
	scanf ("%[^\n]",&cad);
	
	while (cad[i]!='\0'){
		if (cad[i]=='a'){
			ca=ca+1;
		}
		if (cad[i]=='b'){
			cb=cb+1;
		}
		i=i+1;
	}
	printf ("contador de a=%d y contador de b=%d",ca,cb);
}