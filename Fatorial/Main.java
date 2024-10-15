public class Main {
    public static void main(String[] args){
    int num = 5;
    int fatorial = calculo(num);
    System.out.print(+num+ "! é igual a: " +fatorial);
    }
    public static int calculo(int n){
        int resultado = 1;
        for(int i = 1; i <=n; i++){
            resultado *=i;
        }
        return resultado;

    }
}