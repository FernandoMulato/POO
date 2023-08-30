
package exercise;


public class exercise_1 {

    
    public static void main(String[] args) {
        exercise_1 ex = new exercise_1();
        // El static ayuda a evitar crear la instancia, pero no es orientado a objetos.
        // Método 1
        System.out.println(ex.factorial(5));
        // Método recursivo
        System.out.println(ex.factorial_r(5));
    }
    public int factorial_r(int num){
        if(num == 1 || num == 0){
        return 1;
        } else{
            return factorial_r(num - 1) * num;
        }
      }
    public int factorial(int num){
        int aux = 1;
        for(int i = 1; i <= num; i++){
            aux = aux * i;
        }
        return aux;
      }
    }

