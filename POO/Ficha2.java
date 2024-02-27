package POO;

public class Ficha2 {

    public int minimo(int[] array){
        int res = 0;
        if(array.length == 0){
            return -1;
        }
        else{
            res=array[0];
            for(int i = 0; i < array.length; i++){
                if (res >= array[i]) {
                    res = array[i];
                }
            }
        }
        return res;
    }

    public int[] indices(int[] array, int pi, int si){
        int tam = si-pi+1;
        int[] res = new int[tam];
        for(int j = 0; j < tam; j++){
            res[j] = array[pi+j];
        }
        return res;
    }
}
