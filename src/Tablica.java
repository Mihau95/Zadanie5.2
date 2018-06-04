public class Tablica {
    public static void main(String[] args) {
        int[] tabLi = {1,5,7,6,4};
        int sum = 0;
        for (int i = 0; i<tabLi.length; i++){
            if(i%2!=0){
                continue;
            }

            sum+=tabLi[i];
        }
        System.out.println(sum);
    }
}
