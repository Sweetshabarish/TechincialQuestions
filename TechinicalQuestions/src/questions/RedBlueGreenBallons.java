package questions;


/*
 * 
 * 3. Given an mixed array of Red, Blue and Green colour balloons, arrange all the same colour balloons together by maintaining the order of colours based on first occurrence in the input array.
Input: arr[] = {R, G, B, G, B, G, R}
Output:{R, R, G, G, G, B, B}

Input: arr[] = {B, G, B, R, G, R, B, G, R, R, B}
Output: {B, B, B, B, G, G, G, R, R, R, R}


 */
public class RedBlueGreenBallons {

    static void print(int count [],int occurence [],int characterasiigendnumber,char charray[]){// this method will print the value of sending value from the user
     int    jindex=0 ;
        while (true){
            if(occurence[jindex]==characterasiigendnumber){
                for(int i=0;i<count[jindex];i++)
                    System.out.print(charray[jindex]+" ");
                break;
            }
            jindex++;
        }
    }
    static int count(char alphabhet,char arr[]){// this method is staic becuase to avoid the creating object,accesing the values directly,this method will count character value 
        int count =0;//assigin count value as zero to increment in further
        for(int index=0;index< arr.length;index++)

            if(arr[index]==alphabhet)// if the send character is equal to the arrays(in built values) means
                count++;//count will get incremented

        return count;
    }
    public static void main (String []args){
       char array[]={'b','g','b','r','g','r','b','g','r','r','b'};//assigen input value from the user 

        int count[]={0,0,0};//asigging the count value as 0 ,bec  to increment in the further 

                 //r,g,b
        int occurence[]={-1,-1,-1};//occurence is used to find how many time the same character repeated in array
        char charray[]={'r','g','b'};
        count[0]=count('b',array);//assiging count 0th index as first element from the array
        count[1]=count('g',array);//assiging count 1th index as second element from the array
        count[2]=count('b',array);//assiging count 2th index as 3rd element from the array
// why i took ,3 elements only bec , the colours are r,g,b 3 only

        int jindex=0;
        for(int index=0;index< array.length;index++){
            if(array[index]=='r')//if the array of index present the given character,occureance will get increments.
                if(occurence[0]==-1){
                    occurence[0]=jindex;
                jindex++;}
            if(array[index]=='g')//if the array of index present the given character,occureance will get increments.
                if(occurence[1]==-1){
                    occurence[1]=jindex;
                jindex++;}
            if(array[index]=='b')//if the array of index present the given character,occureance will get increments.
                if(occurence[2]==-1){
                    occurence[2]=jindex;
                jindex++;}
        }


        print(count ,occurence,0,charray);
        print(count ,occurence,1,charray);
        print(count ,occurence,2,charray);
    }
}