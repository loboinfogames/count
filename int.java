public class Exercici1 {

    public static void main(String[] args) {
int resultado = 5;
int[] array = new int[]{1,3,6,9,12,15,18,20,25,12,34};
for(int i =10;i>=5;i--)
{
    if (i ==10)continue;
    if (i%2==0)
    resultado++;
    else 
    resultado +array[i];
}
    }