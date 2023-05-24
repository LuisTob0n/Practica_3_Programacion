package practica.pkg3;

import java.util.Scanner;

/**
 * @author Luis Tobon
 */

public class Practica3 {

    public static void main(String[] args) {
        
        int op = 0;
        
        do{
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Ingrese el metodo que desea ocupar: \n\n1. more20\n2. redTicket\n3. fizzString2"
            + "\n4. makeChocolate\n5. theEnd\n6. makeOutWord\n7. without2\n8. swapEnds\n9. makeLast\n10. unlucky1"
            + "\n11. matchUp\n12. only14\n13. has12\n14. twoTwo\n15. bobThere\n16. xyBalance\n17. xyzThere\n18. mixString"
            + "\n19. mirrorEnds\n20. seriesUp\n21. Salir\n");
            op = scan.nextInt();
            
            switch(op){
                
                case 1:
                    
                    System.out.println("\nMetodo elegido: more20");
                    System.out.print("Ingrese 1 numero a evaluar: ");
                    int entrada = scan.nextInt();
                    System.out.println("Entrada: " + entrada + " \nSalida: " + more20(entrada));
                    System.out.println("\nDesea usar otro metodo?\n1.Si\n2.No\n");
                    int repetir = scan.nextInt();
                    if(repetir == 2){
                        op = 21;
                        System.out.println("Saliendo...");
                        break;
                    }else{
                        System.out.println("");
                    }
                    break;
                    
                case 2:
                    
                    System.out.println("\nMetodo elegido: redTicket");
                    System.out.println("Ingrese 3 numeros a evaluar: ");
                    int entradared = scan.nextInt();
                    int entradared2 = scan.nextInt();
                    int entradared3 = scan.nextInt();
                    System.out.println("Entrada: " + entradared + ", " + entradared2 + ", " + entradared3 + " \nSalida: "  + redTicket(entradared,entradared2,entradared3));
                    System.out.println("\nDesea usar otro metodo?\n1.Si\n2.No\n");
                    int repetirred = scan.nextInt();
                    if(repetirred == 2){
                        op = 21;
                        System.out.println("Saliendo...");
                        break;
                    }else{
                        System.out.println("");
                    }
                    break;
                    
                case 3:
                    
                    System.out.println("\nMetodo elegido: fizzString2");
                    System.out.print("Ingrese 1 numero a evaluar: ");
                    int entradafiz = scan.nextInt();
                    System.out.println("Entrada: " + entradafiz + " \nSalida: " + fizzString2(entradafiz));
                    System.out.println("\nDesea usar otro metodo?\n1.Si\n2.No\n");
                    int repetirfiz = scan.nextInt();
                    if(repetirfiz == 2){
                        op = 21;
                        System.out.println("Saliendo...");
                        break;
                    }else{
                        System.out.println("");
                    }
                    break;
                    
                case 4:
                    
                    System.out.println("\nMetodo elegido: makeChocolate");
                    System.out.println("Ingrese 3 numeros a evaluar: ");
                    int entradamake = scan.nextInt();
                    int entradamake2 = scan.nextInt();
                    int entradamake3 = scan.nextInt();
                    System.out.println("Entrada: " + entradamake + ", " + entradamake2 + ", " + entradamake3 + " \nSalida: "  + makeChocolate(entradamake,entradamake2,entradamake3));
                    System.out.println("\nDesea usar otro metodo?\n1.Si\n2.No\n");
                    int repetirmake = scan.nextInt();
                    if(repetirmake == 2){
                        op = 21;
                        System.out.println("Saliendo...");
                        break;
                    }else{
                        System.out.println("");
                    }
                    break;
                    
                case 5:
                    
                    System.out.println("\nMetodo elegido: theEnd");
                    scan.nextLine();
                    System.out.println("Ingrese una palabra y su estado true o false ");
                    String entradaend = scan.nextLine();
                    boolean entradaend2 = scan.nextBoolean();
                    System.out.println("Entrada: " + entradaend + "\nEstado: " + entradaend2 + " \nSalida: " + theEnd(entradaend, entradaend2));
                    System.out.println("\nDesea usar otro metodo?\n1.Si\n2.No\n");
                    int repetirend = scan.nextInt();
                    if(repetirend == 2){
                        op = 21;
                        System.out.println("Saliendo...");
                        break;
                    }else{
                        System.out.println("");
                    }
                    break;

                case 6:
                    
                    System.out.println("\nMetodo elegido: makeOutWord");
                    scan.nextLine();
                    System.out.println("Ingrese un patron y una frase ");
                    String entradaout = scan.nextLine();
                    String entradaout2 = scan.nextLine();
                    System.out.println("Entrada: " + entradaout + ", " + entradaout2 + " \nSalida: " + makeOutWord(entradaout, entradaout2));
                    System.out.println("\nDesea usar otro metodo?\n1.Si\n2.No\n");
                    int repetirout = scan.nextInt();
                    if(repetirout == 2){
                        op = 21;
                        System.out.println("Saliendo...");
                        break;
                    }else{
                        System.out.println("");
                    }
                    break;
                    
                case 7:
                    
                    System.out.println("\nMetodo elegido: without2");
                    scan.nextLine();
                    System.out.println("Ingrese una frase ");
                    String entradawith = scan.nextLine();
                    System.out.println("Entrada: " + entradawith + " \nSalida: " + without2(entradawith));
                    System.out.println("\nDesea usar otro metodo?\n1.Si\n2.No\n");
                    int repetirwith = scan.nextInt();
                    if(repetirwith == 2){
                        op = 21;
                        System.out.println("Saliendo...");
                        break;
                    }else{
                        System.out.println("");
                    }
                    break;
                    
                case 8:
                    
                    System.out.println("\nMetodo elegido: swapEnds");
                    System.out.print("Ingrese la cantidad de numeros a ingresar: ");
                    int entradaends = scan.nextInt();
                    int[] numeros = new int[entradaends];
                    System.out.println("");
                    for(int i = 0; i <= entradaends - 1; i++){
                        System.out.print("Ingrese el numero " + (i+1) + ": ");
                        numeros[i] = scan.nextInt();
                    }
                    System.out.println("");
                    System.out.print("Entrada: ");
                    for(int i = 0; i <= entradaends - 1; i++){
                        System.out.print(numeros[i] + ", ");
                    }
                    swapEnds(numeros);
                    System.out.print("\nSalida: ");
                    for(int i = 0; i <= entradaends - 1; i++){
                        System.out.print(numeros[i] + ", ");
                    }
                    System.out.println("\n\nDesea usar otro metodo?\n1.Si\n2.No\n");
                    int repetirends = scan.nextInt();
                    if(repetirends == 2){
                        op = 21;
                        System.out.println("\nSaliendo...");
                        break;
                    }else{
                        System.out.println("");
                    }
                    break;
                    
                case 9:
                    
                    System.out.println("\nMetodo elegido: makeLast");
                    System.out.print("Ingrese la cantidad de numeros a ingresar: ");
                    int entradalast = scan.nextInt();
                    int[] nums = new int[entradalast];
                    System.out.println("");
                    for(int i = 0; i <= entradalast - 1; i++){
                        System.out.print("Ingrese el numero " + (i+1) + ": ");
                        nums[i] = scan.nextInt();
                    }
                    System.out.println("");
                    System.out.print("Entrada: ");
                    for(int i = 0; i <= entradalast - 1; i++){
                        System.out.print(nums[i] + ", ");
                    }
                    int[] resul = makeLast(nums);
                    System.out.print("\nSalida: ");
                    for(int i = 0; i <= resul.length - 1; i++){
                        System.out.print(resul[i] + ", ");
                    }
                    System.out.println("\n\nDesea usar otro metodo?\n1.Si\n2.No\n");
                    int repetirlast = scan.nextInt();
                    if(repetirlast == 2){
                        op = 21;
                        System.out.println("\nSaliendo...");
                        break;
                    }else{
                        System.out.println("");
                    }
                    break;
                    
                case 10:
                    
                    System.out.println("\nMetodo elegido: unlucky1");
                    System.out.print("Ingrese la cantidad de numeros a ingresar: ");
                    int entradaun = scan.nextInt();
                    int[] num = new int[entradaun];
                    System.out.println("");
                    for(int i = 0; i <= entradaun - 1; i++){
                        System.out.print("Ingrese el numero " + (i+1) + ": ");
                        num[i] = scan.nextInt();
                    }
                    System.out.println("");
                    System.out.print("Entrada: ");
                    for(int i = 0; i <= entradaun - 1; i++){
                        System.out.print(num[i] + ", ");
                    }
                    boolean result = unlucky1(num);
                    System.out.print("\nSalida: ");
                    System.out.print(result);
                    System.out.println("\n\nDesea usar otro metodo?\n1.Si\n2.No\n");
                    int repetirun = scan.nextInt();
                    if(repetirun == 2){
                        op = 21;
                        System.out.println("\nSaliendo...");
                        break;
                    }else{
                        System.out.println("");
                    }
                    break;
                    
                case 21:
                    
                    System.out.println("Saliendo");
                    break;
                    
                default:
                    
                    System.out.println("\nIngrese una opcion valida\n");
                    break;
            }
            
        }while(op != 21);
    }
    
    
