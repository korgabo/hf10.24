package diamond.a.b;

public class Main {
    public static void main(String[] args) {
        
        if(args.length != 1){
        System.err.println("Kérlek egy páratlan bemenetet adj meg paraméterként!");
        System.exit(1);
        }
       int params = Integer.parseInt(args[0]);
        if (params % 2 == 0){
         System.err.println("Kérlek egy páratlan bemenetet adj meg paraméterként!");
        System.exit(1);
       }
       //   *   
       //  ***  
       // ***** 
       //  ***  
       //   *   
       // 7 / 2 = 3
       for(int i = 1; i <= params; i+=2){
        int csillagok = i;
        int szelesseg = params;
        int szokozok = (params - i) / 2;
        //System.out.println(szelesseg +","+ szokozok + "," +csillagok);
        for(int j = 0; j< szokozok; j++){
          System.out.print(' ');
        }
        for(int z = 0; z < csillagok; z++){
          System.out.print('*');
        }
        System.out.println();
      }
      for(int i = params-2  ; i >= 1; i-=2){
        int csillagok = i;
        int szelesseg = params;
        int szokozok = (params - i) / 2;
        //System.out.println(szelesseg + "," + szokozok + "," +csillagok);
        for(int j = 0; j< szokozok; j++){
          System.out.print(' ');
        }
        for(int z = 0; z < csillagok; z++){
          System.out.print('*');
        }
        System.out.println();
      }
     }
}
