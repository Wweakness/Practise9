public class Heaps {
    //前提：除了要调整的位置，其他位置已经满足堆的性质
    //index要调整的位置
    //array被看作堆的数组
    //size数组中被看作堆的值


    //向下调整，大堆（除了index和它的孩子外，其他位置已经满足堆性质了）
    public static void heapify(int[] array,int size,int index){
        while(true){
            int left=index*2+1;
            if(left>=size){
                return;
            }
            int max=left;
            if(left+1<size){
                if(array[max]<array[left+1]){
                    max=left+1;
                }
            }
            if(array[max]>array[index]){
                swap(array,index,max);
                index=max;
            }
            else{
                return;
            }
        }
    }
    //交换数组两个元素
    public static void swap(int[] array,int i,int j){
        int t=array[i];
        array[i]=array[j];
        array[j]=t;
    }
    //建堆（任意数组转化成大堆）
    public static void creatHeap(int[] array,int size){
        for(int i=(size-2)/2;i>=0;i--){
            heapify(array,size,i);
        }
    }
    //向上调整(大堆)
    public static void adjustUp(int[] array,int index){
        while(true) {
            if(index==0){
                return;
            }
            int i = (index - 2) / 2;
            if (array[i] < array[index]) {
                swap(array, i, index);
                index = i;
            }else {
                return;
            }
        }

    }
}
