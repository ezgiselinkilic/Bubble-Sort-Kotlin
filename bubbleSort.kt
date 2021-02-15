import java.util.*      // Random sınıfını kullanabilmek adına java paketi projeye dahil edildi.
fun main(args: Array<String>){
    var t:Int                   // Takas işleminde kullanılmak üzere t geçici değişkeni oluşturuldu.
    val from = 0                //Random üretilecek sayıların başlangıç değerine 0 atandı.
    val to = 100                //Random üretilecek sayıların bitiş değerine 100 atandı.
    var interchange=true        // Üretilen sayıların sıralı olma ihtimalini kontrol eden değişken oluşturuldu ve başlangıç değerine true atandı.
    var random = Random()
    var array  = IntArray(10) { random.nextInt(to - from) +  from }  //Random sınıfı kullanılarak 10 adet sayı üretildi ve bir tam sayı dizisi oluşturuldu.
    println("Karisik random sayilar dizisi: ")
    for(i in 0..9)
    {
        print(" "+array[i])   // Rastgele ürettiğimiz karışık haldeki sayılar ekrana yazdırıldı.
    }
    while(interchange)  // while döngüsü ile yer değiştirme işlemine gerek kalınmayacağına kadar döngünün devam etmesi sağlandı.
    {
        for (i in 0..8)   //Bubble sort algoritmasında sıralama işlemi en fazla eleman sayısının bir eksiği kadar sayıdaki turda tamamlanacağı için toplam adım sayısını gösteren dış döngü; eleman sayısının bir eksiği kadar döndürüldü.
        {
            interchange=false; // Eger döngü içerisine girilmişse dizi hala sıralı değil demektir ve takas işlemini kontrol eden  değişkenimizin değeri false olur.
            for(j in 1..(9-i)) { //İçteki döngü  dıştaki döngü değişkeni kadar eksik dönmektedir. Çünkü n. geçişte sondaki n eleman zaten sıralı olacak ve kontrol edilmesine gerek olmayacaktır.
                if (array[j - 1] > array[j]) {      // Takas işleminde ise her iterasyonda sol ve sağ kontrolü yapılarak küçük olan sayı sol tarafa yerleştirildi.
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
        print(" "+array[i])            // Dizinin sıralanmış olarak son hali ekrana yazdırıldı.
    }
}
