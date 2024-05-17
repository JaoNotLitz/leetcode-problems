class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(120));;
    }
    public static int reverse(int x) {
        int sign=1;
        if (x<1) {
            x*=-1;
            sign=-1;
        }
        int input=x;

        String temp123 = String.valueOf(input);
        String[] temp321 = temp123.split("");
        int intSplitted;
        String refatoredStrin="";
        for (int i = temp321.length-1 ; i>-1;i--){
            refatoredStrin += temp321[i];
        }
        intSplitted=Integer.parseInt(refatoredStrin);
        return(intSplitted*sign);
            

       /* for (int i = 0;i<temp321.length;i++){
            intSplitted[i]=Integer.parseInt(temp321[i]);
        }*/ 

    }
}