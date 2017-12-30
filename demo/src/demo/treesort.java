package demo;
public class treesort 
{
    public static int[] TreeSelectionSort(int[] mData) 
    {  
        int TreeLong = mData.length * 4;  
        int MinValue = -10000;  
        int[] tree = new int[TreeLong]; // ���Ĵ�С  
        int baseSize;  
        int i;  
        int n = mData.length;  
        int max;  
        int maxIndex;  
        int treeSize;  
        baseSize = 1;  
          
        while (baseSize < n) {  
            baseSize *= 2;  
        }  
        treeSize = baseSize * 2 - 1;  
          
        for (i = 0; i < n; i++) 
        {  
            tree[treeSize - i] = mData[i];  
            System.out.println(tree[treeSize - i]);
        }  
        for (; i < baseSize; i++) 
        {  
            tree[treeSize - i] = MinValue;
            System.out.println(tree[treeSize - i]);
        }  
        // ����һ����  
        for (i = treeSize; i > 1; i -= 2) 
        {  
            tree[i / 2] = (tree[i] > tree[i - 1] ? tree[i] : tree[i - 1]); 
            System.out.println(tree[i / 2]);
        }  
        n -= 1;  
        while (n != -1) {  
            max = tree[1];  
            mData[n--] = max;  
            maxIndex = treeSize;  
            while (tree[maxIndex] != max) 
            {  
                maxIndex--;  
            }  
            tree[maxIndex] = MinValue;  
            while (maxIndex > 1) 
            {  
                if (maxIndex % 2 == 0) 
                {  
                    tree[maxIndex / 2] = (tree[maxIndex] > tree[maxIndex + 1] ? tree[maxIndex]:tree[maxIndex + 1]);  
                } 
                else 
                {  
                    tree[maxIndex / 2] = (tree[maxIndex] > tree[maxIndex - 1] ? tree[maxIndex]:tree[maxIndex - 1]);  
                }  
                maxIndex /= 2;  
            }  
        }  
        return mData;  
    }  
  
      
    public static void main(String[] args) 
    {    
        int array[] = { 38, 62, 35, 77, 55, 14, 35, 98 };  
        TreeSelectionSort(array);  
          
        for (int i = 0; i < array.length; i++) {  
            System.out.print(array[i] + " ");  
        }  
        System.out.println("\n");  
    } 

}
