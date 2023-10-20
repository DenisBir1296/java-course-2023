package hw1;

public class Task4 {
    static boolean isNestable(int[] a, int[] b){

        boolean flag = false;

        if(b.length > a.length)
        {
            int[] c = a;
            a = b;
            b = c;
        }

        for(int i = 0; (!flag) && (i <= (a.length - b.length)); i++){
            flag = true;
            for(int j = 0; flag && j < b.length; j++)
                flag = a[i + j] == b[j];
        }
        return flag;
    }
}
