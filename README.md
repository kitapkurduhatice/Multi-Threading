# Multi-Threading
Multithreading 1'den 100.000'e kadarki sayılar arasında maksimum bölen sayisi olan sayiyi ve bolen sayisini bulmak istiyoruz. 
Bunu 4 paralel proseste yapalım. Bunun için 4 thread oluşturulacak.Her bir thread'e mainde name set edilecek. 
(Örnek: 
    Thread t1=new Thread(); 
    t1.setName("1"); şeklinde.)  
Her bir thread ilgili aralıktaki maksimum bölen sayisi olan sayiyi ve bolen sayisini kendi isminde bir txt dosyasına yazdıracak.
(Örnek: 
    1.thread 1-25000 
    2.thread 25000-50000 
    3.thread 50000-75000 
    4.thread 75000-100000 aralığında)  
Main her 2 sn'de bir dosyaları kontrol edecek.
( Örnek:Thread.sleep(2000); ) 
Tüm dosyalar oluşmuşsa o dosyalardan verileri okuyup 1-100000 arasında maksimum bölen sayısı olan sayıyı ve bölen sayısını yazdıralım.
