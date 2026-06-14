public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str="My name is mohan";
        String [] words=str.split(" ");
        for(int i=0;i<words.length;i++){
            String s=words[i];
            char [] arr=s.toCharArray();
            int left=0;
            int right=arr.length-1;
            while(left<right){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            words[i]=new String(arr);
    }
    System.out.println(String.join(" ",words));
    }
}
    

//output
// yM eman si nahom

