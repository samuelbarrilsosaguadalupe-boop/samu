#include <stdio.h>

int n;
int m;
int r;
int i;

main()
{
	printf ("multiplicacion con FOR\n");
	do{
		printf ("numero:");
		scanf ("%d",&n);
		printf ("por:");
		scanf ("%d",&m);
	}while (n<1 && m<1);
	r=0;
	for (i=1;i<=m;i++){
		r=n+r;
	}
	printf ("r=%d",r);	
}