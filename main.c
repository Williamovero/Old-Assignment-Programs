#include <stdio.h>
#include <stdlib.h>


  union { int c; char b; float d[4]; } a;
 double *g[4][4];
int main()
{
    printf("sizeof(a) == %d ", sizeof(a));
 printf("sizeof(b) == %d n/", sizeof(g));
 printf("sizeof(c) == %d", sizeof(a));
 printf("sizeof(d) == %d", sizeof(a));
 printf("sizeof(e) == %d", sizeof(a));
 printf("sizeof(f) == %d", sizeof(a));
 printf("sizeof(g) == %d", sizeof(a));
 printf("sizeof(a) == %d", sizeof(a));








    getch();
    return 0;
}
