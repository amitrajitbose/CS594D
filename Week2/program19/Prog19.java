//PowerSet of an array
class Combi{
	void gen(){
		int set_size=3;
		long pow_set_size = (long)Math.pow(2, set_size);
        int counter, j;
        int set[]={1,2,3};
     
        /*Run from counter 000..0 to
        111..1*/
        for(counter = 0; counter < 
                pow_set_size; counter++)
        {
            for(j = 0; j < set_size; j++)
            {
                /* Check if jth bit in the 
                counter is set If set then 
                pront jth element from set */
                if((counter & (1 << j)) > 0)
                    System.out.print(set[j]);
            }
             
            System.out.println();
        }	
    }
}
class Prog19
{
	public static void main(String args[]){
		Combi ob=new Combi();
		ob.gen();
	}
}

/*
OUTPUT:

1
2
12
3
13
23
123
*/