//José Luis Tobón Martínez S19017385

    public static boolean more20(int n) {

      boolean estado = false;
      if(n % 20 == 1 || n % 20 == 2){
        estado = true;
      }else {
        estado = false;
      }
      return estado;

    }



    public static int redTicket(int a, int b, int c) {

      int resultado = 0;

      if(a == 2 && b == 2 && c == 2){

        resultado = 10;

      }else if(a == b && a == c){

        resultado = 5;

      }else if(a != b && a != c){

        resultado = 1;

      }else{

        resultado = 0;

      }

      return resultado;

    }



    public static String fizzString2(int n) {

      String resultado;

      if(n % 3 == 0 && n % 5 == 0){

        resultado = "FizzBuzz!";

      }else if(n % 5 == 0){

        resultado = "Buzz!";

      }else if(n % 3 == 0){

        resultado = "Fizz!";

      }else{

        String resul = n + "";
        resultado = resul + "!";

      }

      return resultado;

    }



    public static int makeChocolate(int small, int big, int goal) {

      int mBig = goal / 5;

      if(big >= mBig){

        goal = goal - mBig * 5;

      }else{

        goal =  goal - big * 5;

      }

      if(small >= goal){

        return goal;

      }else{

        return -1;

      }

    }



    public static String theEnd(String str, boolean front) {

      String resul = null;

      if(front == true){
        resul = str.substring(0,1);
      }else if(front == false){
        resul = str.substring(str.length() -1);
      }

      return resul;

    }



    public static String makeOutWord(String out, String word) {

      String mensaje, mensaje2, salida = null;

      mensaje = out.substring(0,2);
      mensaje2 = out.substring(2, out.length());
      salida = mensaje + word + mensaje2;

      return salida;

    }



    public static String without2(String str) {

      if (str.length() < 2){

        return str;

      }

      String inicio = str.substring(0,2);
      String fin = str.substring(str.length() -2);
      String print = str.substring(2,str.length());

      if(inicio.equals(fin)){

        return  print;

      }
      if(!inicio.equals(fin)){

        return str;

      }

      return str;

    }



    public static int[] swapEnds(int[] nums) {

      int size = nums.length - 1;

            if(size > 0 ){
                int inicio = nums[0];
                int fin = nums[size];

                nums[0] = fin;
                nums[size] = inicio;
                return nums;
            }

            return nums;

    }



    public static int[] makeLast(int[] nums) {

      int size = nums.length - 1;
      int tamaño = nums.length ;

      int []arr = null;


      int fin = nums[size];
      arr = new int[tamaño * 2];

      for(int i = 0; i < arr.length - 1; i++){
         arr[i] = 0;
      }

      int tam = arr.length - 1;
      arr[tam] = fin;

      return arr;

    }



    public static boolean unlucky1(int[] nums) {

      boolean estado = false;
      int size = nums.length -1;

      if(nums.length < 2){

        estado = false;

      }else if(nums[0] == 1 && nums[1] == 3){

        estado = true;

      }else if(nums[1] == 1 && nums[2] == 3){

        estado = true;

      }else if(nums[size] == 3 && nums[size - 1] == 1){

        estado = true;

      }else if(nums[size - 1] == 3 && nums[size - 2] == 1){

        estado = false;

      }else{

        estado = false;

      }

      return estado;

    }



    public int matchUp(int[] nums1, int[] nums2) {

      int cuenta = 0;

      for(int i = 0; i < nums1.length ; i++){

        int num1 = nums1[i];
        int num2 = nums2[i];
        int diferencia = num1 - num2;

        if(diferencia <= 2 && diferencia >= -2 && diferencia != 0){
           cuenta = cuenta + 1; 
        }

      }

      return cuenta;

    }



    public boolean only14(int[] nums) {

     boolean estado = true;

      for(int i = 0; i < nums.length; i ++){

         if(nums[i] == 1 || nums[i] == 4){
            estado = true;
         }else if (nums[i] != 1 || nums[i] != 4){
            estado = false;
            break;
         }
      }

      return estado;

    }



    public boolean has12(int[] nums) {

      int indice = -1; 

        for(int i = 0; i < nums.length; i++){
          if(nums[i] == 1){
            indice = i;
          }else if(nums[i] == 2 && indice != -1 && i > indice){
            return true;
          }
        }

      return false;

    }



    public boolean twoTwo(int[] nums) {

      for (int i = 0; i < nums.length; i++) {

        if (nums[i] == 2) {
          if (!((i > 0 && nums[i - 1] == 2) || (i < nums.length - 1 && nums[i +
             1] == 2))) {
            return false;
          }
        }
      }
      return true;

    }



    public boolean bobThere(String str) {

      boolean estado = false;

      for (int i = 0; i < str.length() - 2; i++) {
        if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
          estado = true;
        }
      }

      return estado;

    }



    public boolean xyBalance(String str) {

      boolean estado = true;

      for (int i = 0; i < str.length(); i++) {

        if (str.charAt(i) == 'x') {

          estado = false;

        } else if (str.charAt(i) == 'y') {

          estado = true;

        }

      }

      return estado;

    }



    public boolean xyzThere(String str) {

      if (str.length() < 3){

        return false; 

      }

      if (str.substring(0, 3).equals("xyz")) {

        return true;

      }

      for (int i = 1; i < str.length() - 2; i++) {

        if (str.charAt(i-1) != '.' && str.substring(i, i+3).equals("xyz")) {

          return true;

        }

      }

      return false;

    }



    public String mixString(String a, String b) {

      String resultado = "";

      int longitud = 0;

      if (a.length() < b.length()) {
        longitud = a.length();
      } else {
        longitud = b.length();
      }

      for (int i = 0; i < longitud; i++) {
        resultado = resultado + a.substring(i, i + 1) + b.substring(i, i + 1);
      }

      if (a.length() > b.length()) {
        resultado = resultado + a.substring(longitud);
      } else {
        resultado = resultado + b.substring(longitud);
      }

      return resultado;

    }



    public String mirrorEnds(String string) {

      String resultado = "";

      int tamaño = string.length();

        for (int i = 0; i < tamaño; i++) {
          if (string.charAt(i) == string.charAt(tamaño - i - 1)) {
            String convertir = String.valueOf(string.charAt(i));
            resultado =  resultado + convertir;
          }else{
            break;
          }
      }

      return resultado;

    }



    public int[] seriesUp(int n) {

      int longitud = n * (n + 1) / 2;
      int[] resultado = new int[longitud];
      int indice = 0;
      int contador = 1;

      for (int i = 0; i < longitud; i++) {
        resultado[i] = contador;
        indice = indice + 1;

        if (indice == contador) {
          contador = contador + 1;
          indice = 0;
        }
      }

      return resultado;

    }

}
