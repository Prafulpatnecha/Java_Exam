


public class largest_find_array {

    public static void main(String args[])
    {
        int a[] = {1,20,50,2,30,4};
        int value=0;
        for(int i=0; i< a.length;i++)
        {
            if(a[i]>value)
            {
                value=a[i];
            }
        }
        System.out.println(value);
    }

}
//WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.