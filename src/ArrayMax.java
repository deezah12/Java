public class ArrayMax {
    public static void main(String[] args) {
        ArrayMax arrayMax = new ArrayMax();
        arrayMax.maximum();
        arrayMax.minimum();

    }

      public void maximum(){
        int[] array = {2, 3, 1, 5, 8, 3};
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber){
                maxNumber = array[i];
            }
        }
        System.out.println(maxNumber);
      }

    public void minimum(){
        int[] array1 = {2, 3, 1, 5,7, 8, 3};
        int minNumber = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < minNumber){
                minNumber = array1[i];
            }
        }
        System.out.println(minNumber);
    }
}
