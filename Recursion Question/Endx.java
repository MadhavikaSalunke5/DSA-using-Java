public class Endx {
  public static void Print(String str,int idx,int count,String newString){
    if(idx==str.length()){
      for(int i=0;i<count;i++){
        newString+='x';
      }
      System.out.println(newString);
      return;
    }
    char currChar=str.charAt(idx);
    if(currChar=='x'){
      count++;
      Print(str,idx+1,count,newString);
    }else{
      newString+=currChar;
      Print(str,idx+1,count,newString);
    }
  }
  public static void main(String[] args) {
      String str="axbcxxd";
      Print(str,0,0,"");
  }
  
}
