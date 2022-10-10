# homework-2

## Ödev 1 

Lifecyle Nedir? Nasıl yönetiriz? Ne gibi problemler olur ve nasıl kaçarız?

## Ödev 2

Derste birlikte yapılan Sign ve Sign Up sayfaların tasarımlarının yapılması. Bu iki tasarımı İki Activity olarak yapılacak ve Sign up butuna basıldığında Sign Up ekranı gelmesi beklenmekte.

# Android LifeCycle nedir ?
Android işletim sistemi ile çalışan telefonlarda ekranda o anda bize gözüken sayfa bir "Activity" dir. LifeCycle'ın ne olduğunu anlamadan önce Activity nedir onu öğrenelim. Android'de Activity, bir uygulamada ki ekrandır. Bilgisayarlarımızdaki herhangi bir uygulamanın tek bir penceresine benzerler. Bir Android uygulaması, bir veya daha fazla ekran yani Activity'den oluşur. Android Activity Lifecycle, android.app. Activity class'ına ait 7 method() ile kontrol edilir. Android Activity, ContextThemeWrapper class'ının alt class'ıdır.
## Activity life-cycle callbacks

| Metot | Anlamı |
|--|--|
| onCreate() | Activity ilk oluşturulduğunda çağrılır. |
| onStart()  | Activity kullanıcı tarafından görünür hale geldiğinde çağrılır. |
| onResume()  | Activity kullanıcı ekran ile etkileşimde iken çağrılır. |
| onPause()   | Activity kullanıcı tarafından arka plana atıldığında ekranda görünmüyo iken çağrılır. |
| onStop()    | Activity etkinlik artık kullanıcı tarafından görüntülenmiyor iken çağrılır. |
| onRestart()  | Activity faaliyeti durdurulduktan sonra, tekrar başlamadan önce çağrılır. |
| onDestroy()  | Activity yok edilmeden önce çağrılır. |


##  <> Android Life Cycle gösterimi - - -

![Android Life Cycle](https://static.javatpoint.com/images/androidimages/Android-Activity-Lifecycle.png)



### Neden Android Life Cycle bilmeliyiz ?

--> Çünkü eğer performanslı bir ürün ortaya koyacak ve ürünün sağlıklı çalışmasını istiyorsak ciddi mana da yardım olacaktır. Bu gibi durumlara birkaç örnek olarak şunları verebiliriz : 


- Uygulamamız çalışırken telefona arama geldiğinde ya da uygulamamız üzerine yeni bir uygulama açıldığında bizim uygulama, düzgün çalışmaması veya performans kaybı yaşanması.
- Telefondaki diğer uygulamaların arka planda Ram belleğinde yer tutması (cihazlarda Ram kapasitesi değişkenlik gösterir )ve bunun sonucunda eğer Ram bellek yönetimi düzgün yapılmaz ise yazılımsal sorunların ortaya çıkması.
- Uygulama içinde belli birkaç işlem yapıp kullanıcı çıkış yaptığında tekrar girmek istemesi durumda son bıraktığı yerde durmaması.
- Mesela Kullanıcı telefonu yatay ya da dikey konuma çevirdiğinde kaydettiği, yaptığı işlemleri kaybetmesi.

--> Bu gibi problemler ve ANR(application not responding) sorunların üstesinden gelebilmemiz için Activity’lerin çalışma prensibini çok iyi anlamamız gerekir.

# Sign in & Sign Up App

<p float="left">
  <img src="https://github.com/atakanUludag0497/patikaDev_Android_Kotlin_BootCamp/blob/main/patikaDev_Android_Kotlin_Bootcamp_projects/LogInApp/s1.jpg" width="200" height="400"/>
  <img src="https://github.com/atakanUludag0497/patikaDev_Android_Kotlin_BootCamp/blob/main/patikaDev_Android_Kotlin_Bootcamp_projects/LogInApp/s2.jpg" width="200" height="400"/>
</p>
