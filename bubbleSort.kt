import java.util.*     
fun main(args: Array<String>){
    var t:Int                  
    val from = 0                
    val to = 100               
    var interchange=true        
    var random = Random()
    var array  = IntArray(10) { random.nextInt(to - from) +  from }  
    println("Karisik random sayilar dizisi: ")
    for(i in 0..9)
    {
        print(" "+array[i])   
    }
    while(interchange)  
    {
        for (i in 0..8)   
        {
            interchange=false;
            for(j in 1..(9-i)) {
                if (array[j - 1] > array[j]) {  
                    t = array[j - 1]
                    array[j - 1] = array[j]
                    array[j] = t
                    interchange=true;
                }
            }
        }
    }
    println()
    println("Siralanmis random sayilar dizisi:")
    for(i in 0..9)
    {
        print(" "+array[i])          
    }
}
