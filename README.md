# JPA Query Methods - JPA Sorgu Metotları
Veriler üzerinde çalışırken, kullanıcılara, belirli kriterlere göre veri sunmak gerekebilir. Spring JPA, bu kriterler için çeşitli metotlar içerir. Bu metotlardan bazılarının kullanımı için İntellij Idea IDE’si kullanılarak oluşturulmuş bir proje üzerinden örneklendirilecektir.
- Proje katmanlı bir mimari olup, test için Postman kullanılmıştır.
- Projenin Katmanlı bir mimari olup, entities, repositories, services, restcontrollers ve utils adlı katmanları içermektedir.
- Öncelikle Customer adlı bir entity oluşturup, sonra repository sınıfı oluşturularak veritabanı ile ilişki kuracak metotlar burada tanımlanır. Sonra servis eklenip, uygulamaya yaptırmak istediğimiz işlerin metotları tanımlanır. Son olarak da kullanıcı ile uygulama arasında köprü görevi gören, servislerin tetiklenmesini sağlayan restcontroller sınıfı eklenip ilgili metotlar eklenir.
- Repository katmanında metotlar tanımlanırken, manuel olarak yazmak yerine, ide içerisinde bu metotları barındıran Jpa Designer(Buddy) kullanılarak, otomatik oluşturulması sağlanır.
<p>
  <img src="query method images/001_jpa designer.PNG" height=400 width=600 />
</p>
* Metotlar:

* **Equals Metodu:** Veriler içerisinde, belirtilen bir değere eşit verilerin listelenmesini sağlayan metottur. Bu metot için Entity nesnemizin userName alanı kullanılmıştır.Repository katmanında metodu eklemek için sırasıyla aşağıdaki işlemler yapılır.

1- Jpa Designer penceresinde, Find Collection çift tıklanır açılan pencerede “+” butonu ya da Add query condition tıklanır.
  <p>
    <img src="query method images/002_create methot.PNG" height=400 width=600 />
  </p>
  
2- Açılan pencerede attribute kısmında … nokta tıklanarak işlem yapmak istediğimiz alan seçilir.
  <p>
    <img src="query method images/003_attribute.PNG" height=400 width=600 />
  </p>
3- Condition alanından, ilgili metot seçilir.
  <p>
    <img src="query method images/004_ add condition equals.PNG" height=400 width=600 />
  </p>
4- Son olarak da, aranmasını istediğimiz değerin, küçük büyük harf duyarlı olmasını istemiyorsak Ignor Case seçeneği işaretlenir. İlgili metot görseldeki gibi eklenmiş olur.
  <p>
    <img src="query method images/005_equals method repository.png" height=400 width=600 />
  </p>

- Servis katmanında, repository sınıfında oluşturduğumuz metotlar kullanılarak, yapılmasını istediğimiz işleri belirtiriz.
  <p>
    <img src="query method images/006_equals method service.png" height=600 width=600 />
  </p>
- Kullanıcıya erişim sağlaması için restcontrollers katmanından servis katmanından ilgili metot çağırılır.
  <p>
    <img src="query method images/007_equals method controller.png" height=500 width=600 />
  </p>
- Görselde belirtildiği şekilde servis Postmande çalıştırılarak, istenilen verilerin listelenmesi sağlanır.
  <p>
    <img src="query method images/008_equals method postman.png" height=500 width=600 />
  </p>
