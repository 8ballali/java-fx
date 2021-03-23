/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagus;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private WebView wvSemua;
    @FXML
    private Button btnDemografi;
    @FXML
    private Button btnKuliner;
    @FXML
    private Button btnBudaya;
    @FXML
    private Button btnWisata;
    @FXML
    private Button btnSenjata;
    @FXML
    private Button btnPakaian;
    @FXML
    private Button btnExit;
    @FXML
    private Button btnAbout;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        wvSemua.getEngine().loadContent("<p><strong>Banten</strong>&nbsp;(Pegon: بَنْتٚنْ）adalah sebuah&nbsp;provinsi&nbsp;di Tatar Pasundan, serta wilayah paling barat di&nbsp;Pulau Jawa,&nbsp;Indonesia. Provinsi ini pernah menjadi bagian dari Provinsi&nbsp;Jawa Barat, namun menjadi wilayah pemekaran sejak tahun&nbsp;2000, dengan keputusan&nbsp;Undang-Undang&nbsp;Nomor 23 Tahun 2000. Pusat pemerintahannya berada di&nbsp;Kota Serang.</p>\n"
                + "<h2>Geografis</h2>\n"
                + "<p>Wilayah Banten terletak di antara 5&ordm;7'50\"-7&ordm;1'11\"&nbsp;Lintang Selatan&nbsp;dan 105&ordm;1'11\"-106&ordm;7'12\"&nbsp;Bujur Timur, berdasarkan Undang-Undang Republik Indonesia Nomor 23 tahun&nbsp;2000&nbsp;luas wilayah Banten adalah 9.160,70 km&sup2;. Provinsi Banten terdiri dari 4&nbsp;kota, 4&nbsp;kabupaten, 154&nbsp;kecamatan, 262&nbsp;kelurahan, dan 1.273&nbsp;desa.</p>\n"
                + "<p>Wilayah laut Banten merupakan salah satu jalur laut potensial, Selat Sunda merupakan salah satu jalur lalu lintas laut yang strategis karena dapat dilalui kapal besar yang menghubungkan&nbsp;Australia&nbsp;dan&nbsp;Selandia Baru&nbsp;dengan kawasan&nbsp;Asia Tenggara&nbsp;misalnya&nbsp;Thailand,&nbsp;Malaysia, dan&nbsp;Singapura. Di samping itu Banten merupakan jalur penghubung antara&nbsp;Jawa&nbsp;dan&nbsp;Sumatra. Bila dikaitkan posisi geografis, dan pemerintahan maka wilayah Banten terutama daerah Tangerang raya (Kota Tangerang,&nbsp;Kabupaten Tangerang, dan&nbsp;Kota Tangerang Selatan) merupakan wilayah penyangga bagi Jakarta. Secara ekonomi wilayah Banten memiliki banyak&nbsp;industri. Wilayah Provinsi Banten juga memiliki beberapa&nbsp;pelabuhan&nbsp;laut yang dikembangkan sebagai antisipasi untuk menampung kelebihan kapasitas dari pelabuhan laut di Jakarta, dan ditujukan untuk menjadi pelabuhan alternatif selain Singapura.</p>\n"
                + "<h3>Batas wilayah</h3>\n"
                + "<table>\n"
                + "<tbody>\n"
                + "<tr>\n"
                + "<td bgcolor=\"#f2f2f2\">Utara</td>\n"
                + "<td>Laut Jawa</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td bgcolor=\"#f2f2f2\">Selatan</td>\n"
                + "<td>Samudera Indonesia</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td bgcolor=\"#f2f2f2\">Barat</td>\n"
                + "<td>Selat Sunda</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td bgcolor=\"#f2f2f2\">Timur</td>\n"
                + "<td>Daerah Khusus Ibukota Jakarta&nbsp;dan&nbsp;Jawa Barat</td>\n"
                + "</tr>\n"
                + "</tbody>\n"
                + "</table>\n"
                + "<h3>Topografi</h3>\n"
                + "<p>Kondisi topografi Banten adalah sebagai berikut:</p>\n"
                + "<ul>\n"
                + "<li>Wilayah datar (kemiringan 0-2&nbsp;%) seluas 574.090 hektare</li>\n"
                + "<li>Wilayah bergelombang (kemiringan 2-15%) seluas 186.320 hektare</li>\n"
                + "<li>Wilayah curam (kemiringan 15-40%) seluas 118.470,50 hektare</li>\n"
                + "</ul>\n"
                + "<p>Kondisi penggunaan lahan yang perlu dicermati adalah menurunnya wilayah&nbsp;hutan&nbsp;dari 233.629,77 hektare pada tahun 2004 menjadi 213.629,77 hektare.</p>");
    }

    @FXML
    private void handleBtnDemografiAction(ActionEvent event) {
        wvSemua.getEngine().loadContent("<p><strong>Banten</strong>&nbsp;(Pegon: بَنْتٚنْ）adalah sebuah&nbsp;provinsi&nbsp;di Tatar Pasundan, serta wilayah paling barat di&nbsp;Pulau Jawa,&nbsp;Indonesia. Provinsi ini pernah menjadi bagian dari Provinsi&nbsp;Jawa Barat, namun menjadi wilayah pemekaran sejak tahun&nbsp;2000, dengan keputusan&nbsp;Undang-Undang&nbsp;Nomor 23 Tahun 2000. Pusat pemerintahannya berada di&nbsp;Kota Serang.</p>\n"
                + "<h2>Geografis</h2>\n"
                + "<p>Wilayah Banten terletak di antara 5&ordm;7'50\"-7&ordm;1'11\"&nbsp;Lintang Selatan&nbsp;dan 105&ordm;1'11\"-106&ordm;7'12\"&nbsp;Bujur Timur, berdasarkan Undang-Undang Republik Indonesia Nomor 23 tahun&nbsp;2000&nbsp;luas wilayah Banten adalah 9.160,70 km&sup2;. Provinsi Banten terdiri dari 4&nbsp;kota, 4&nbsp;kabupaten, 154&nbsp;kecamatan, 262&nbsp;kelurahan, dan 1.273&nbsp;desa.</p>\n"
                + "<p>Wilayah laut Banten merupakan salah satu jalur laut potensial, Selat Sunda merupakan salah satu jalur lalu lintas laut yang strategis karena dapat dilalui kapal besar yang menghubungkan&nbsp;Australia&nbsp;dan&nbsp;Selandia Baru&nbsp;dengan kawasan&nbsp;Asia Tenggara&nbsp;misalnya&nbsp;Thailand,&nbsp;Malaysia, dan&nbsp;Singapura. Di samping itu Banten merupakan jalur penghubung antara&nbsp;Jawa&nbsp;dan&nbsp;Sumatra. Bila dikaitkan posisi geografis, dan pemerintahan maka wilayah Banten terutama daerah Tangerang raya (Kota Tangerang,&nbsp;Kabupaten Tangerang, dan&nbsp;Kota Tangerang Selatan) merupakan wilayah penyangga bagi Jakarta. Secara ekonomi wilayah Banten memiliki banyak&nbsp;industri. Wilayah Provinsi Banten juga memiliki beberapa&nbsp;pelabuhan&nbsp;laut yang dikembangkan sebagai antisipasi untuk menampung kelebihan kapasitas dari pelabuhan laut di Jakarta, dan ditujukan untuk menjadi pelabuhan alternatif selain Singapura.</p>\n"
                + "<h3>Batas wilayah</h3>\n"
                + "<table>\n"
                + "<tbody>\n"
                + "<tr>\n"
                + "<td bgcolor=\"#f2f2f2\">Utara</td>\n"
                + "<td>Laut Jawa</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td bgcolor=\"#f2f2f2\">Selatan</td>\n"
                + "<td>Samudera Indonesia</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td bgcolor=\"#f2f2f2\">Barat</td>\n"
                + "<td>Selat Sunda</td>\n"
                + "</tr>\n"
                + "<tr>\n"
                + "<td bgcolor=\"#f2f2f2\">Timur</td>\n"
                + "<td>Daerah Khusus Ibukota Jakarta&nbsp;dan&nbsp;Jawa Barat</td>\n"
                + "</tr>\n"
                + "</tbody>\n"
                + "</table>\n"
                + "<h3>Topografi</h3>\n"
                + "<p>Kondisi topografi Banten adalah sebagai berikut:</p>\n"
                + "<ul>\n"
                + "<li>Wilayah datar (kemiringan 0-2&nbsp;%) seluas 574.090 hektare</li>\n"
                + "<li>Wilayah bergelombang (kemiringan 2-15%) seluas 186.320 hektare</li>\n"
                + "<li>Wilayah curam (kemiringan 15-40%) seluas 118.470,50 hektare</li>\n"
                + "</ul>\n"
                + "<p>Kondisi penggunaan lahan yang perlu dicermati adalah menurunnya wilayah&nbsp;hutan&nbsp;dari 233.629,77 hektare pada tahun 2004 menjadi 213.629,77 hektare.</p>");
    }

    @FXML
    private void handleBtnKulinerAction(ActionEvent event) {
        wvSemua.getEngine().loadContent("<div id=\"page\" class=\"single\">\n"
                + "<article class=\"article\">\n"
                + "<div id=\"content_box\">\n"
                + "<div id=\"post-3169\" class=\"g post post-3169 type-post status-publish format-standard hentry category-kuliner tag-banten tag-kuliner-banten tag-makanan-khas tag-oleh-oleh\">\n"
                + "<div class=\"single_post\">\n"
                + "<div class=\"post-single-content box mark-links entry-content\">\n"
                + "<div class=\"thecontent\">\n"
                + "<h2><strong>Rabeg</strong></h2>\n"
                + "<div id=\"attachment_3664\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3664\" src=\"http://localhost/tugas/mak1.jpeg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"330\" />\n"
                + "<p id=\"caption-attachment-3664\" class=\"wp-caption-text\">catatanbundakaka.wordpress.com</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Rabeg bisa dibilang sebagai menu Arabnya orang Banten. Rabeg memang mengadaptasid ari makanan dari Arab karena memiliki rasa yang pedas namun penuh akan rasa rempah khas Indonesia di dalamnya.</p>\n"
                + "<p style=\"text-align: justify;\">     Rabeg menggunakan bahan olahan kambing mulai dari dagingnya hingga jeroannya dimasak dengan berbagai bumbu khususnya cabai dan jahe untuk mendapatkan sensasi pedasnya. Bahan olahan kambing tersebut dimasak dalam waktuyang lama hingga bisa menghilangkan bau kambing namun tetap memiliki tekstur yang empuk dan juga bumbu yang meresap sampai kedalamnya.</p>\n"
                + "<p style=\"text-align: justify;\">     Rabeg mulai banyak ditemukan di pinggir jalan kota Banten sehingga tak sulit untuk menemukannya. Adapun tingkat kepedasannya bisa dipilih sesuai dengan seleranya. Pastinya rabeg akan membuat lidah anda bergoyang dan sensasi pedasnya membuat ketagihan.</p>\n"
                + "<p style=\"text-align: justify;\">     Makanan ini cocok untuk dikonsumsi bersama dengan nasi khas Arab juga yakni nasi kebuli yang juga menggunakan olahan kambing untuk membuatnya.</p>\n"
                + "<h2><strong>Sate Bandeng</strong></h2>\n"
                + "<div id=\"attachment_3665\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3665\" src=\"http://localhost/tugas/mak2.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"\" width=\"733\" height=\"475\" />\n"
                + "<p id=\"caption-attachment-3665\" class=\"wp-caption-text\">sajiansedap.grid.id</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Sate ayam? Biasa. Sate kambing? Biasa. Sate bandeng? Memang ada? Datang saja ke Banten. Makanan khas Banten yang harus dan wajib dicoba saat berkunjung kesana adalah sate bandeng.</p>\n"
                + "<p style=\"text-align: justify;\">     Sate bandeng mempunyai rasa yang jauh berbeda dengan sate ayam maupun sate kambing karena mulai dari proses pembakarannya sudah melewati proses yang panjang sehingga ketika disantap yang adalah rasa nagih dan nagih untuk bisa mencicipinya kembali.</p>\n"
                + "<p style=\"text-align: justify;\">     Bandeng memang banyak ditemukan di wilayah Banten khususnya serang. Oleh karena itulah asyarakat memanfaatkannya untuk bisa disate.</p>\n"
                + "<p>     Meskipun banyak yang heran mengapa tidak digoreng atau dibakar saja akan tetapi nyatanya sate bandeng lebih bisa menarik pengunjung untuk mencicipinya.</p>\n"
                + "<p style=\"text-align: justify;\">     Cara pembuatannya pertama dengan memilih bandeng sesuai dengan usia yang layak untuk dimakan. Kemudian daging ikan disisik dan dipukul hingga remuk tulang-tulangnya.</p>\n"
                + "<p style=\"text-align: justify;\">     Setelah hancur kemudian daging ikan diberi bumbu rempah khas Banten yang terkenal pedas dan manis. Barulah kemudian dibentuk kemudian ditusukkan ke bambu. Langkah selanjutnya tentu saja membakarnya layaknya sate lainnya.</p>\n"
                + "<h2><strong>Sambel Burog</strong></h2>\n"
                + "<div id=\"attachment_3666\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3666\" src=\"http://localhost/tugas/mak3.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"460\" />\n"
                + "<p id=\"caption-attachment-3666\" class=\"wp-caption-text\">rasamasa youtube</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Sambel burog memiliki nama yang unik layaknya kendaraan yang digunakan oleh nabi Muhammad saat berisra’ mi’raj. Memang sambel ini banyak ditemukan ketika musim haji sebagai suguhan hidangan yang diberikan pada orang yang sambang ke rumah orang yang baru pulang haji.</p>\n"
                + "<p style=\"text-align: justify;\">     Sambel burog begitu terkenal di Banten karena rasanya yang unik dan tidak bisa ditemukan diwilayah lainnya. Sambel burog berbahan dasar olahan kulit melinjo atau kulit tangkil yang dicampurkan dengan bawang putih, bawang merah, kemiri, dan daun salam.</p>\n"
                + "<p style=\"text-align: justify;\">     Rasanya/ siap-siap untuk dibuat keringetan karena pedasnya. Sambel ini seirng disuguhkan bersama dengan irisan mangga muda atau jambu muda layaknya rujak manis.</p>\n"
                + "<h2><strong>Gerem Asem</strong></h2>\n"
                + "<div id=\"attachment_3667\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3667\" src=\"http://localhost/tugas/mak4.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"\" width=\"733\" height=\"788\" />\n"
                + "<p id=\"caption-attachment-3667\" class=\"wp-caption-text\">tomojikan.com</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Suka pedas? Cobalah tantang makanan khas Banten yang satu ini. Gerem asem merupakan olahan daging ayam atau daging bebek yang telah dibalur dengan olahan rempah yang kuat. Penyajiannya adalah dengan membakar ayamnya terlebih dahulu kemudian disiram dengan kuahnya.</p>\n"
                + "<p style=\"text-align: justify;\">     Rasa pedas menjadi ciri khas dari makanan ini bahkan bisa membuat lidah tak berhenti bergoyang dan kepala tak berhenti berkeringat. Rasa daging ayamnya begitu nikmat karena dimasak dengan kuahnya selama beberapa jam sebelum kemudian dibakar saat penyajiannya.</p>\n"
                + "<p style=\"text-align: justify;\">     Menu ini seirng disajikan pada perayaan atau syukuran besar. Meskipun paling banyak menggunakan daging ayam dan daging bebek akan tetapi tak jarang ditemukan gerem asem yang terbuat dari ikan laut.</p>\n"
                + "<h2><strong>Pecak Bandeng</strong></h2>\n"
                + "<div id=\"attachment_3668\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3668\" src=\"http://localhost/tugas/mak5.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"656\" />\n"
                + "<p id=\"caption-attachment-3668\" class=\"wp-caption-text\">ideresepmasak.com</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Menu pecak bandeng umumnya dibuat untuk para petani yang berada di sawah sebagai bekal makan siang. Namun semakin lama makanan ini mulai banyak disukai baik oleh masyarakat Banten maupun oleh pendatang sata mengunjungi kota Banten.</p>\n"
                + "<p style=\"text-align: justify;\">     Makanan khas Banten ini memiliki penampilan yang sederhana karena memang terdiri dari dua bahan saja yakni pecak dan bandeng. Pecak merupakan nama sambal yang dibuat sangat pedas dengan irisan jeruk nipis. Sedangkan bandeng digoreng sampai kering serta dibumbui dengan bumbu asinan khas Banten.</p>\n"
                + "<p style=\"text-align: justify;\">     Setelah itu barulah sambal diletakkan diatas bandeng dan dimakan bersama dengan nasi putih yang panas. Menu ini banyak ditawarkan diberbagai rumah makan yang mengusung konsep persawahan karena kenikmatan santapan tersebut berada pada hilir angin di tengah sawah.</p>\n"
                + "<h2><strong>Gecom</strong></h2>\n"
                + "<div id=\"attachment_3669\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3669\" src=\"http://localhost/tugas/mak6.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"433\" />\n"
                + "<p id=\"caption-attachment-3669\" class=\"wp-caption-text\">makananoleholeh.com</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Gecom memang terdengar sedikit aneh akan tetapi jika mengetahuinya maka akan membuat lidah kembali ingin mencicipinya. Gecom merupakan singkatan dari toge dan oncom. Makanan khas Banten ini tergolong unik karena cara memasaknya menggunakan wajan datar yang biasa digunakan untuk menggoreng martabak.</p>\n"
                + "<p style=\"text-align: justify;\">     Selain itu dari segi rasa, geco mendapat predikat berasa nusantara karena ciri khas rasa rempah yang kuat. Masakan gecom biasa dihidangkan sebagai pelengkap nasi dan lauk saat makan bersama keluarga.</p>\n"
                + "<h2><strong>Sayur Besan</strong></h2>\n"
                + "<div id=\"attachment_3670\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3670\" src=\"http://localhost/tugas/mak7.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"372\" />\n"
                + "<p id=\"caption-attachment-3670\" class=\"wp-caption-text\">primarasa.co.id</p>\n"
                + "</div>\n"
                + "<p>     Sayur besan bukan hanya menjadi makanan khas akan tetapi juga menjadi makanan yang sarat akan tradisi asli Banten. Makanan ini disajikan ketika pernikahan atau proses lamaran. Terdapat empat bahan utama dalam sayur besan yakni trubuk, petai, bihun, dan kentang.</p>\n"
                + "<p style=\"text-align: justify;\">     Adapun tambahan sayur lainnya yang bisa ditambahkan adalah wortel, labu siam, dan udang. Sayur besan dianggap simbol pernikahan dan hubungan erat persaudaraan yang terjalin pasca pernikahan.</p>\n"
                + "<h2><strong>Balok Menes</strong></h2>\n"
                + "<div id=\"attachment_3671\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3671\" src=\"http://localhost/tugas/mak8.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"547\" />\n"
                + "<p id=\"caption-attachment-3671\" class=\"wp-caption-text\">nurfaizianshori.blogspot.co.id</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Balok menes mempunyai vahan dan tekstur yang sama dengan getuk. Akan tetapi pada balok menes adonan tidak dibuat seperti getuk namun dibuat berbalok-balok dengan warna putihnya.</p>\n"
                + "<p style=\"text-align: justify;\">     Jika pada getuk akan ditemukan parutan kelapa diatasnya maka pada balok menes menggunakan serundeng sebagai topingnya bahkan tak jarang menggunakan bumbu kacang juga.</p>\n"
                + "<p style=\"text-align: justify;\">     Bedanya lagi balok menes tidak semanis getuk. Makanan khas Banten ini sangat cocok untuk digunakan sebagai camilan.</p>\n"
                + "<h2><strong>Nasi Sambal Belut</strong></h2>\n"
                + "<div id=\"attachment_3672\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3672\" src=\"http://localhost/tugas/mak9.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"550\" />\n"
                + "<p id=\"caption-attachment-3672\" class=\"wp-caption-text\">rachmira.blogspot.co.id</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Meskipun terlihat sederhana akan tetapi makanan ini banyak diburu oleh penikmat kuliner yang datang ke Banten. Nasi sambal belut di Banten memiliki rasa yang khas karena dari belutnya sudah dipilih yang memiliki ukuran besar sehingga bisa dirasakan dagingnya yang empuk.</p>\n"
                + "<p style=\"text-align: justify;\">     Belut dari sawah akan dibersihkan dan dipotong-potong menjadi beberapa bagian kecil. Lantas dibalur dengan bumbu rempah yang telah dicampur dengan cabai sehingga terasa pedas. Barulah setlah dibalur belut digoreng hingga kering.</p>\n"
                + "<p style=\"text-align: justify;\">     Setelah matang belut tidak lantas disajikan begitu saja akan tetapi masih akan ditemani sambel tomat atau terasi kemudian dipenyet. Rasanya? Wah tak bisa terbayangkan dengan pedasnya lauk serta panasnya nasi putih.</p>\n"
                + "<h2><strong>Pasung Merah</strong></h2>\n"
                + "<div id=\"attachment_3673\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3673\" src=\"http://localhost/tugas/mak10.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"495\" />\n"
                + "<p id=\"caption-attachment-3673\" class=\"wp-caption-text\">kata.co.id</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Dari namanya terlihat cukup mengerikan dengan kata pasungnya. Padahal hampir tidak ada kaitannya nama pasung dengan rasa yang ada di dalamnya. Kue pasung merupakan makanan khas Banten yang dibuat dari olahan tepung beras, tepung sagu, santan, dan gula merah yang diaduk menjadi sebuah adonan kemudian di masukkan ke daun pisang yang dibentuk seperti contong.</p>\n"
                + "<p style=\"text-align: justify;\">     Keunikan kue ini memang terdapat pada bentuknya yang menyerupai bidang kerucut dan disajikan dengan cara disusun hingga membentuk sebuah lingkaran. Kue ini sering disajikan pada upacara adat atau tasyakuran karena dianggap sebagai makanan kesukaan para dewa.</p>\n"
                + "<h2><strong>Laksa Tangerang</strong></h2>\n"
                + "<div id=\"attachment_3674\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3674\" src=\"http://localhost/tugas/mak11.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"412\" />\n"
                + "<p id=\"caption-attachment-3674\" class=\"wp-caption-text\">dearassignment.blogspot.co.id</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Salah satu kuliner di Banten yang tak boleh ketinggalan adalah laksa tanggerang. Penampilan sajiannya memang sederhana karena hanya dengan mie putih yang disiram dengan kuah sayur kemudian ditaburi dengan suwiran ayam, kacang hijau, dan taburan daun kucai.</p>\n"
                + "<p style=\"text-align: justify;\">     Akan tetapi meskipun mempunyai penampilan yang sederhana akan tetapi dari rasanya tidak akan kalah dengan yang lainnya. Rempah alami pada kuah sayur diserap oleh mie putih sehingga terasa sedang menyantap sajian makanan bintang lima.</p>\n"
                + "<h2><strong>Sate Bebek Cibeber</strong></h2>\n"
                + "<div id=\"attachment_3675\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3675\" src=\"http://localhost/tugas/mak12.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"499\" />\n"
                + "<p id=\"caption-attachment-3675\" class=\"wp-caption-text\">andy4rt.blogspot.co.id</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Sate bebek memang sudah banyak ditemukan di berbagai wilayah di Indonesia akan tetapi pernahakah anda mencoba sajian sate bebek cibeber? Jika belum maka segeralah mencicipinya ketika berkunjung ke Banten. Secara sekilas memang tidak ada perbedaan yang mencolok dari sate bebek ini.</p>\n"
                + "<p style=\"text-align: justify;\">     Akan tetapi jika dilihat prosesnya makan akan ditemukan rasa yang berbeda yakni pada daging bebeknya. Hal ini dikarenakan daging bebek sebelum dibakar terlebih dahulu dibumbui sehingga ketika membakarnya tidak perlu menambahkan kecap atau bumbu lainnya. Rasa dari sate bebek cibeber begitu meresap sampai ke dalam dagingnya.</p>\n"
                + "<p style=\"text-align: justify;\">     Belum lagi dengan bumbu kacangnya yang sudah dicampur dengan berbagai macam bumbu rempah. Untuk mendapatkannya tidaklah sulit karena sudah banyak dijajakan di kota Banten khsusunya di Serang.</p>\n"
                + "<h2><strong>Ketan Bintul</strong></h2>\n"
                + "<div id=\"attachment_3676\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3676\" src=\"http://localhost/tugas/mak13.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"534\" />\n"
                + "<p id=\"caption-attachment-3676\" class=\"wp-caption-text\">limakaki.com</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Satu hidangan yang seirng dijumpai saat Ramadhan adalah ketan bintul khas Banten. Memang tak ada yang berbeda dari ketan ini dari segi proses pembuatannya akan tetapi yang membuatnya berbeda adalah adanya serundeng dicampur dengan kacang yang telah dihaluskan diatasnya.</p>\n"
                + "<p style=\"text-align: justify;\">     Rasa ketan yang gurih dan mengenyangkan dipadukan dengan rasa enak dan legitnya serundeng membuatnya selalu menjadi makanan favorit masyarakat Banten.</p>\n"
                + "<p style=\"text-align: justify;\">     Bahkan konon katanya disetiap berbuka puasa, sultan Banten selalu mewajibkan adanya menu ketan bintul diatas menjanya. Makanan ini sering muncul ketika bulan Ramadhan untuk digunakan sebagai menu pelengkap berbuka puasa.</p>\n"
                + "<h2><strong>Rengginang</strong></h2>\n"
                + "<div id=\"attachment_3677\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3677\" src=\"http://localhost/tugas/mak14.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"411\" />\n"
                + "<p id=\"caption-attachment-3677\" class=\"wp-caption-text\">bantenwisata.com</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Rengginang memang menjadi makanan paling banyak ditemukan diberbagai daerah karenamemang proses pembuatannya yang mudah dan rasanya yang banyak disukai oleh lidah Indonesia. Rengginang juga menjadi makanan khas Banten karena banyak disediakan di pusat oleh-oleh.</p>\n"
                + "<p style=\"text-align: justify;\">     Akan tetapi jangan menganggap rasanya sama dengan wilayah lainnya karena rengginang dari Banten memiliki rasa yang berbeda bahkan lebih enak dan renyah. Sebagaimana diketahui bahwa letak geografis Banten terletak pada kondisi laut yang luas sehingga banyak ditemukan berbagai olahan khas laut.</p>\n"
                + "<p style=\"text-align: justify;\">     Adonan rengginang dari Banten cenderung lebih nikmat karena mempunyai aroma dan rasa ikan yang kuat. Bukan hanya ikan akan tetapi udang, kerang, dan kupang.</p>\n"
                + "<h2><strong>Opak</strong></h2>\n"
                + "<div id=\"attachment_3678\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3678\" src=\"http://localhost/tugas/mak15.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"579\" />\n"
                + "<p id=\"caption-attachment-3678\" class=\"wp-caption-text\">mekarwangiberdaya.com</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Tidak jauh dari rengginang, opak yang berasal dari Banten juga memiliki ciri khas tersendiri yang membedakannya dengan opak dari daera lainnya. Opak khas Banten memiliki perpaduan rasa dengan olahan hasil laut sehingga lebih enak dan gurih rasanya.</p>\n"
                + "<p style=\"text-align: justify;\">     Opak Banten juga terbuat dari dua bahan utama yakni bisa dengan tepung beras ketan atau tepung tapioka. Adonan opak Banten juga dibuat lebih lembut dan halus sehingga tidak memiliki tekstur kasar diatasnya ketika digoreng.</p>\n"
                + "<p style=\"text-align: justify;\">     Tipis, kering, renyah, tahan lama, serta nikmat itulah ungkapan yang bisa menggambarkan rasa opak Banten. Tentunya sangat cocok untuk menemani makan anda atau juga dibuat camilan bersama keluarga.</p>\n"
                + "<h2><strong>Kue Jojorong</strong></h2>\n"
                + "<div id=\"attachment_3679\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3679\" src=\"http://localhost/tugas/mak16.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"513\" />\n"
                + "<p id=\"caption-attachment-3679\" class=\"wp-caption-text\">Twitter/@GOVIN_evan</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Ingin menikmati kue dengan ciri khas lumer dan lembut di mulut diiringi rasa gurih nan manis? Cobalah kue jojorong makanan khas Banten. Makanan ini banyak dijual di pasar tradisional karena banyak digunakan sebagai sarapan bagi para pekerja yang ada di wilayah tersebut.</p>\n"
                + "<p style=\"text-align: justify;\">     Kue jojorong berbentuk seperti bubur sumsum berwarna putih dengan tekstur lembut dan lumer. Rasa asin gurih yang terdapat pada bubur tersebut dipadukan dengan gula merah cair sehingga mendapatkan rasa manis alami.</p>\n"
                + "<p style=\"text-align: justify;\">     Cara penyajiannya juga unik yakni menggunakan daun pisang sehingga aromanya melekat ditambah dengan irisan daun pandan diatasnya. Kue jojorong terbuat dari bahan tepung kanji, tepung beras dan gula merah. Cukup sederhana untuk memperoleh kenikmatan luar biasa bukan?</p>\n"
                + "<h2><strong>Gipang</strong></h2>\n"
                + "<div id=\"attachment_3680\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3680\" src=\"http://localhost/tugas/mak17.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"411\" />\n"
                + "<p id=\"caption-attachment-3680\" class=\"wp-caption-text\">cookpad.com</p>\n"
                + "</div>\n"
                + "<p> </p>\n"
                + "<p> </p>\n"
                + "<p style=\"text-align: justify;\">     Bagi pecinta kuliner nusantara pastinya tidak akan asing dengan namanya kue gipang. Sekilas dari cara membacanya mirip dengan Jepang oleh karena itulah banyak yang menganggap bahwa makanan ini diadaptasi dari Jepang.</p>\n"
                + "<p style=\"text-align: justify;\">     Padahal makanan ini merupakan makanan khas nusantara yang banyak tersebar di wilayahnya khususnya wilayah Jawa. Banten juga memiliki sentral pembuatan gipang dengan rasanya yang berbeda dengan gipang di wilayah lain.</p>\n"
                + "<p style=\"text-align: justify;\">     Adapun untuk cara membuatnya masih sama dengan wilayah lainnya yakni mencampurkan antara beras ketan putih dengan gula cair.</p>\n"
                + "<p style=\"text-align: justify;\">     Bedanya di Banten menggunakan kacang tanah sebagai pelengkapnya sehingga ada tekstur kasar dan berbeda. Meskipun sudah tidak setenar dahulu akan tetapi makanan ini masih tetap eksis khsuusnya di tanah Jawa ketika ada hari raya dan perayaan adat.</p>\n"
                + "<h2><strong>Leumeung</strong></h2>\n"
                + "<div id=\"attachment_3681\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3681\" src=\"http://localhost/tugas/mak18.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"352\" />\n"
                + "<p id=\"caption-attachment-3681\" class=\"wp-caption-text\">foodinbanten.blogspot.co.id</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Terakhir jika anda sedang berkunjung ke Banten Selatan maka akan menemukan kue khas daerah tersebut yang terbuat dari adonan beras kentan dan santan. Uniknya adalah cara memasaknya yang masih menggunakan peralatan tradisional.</p>\n"
                + "<p style=\"text-align: justify;\">     Cara memasak kue ini adalah memasukkan adonan yang telah diberi gula aren atau gula merah ke dalam bambu yang telah dibersihkan. Kemudian bambu tersebut dibakar hingga hangus dan kue yang ada didalamnya matang.</p>\n"
                + "<p style=\"text-align: justify;\">     Umumnya masyarakat akan makan kue ini dengan telor asin sebagai pelengkapnya dikala hujan atau sore hari. Pastinya anda akan menemukan rasa yang gurih, manis, asin, serta kenikmatan aroma bambu yang khas. Inilah yang membuat kue leumeung selalu dicari dan dianggap sebagai makanan khas Banten.</p>\n"
                + "<h2><strong>Nasi Sumsum</strong></h2>\n"
                + "<div id=\"attachment_3682\" class=\"wp-caption aligncenter\"><img class=\"wp-image-3682\" src=\"http://localhost/tugas/mak19.jpg\" sizes=\"(max-width: 733px) 100vw, 733px\"alt=\"makanan khas banten\" width=\"733\" height=\"550\" />\n"
                + "<p id=\"caption-attachment-3682\" class=\"wp-caption-text\">kompasiana.com</p>\n"
                + "</div>\n"
                + "<p style=\"text-align: justify;\">     Nasi sumsum atau juga dikenal sebagai nasi sumsum bakar merupakan makanan khas Banten yang sudah lama dikenal oleh masyarakatnya. Bahkan ceritanya orang yang pertama kali membuatnya adalah orang yang bekerja di pemotongan hewan lantas setiap pulang dia membawa sisa tulang.</p>\n"
                + "<p style=\"text-align: justify;\">     Di tangan istrinya sumsum yang ada dalam tulang tersebut dicampurkan dengan nasi yang kemudian dibungkus daun pisang dan dibakar.</p>\n"
                + "<p style=\"text-align: justify;\">     Tekstur sumsum yang lumer ketika terkena panas akan meresap ke setiap bulir nasi yang ada di dalamnya belum lagi ketika ditambahkan dengan berbagai rempah tentu saja membuat rasanya menjadi luar biasa.</p>\n"
                + "<p style=\"text-align: justify;\">     Rasa nasi yang gurih serta enak membuatnya masih tetap eksis dan banyak dijual di pinggiran jalan kota Banten.</p>\n"
                + "<div class=\"swp_social_panel swp_horizontal_panel swp_flat_fresh swp_default_full_color swp_individual_full_color swp_other_full_color scale-100 scale-\" data-min-width=\"1100\" data-float-color=\"#ffffff\" data-float=\"bottom\" data-float-mobile=\"bottom\" data-transition=\"slide\"> </div>\n"
                + "</div>\n"
                + "</div>\n"
                + "</div>\n"
                + "</div>\n"
                + "</div>\n"
                + "</article>\n"
                + "<aside id=\"sidebar\" class=\"sidebar c-4-12 mts-sidebar-sidebar\">\n"
                + "<div id=\"text-11\" class=\"widget widget_text\"> </div>\n"
                + "</aside>\n"
                + "</div>\n"
                + "<footer id=\"site-footer\">\n"
                + "<div class=\"footer-widgets first-footer-widgets widgets-num-4\"> </div>\n"
                + "</footer>");
    }

    @FXML
    private void handleBtnBudayaAction(ActionEvent event) {
        wvSemua.getEngine().loadContent("<p>1.Kesenian<em> Dogdog Lojor</em></p>\n"
                + "<p><img src=\"http://localhost/tugas/seni1.JPG\" alt=\"10 Kesenian Di Provinsi Banten\" border=\"0\" /></p>\n"
                + "<p>Dogdog merupakan alat musik yang terbuat dari batang kayu bulat, tengahnya diberi rongga, namun kedua ujung ruasnya mempunyai bulatan diameter yang berbeda (&plusmn; 12  15 cm) dengan panjang &plusmn; 90 cm. Pada ujung bulatan yang paling besar ditutup dengan kulit kambing yang telah dikeringkan dan diikat dengan bambu melingkar yang dipaseuk/baji untuk menyetel suara atau bunyi. Suara yang dihasilkan akan berbunyi dog dog dog (dalam telinga orang Sunda). Oleh karena itu alat ini diberi nama Dog Dog. Sedangkan kata lojor berarti lonjong atau lodor yang sepadan dengan kata panjang. Jadi Dogdog Lojor sama artinya dengan Dogdog Panjang.<br />Kesenian ini berkembang di Banten bagian Selatan Kabupaten Lebak, dengan pemain berjumlah 12 orang. Pada awalnya pertunjukan seni Dogdog Lojor ini, dilakukan sebagai pelengkap dalam rangka pelaksanaan upacara adat seperti Seren Taun, sedekah bumi ataupun ruwatan. Oleh karena itu, pertunjukan Dogdog Lojor dilaksanakan secara khidmat. Sejalan dengan perkembangan zaman, pertunjukan Dogdog Lojor dilakukan dengan penuh kegembiraan sehingga berkembang menjadi seni pertunjukan hiburan dan permainan rakyat.</p>\n"
                + "<p>2.Kesenian&nbsp;<em>Buaya Putih</em></p>\n"
                + "<p><img src=\"http://localhost/tugas/senii1.JPG\" alt=\"10 Kesenian Di Provinsi Banten\" border=\"0\" /></p>\n"
                + "\n"
                + "<p>Kesenian tradisional yang berkembang di kampung curugdahu desa kadubeureum kecamatan padarincang kabupatne serang, iringan ngarak buaya putih biasanya dilakukan dalam kegiatan mengirimkan bahan-bahan keperluan hajatan yang menjadi ciri khas daerah setempat, dimana keperluan hajatan ditata sedemikian rupa pada sebatang pohon bambu yang dibentuk rangka mirip seekor buaya, dengan panjang mencapai 8 sampai 10 meter, dengan dihiasi janur kelapa. Buaya putih dimainkan secara keseluruhan oleh 40 orang, dimana 4 orang pemain laki-laki yang bertugas memegang umbul-umbul sebagai pembatas barisan, 2 orang bagian paling depan dan 2 orang lagi sebagai pemegang spanduk, 1 orang sebagai penarik penonton, di belakang 10 orang sebagai penari mojang desa, berdiri sepasang pengantin yang diapit kedua orang tua yang di lengkapi dengan seorang pembawa payung kebesaran. Dibagian tengah terdapat 4 orang sebagai pemikul buaya putih yang harus mampu memainkan buaya putih dengan baik, dibawah kendali seoranag pawang buaya yang bernama ma ijah, tarian buaya putih ini diiringi oleh 14 orang pemain musik rudat, dengan alat yang terdiri dari : Gending paria ria, kemplongan, dan gembrung</p>\n"
                + "<p>3.Kesenian&nbsp;<em>Pantung Bambu</em></p>\n"
                + "<p><img src=\"http://localhost/tugas/senii2.JPG\" alt=\"10 Kesenian Di Provinsi Banten\" border=\"0\" /></p>\n"
                + "<p>Pantung Bambu adalah alat musik tradisional khas masyarakat cilegon yang terbuat dari bambu berdiameter rata-rata 10cm, panjang 80cm, beruas dua dengan lubang di tengah dan berlidah disayat dengan tiga buah senar bernada empat tangga nada. Dalam satu grup pantun bambu dibutuhkan paling sedikit tiga pantun yang terdiri dari pantun melodi gendang tapak, pantun bas gendang dan pantun ritme patingtung. Pada awalnya musik pantun di mainkan disaat-saat melepas lelah setelah para petani berkerja disawah, dengan peralatan bambu sederhana dapat menimbulkan irama yang menghibur. Dalam perkembangannya saat alat musik \"Pantun\" telah di kolaborasi dengan alat musik lainnya seperti musik patingtung, rudat, terbang gede dan sebagainya. Pantun sekarang ini juga digunakan untuk mengiringi lagu dan tarian.</p>\n"
                + "<p>4.Kesenian&nbsp;<em>Terbang Gede</em></p>\n"
                + "<p><img src=\"http://localhost/tugas/senii3.JPG\" alt=\"10 Kesenian Di Provinsi Banten\" border=\"0\" /></p>\n"
                + "\n"
                + "<p>Terbang gede merupakan salah satu kesenian tradisional Banten yang tumbuh dan berkembang pada waktu para penyebar agama islam menyebarkan ajarannya di Banten, oleh karena itu kesenian terbang gede berkembang secara pesat di lingkungan pesantren dan mesjid-mesjid.<br />Kesenian ini disebut terbang gede karena salah satu instrumen musik utamanya adalah terbang besar (gede). Pada awalnya kesenian terbang gede berfungsi sebagai sarana penyebaran agama islam, namun kemudian berkembang sebagai upacara ritual seperti : ngarak panganten, ruwatan rumah, syukuran bayi, hajat bumi, dan juga hiburan.<br />Terbang gede dimainkan oleh beberapa orang biasanya laki-laki yang telah lanjut usia terdiri atas Penabuh terbang gede (besar) , penabuh sela, penabuh pengarak, penabuh kempul, penabuh koneng, yang diiringi dengan sholawatan nabi dengan bahasa Arab ataupun jawa.</em></p>\n");
    }

    @FXML
    private void handleBtnWisataAction(ActionEvent event) {
        wvSemua.getEngine().loadContent("<h3>1. Pantai Anyer</h3>\n"
                + "<p><img src=\"http://localhost/tugas/w1.jpg\" alt=\"Gambar terkait\" /></p>\n"
                + "<p style=\"text-align: justify;\">     Pantai yang merupakan salah satu paling terkenal dan sering dikunjungi oleh para wisatawan ini terletak di Serang, Banten. Tak hanya Pantai Anyer, di Banten juga memiliki sederetan pantai lain yang indah dan sangat pas untuk kamu kunjungi ketika akhir pekan bersama teman maupun keluarga tercinta.</p>\n"
                + "<p style=\"text-align: justify;\">     Jika ingin menginap di sekitaran Pantai Anyer, tak perlu khawatir karena kamu akan dengan sangat mudah menemukan beberapa penginapan murah dengan fasilitas memadai.</p>\n"
                + "<h3>2. Arung Jeram Sungai Ciberang</h3>\n"
                + "<figure id=\"attachment_11837\" class=\"wp-caption aligncenter\"><img class=\"lazy wp-image-11837 lazy-loaded\" src=\"http://localhost/tugas/w2.jpg\" sizes=\"(max-width: 650px) 100vw, 650px\"alt=\"\" width=\"650\" height=\"432\" data-lazy-type=\"image\" data-lazy-src=\"https://blog.reservasi.com/wp-content/uploads/2017/01/arung-jeram-kasembon1.jpg\" data-lazy-srcset=\"https://blog.reservasi.com/wp-content/uploads/2017/01/arung-jeram-kasembon1.jpg 752w, https://blog.reservasi.com/wp-content/uploads/2017/01/arung-jeram-kasembon1-300x199.jpg 300w\" data-lazy-sizes=\"(max-width: 650px) 100vw, 650px\" />\n"
                + "<figcaption class=\"wp-caption-text\">bantenwisata.com</figcaption>\n"
                + "</figure>\n"
                + "<p style=\"text-align: justify;\">     Lokasi arung jeram yang berada di sekitaran Banten ini juga menjadi salah satu tempat wisata yang ramai setiap harinya oleh para pengunjung yang berdatangan dari luar kota Banten. Di sekitar area Arung Jeram Sungai Ciberang ini, memiliki danau yang masih jernih dan sangat asri, serta dikelilingi oleh pohon-pohon dan bukit yang masih hijau.</p>\n"
                + "<p style=\"text-align: justify;\">     Untuk bisa sampai ke tempat ini kamu harus melewati jalan yang tidaklah mudah tentunya, jalanan yang berliku-liku serta terjal yang berada sepanjang jalan menuju arung jeram ini lebih baik kamu tempuh jika menggunakan kendaraan roda dua maupun berjalan kaki.</p>\n"
                + "<h2>3. Masjid Agung Banten</h2>\n"
                + "<figure id=\"attachment_11838\" class=\"wp-caption aligncenter\"><img class=\"lazy wp-image-11838 lazy-loaded\" src=\"http://localhost/tugas/w3.jpg\" sizes=\"(max-width: 650px) 100vw, 650px\"alt=\"\" width=\"650\" height=\"488\" data-lazy-type=\"image\" data-lazy-src=\"https://blog.reservasi.com/wp-content/uploads/2017/01/bantenwisata-1024x768.jpg\" data-lazy-srcset=\"https://blog.reservasi.com/wp-content/uploads/2017/01/bantenwisata-1024x768.jpg 1024w, https://blog.reservasi.com/wp-content/uploads/2017/01/bantenwisata-300x225.jpg 300w, https://blog.reservasi.com/wp-content/uploads/2017/01/bantenwisata-768x576.jpg 768w, https://blog.reservasi.com/wp-content/uploads/2017/01/bantenwisata.jpg 1400w\" data-lazy-sizes=\"(max-width: 650px) 100vw, 650px\" />\n"
                + "<figcaption class=\"wp-caption-text\">bantenwisata.com</figcaption>\n"
                + "</figure>\n"
                + "<p style=\"text-align: justify;\">     Sudah berdiri sejak tahun 1569 yang lalu. Masjid Agung Banteng yang memiliki arsitektur bangunan yang masih kental dengan ciri khas pada zaman dahulu. Masjid ini memiliki beberapa perpaduan yang sangat etnik. Budaya Hindu, China, Jawa dan Eropa sekaligus jadi satu dipadukan dalam Masjid Agung yang berlokasi di Jl. Banten Lama, Kasemen Serang ini.</p>\n"
                + "<p style=\"text-align: justify;\">     Tak hanya Masjid biasa, tempat ini juga sering dijadikan tempat berwisata oleh para pengunjung karaena keindahan dan kemegahan dari Masjid yang menjadi ciri khas umat Islam di Banten.</p>\n"
                + "<h2>4. Rawa Dano</h2>\n"
                + "<figure id=\"attachment_11839\" class=\"wp-caption aligncenter\"><img class=\"lazy wp-image-11839 lazy-loaded\" src=\"http://localhost/tugas/w4.jpg\" sizes=\"(max-width: 650px) 100vw, 650px\"alt=\"\" width=\"650\" height=\"430\" data-lazy-type=\"image\" data-lazy-src=\"https://blog.reservasi.com/wp-content/uploads/2017/01/rawa-danau-1024x677.jpg\" data-lazy-srcset=\"https://blog.reservasi.com/wp-content/uploads/2017/01/rawa-danau-1024x677.jpg 1024w, https://blog.reservasi.com/wp-content/uploads/2017/01/rawa-danau-300x198.jpg 300w, https://blog.reservasi.com/wp-content/uploads/2017/01/rawa-danau-768x508.jpg 768w, https://blog.reservasi.com/wp-content/uploads/2017/01/rawa-danau.jpg 1400w\" data-lazy-sizes=\"(max-width: 650px) 100vw, 650px\" />\n"
                + "<figcaption class=\"wp-caption-text\">ksmtour.com</figcaption>\n"
                + "</figure>\n"
                + "<p style=\"text-align: justify;\">     Lokasi Rawa Dano berada di Kabupaten Serang. Bisa kamu tempuh kurang lebih berjarak 100 kilometer dari Jakarta. Rawa Dano yang merupakan salah satu tempat wisata di Banten ini memiliki keindahan alam yang sangat indah sekali dan sangat sayang untuk kamu lewatkan.</p>\n"
                + "<p style=\"text-align: justify;\">     Sesuai dengan namanya, Rawa Dano ini memiliki danau, rawa-rawa dan hutan. Tempatnya yang memiliki luas kurang lebih 2,500 hektar ini ternyata masih memiliki banyak sekali satwa berjenis reptil seperti kadal dan ular.</p>\n"
                + "<h2>5. Danau Tasikardi</h2>\n"
                + "<figure id=\"attachment_11840\" class=\"wp-caption aligncenter\"><img class=\"lazy wp-image-11840 size-full lazy-loaded\" src=\"http://localhost/tugas/w5.jpg\" sizes=\"(max-width: 634px) 100vw, 634px\"alt=\"\" width=\"634\" height=\"371\" data-lazy-type=\"image\" data-lazy-src=\"https://blog.reservasi.com/wp-content/uploads/2017/01/Wisata-Danau-Tasikardi-Banten.jpg\" data-lazy-srcset=\"https://blog.reservasi.com/wp-content/uploads/2017/01/Wisata-Danau-Tasikardi-Banten.jpg 634w, https://blog.reservasi.com/wp-content/uploads/2017/01/Wisata-Danau-Tasikardi-Banten-300x176.jpg 300w\" data-lazy-sizes=\"(max-width: 634px) 100vw, 634px\" />\n"
                + "<figcaption class=\"wp-caption-text\">ilustrasi/bantenwisata.com</figcaption>\n"
                + "</figure>\n"
                + "<p style=\"text-align: justify;\">     Terletak di Desa Margasana, Kecamatan Kramatwatu, Kota Serang Banten, Danau Tasikardi ini terletak kurang lebih 10 kilometer dari pusat kota Serang. Asal muasal Danau ini juga berasal dari bahasa Sunda yang berarti “danau buatan.”</p>\n"
                + "<div class=\"code-block code-block-4\"> </div>\n"
                + "<p style=\"text-align: justify;\">     Danau yang memiliki luas kurang lebih 5 hektar ini ternyata memiliki lapisan dasar yang berupa ubin batu bata. Di sini kamu bisa melakukan beberapa aktivitas seperti memancing, berkemah, bermain perahu air dan menikmati suasana sejuk yang disajikan di Danau Tasikaradi berkut ini. Selain itu, di sini kamu juga bisa menyebrang dan mengunjungi pulau peninggalan dari Sultan Banten.</p>\n"
                + "<h2>6. Pulau Sangiang</h2>\n"
                + "<p class=\"wrap-img\"><img class=\"lazy aligncenter wp-image-11841 lazy-loaded\" src=\"http://localhost/tugas/w6.jpg\" sizes=\"(max-width: 650px) 100vw, 650px\"alt=\"\" width=\"650\" height=\"366\" data-lazy-type=\"image\" data-lazy-src=\"https://blog.reservasi.com/wp-content/uploads/2017/01/bantenwisatadotcom-1024x576.jpg\" data-lazy-srcset=\"https://blog.reservasi.com/wp-content/uploads/2017/01/bantenwisatadotcom-1024x576.jpg 1024w, https://blog.reservasi.com/wp-content/uploads/2017/01/bantenwisatadotcom-300x169.jpg 300w, https://blog.reservasi.com/wp-content/uploads/2017/01/bantenwisatadotcom-768x432.jpg 768w, https://blog.reservasi.com/wp-content/uploads/2017/01/bantenwisatadotcom.jpg 1032w\" data-lazy-sizes=\"(max-width: 650px) 100vw, 650px\" /></p>\n"
                + "<p style=\"text-align: justify;\">     Pulau yang terletak di Selat Sunda, Banten ini bisa kamu tempuh hanya dengan menggunakan perahu dari pantai Anyer. Lama perjalanan akan menempuh waktu kurang lebih 45 menit.</p>\n"
                + "<p style=\"text-align: justify;\">     Ada beberapa tempat wisata lain yang tak kalah indah dan bisa kamu nikmati jika berkunjung ke tempat ini.</p>\n"
                + "<p style=\"text-align: justify;\">     Di antaranya adalah wisata bahari, wisata budaya, wisata ilmiah dan wisata alam. Setelah berkunjung ke beberapa tempat wisata yang berada di Pulau Sangiang, kini saatnya untuk mencoba beberapa aktivitas lain yang merupakan fasilitas dari pulau ini.</p>\n"
                + "<p style=\"text-align: justify;\">     Di sini, kamu bisa mencoba untuk mendaki gunung, bersepeda, berkemah, snorkeling, memancing dan menikmati juga beberapa benteng-benteng Jepang peninggalan sejarah pada masa perang dunia dahulu.</p>\n"
                + "<h2>7. Pantai Sawarna</h2>\n"
                + "<figure id=\"attachment_11842\" class=\"wp-caption aligncenter\"><img class=\"lazy wp-image-11842 size-full lazy-loaded\" src=\"http://localhost/tugas/w7.jpg\" sizes=\"(max-width: 634px) 100vw, 634px\"alt=\"\" width=\"634\" height=\"371\" data-lazy-type=\"image\" data-lazy-src=\"https://blog.reservasi.com/wp-content/uploads/2017/01/Sawarna.jpg\" data-lazy-srcset=\"https://blog.reservasi.com/wp-content/uploads/2017/01/Sawarna.jpg 634w, https://blog.reservasi.com/wp-content/uploads/2017/01/Sawarna-300x176.jpg 300w\" data-lazy-sizes=\"(max-width: 634px) 100vw, 634px\" />\n"
                + "<figcaption class=\"wp-caption-text\">bantenwisata.com</figcaption>\n"
                + "</figure>\n"
                + "<p style=\"text-align: justify;\">     Merupakan kawasan yang berada di Bayah, Banten. Pantai Sawarna ini masih tergolong wisata baru dan belum terlalu ramai dikunjungi oleh para wisatawan. Tempat yang terkenal berkat sosial media ini terletak di pantai Selatan, tepatnya di daerah Bayah.</p>\n"
                + "<p style=\"text-align: justify;\">     Biasanya pantai ini suka dijadikan tempat berselancar oleh para wisatawan karena pantainya memiliki ombak yang besar. Tak perlu khawatir jika ingin bermalam di sekitar pantai ini, karena kamu akan dengan sangat mudah menemukan beberapa penginapan di sekitar lokasi dengan harga murah.</p>\n"
                + "<h2>8. Rumah Hutan Banten</h2>\n"
                + "<figure id=\"attachment_11843\" class=\"wp-caption aligncenter\"><img class=\"lazy wp-image-11843 lazy-loaded\" src=\"http://localhost/tugas/w8.jpg\" sizes=\"(max-width: 650px) 100vw, 650px\"alt=\"\" width=\"650\" height=\"432\" data-lazy-type=\"image\" data-lazy-src=\"https://blog.reservasi.com/wp-content/uploads/2017/01/rumah-hutan-1024x680.jpg\" data-lazy-srcset=\"https://blog.reservasi.com/wp-content/uploads/2017/01/rumah-hutan.jpg 1024w, https://blog.reservasi.com/wp-content/uploads/2017/01/rumah-hutan-300x199.jpg 300w, https://blog.reservasi.com/wp-content/uploads/2017/01/rumah-hutan-768x510.jpg 768w\" data-lazy-sizes=\"(max-width: 650px) 100vw, 650px\" />\n"
                + "<figcaption class=\"wp-caption-text\">sepedaan.com</figcaption>\n"
                + "</figure>\n"
                + "<p style=\"text-align: justify;\">     Masih berlokasi di sekitaran Serang, tempat ini terletak di Kampung Bojong, desa Cidampit Kecamatan Taktakan, Serang. Sebenarnya tempat ini merupakan Rumah Hutan yang dilengkapi dengan fasilitas Rumah Pohon. Suasananya yang masih sangat alami, tempat ini memiliki daya tarik dan keunikan tersendiri sehingga banyak dikunjungi oleh para wisatawan.</p>\n"
                + "<div class=\"code-block code-block-9\"> </div>\n"
                + "<h2>9. Curug Bumi</h2>\n"
                + "<figure id=\"attachment_11844\" class=\"wp-caption aligncenter\"><img class=\"lazy wp-image-11844 size-full lazy-loaded\" src=\"http://localhost/tugas/w9.jpg\" sizes=\"(max-width: 640px) 100vw, 640px\"alt=\"\" width=\"640\" height=\"453\" data-lazy-type=\"image\" data-lazy-src=\"https://blog.reservasi.com/wp-content/uploads/2017/01/curug-bumi-banten.jpg\" data-lazy-srcset=\"https://blog.reservasi.com/wp-content/uploads/2017/01/curug-bumi-banten.jpg 640w, https://blog.reservasi.com/wp-content/uploads/2017/01/curug-bumi-banten-300x212.jpg 300w\" data-lazy-sizes=\"(max-width: 640px) 100vw, 640px\" />\n"
                + "<figcaption class=\"wp-caption-text\">mahakatour.com</figcaption>\n"
                + "</figure>\n"
                + "<p style=\"text-align: justify;\">     Salah satu tempat wisata yang terbilang masih sangat sejuk dan alami ini adalah Curug Bumi, atau yang biasa disebut juga dengan Leuwi Bumi. Berlokasi di Padarincang, Serang, Banten, Curug ini memiliki kolam air yang sangat jernih dan sangat sejuk sekali. Tentunya lokasi ini sangat pas untuk kamu kunjungi ketika akhir pekan bersama teman-teman maupun keluarga tercinta.</p>\n"
                + "<p style=\"text-align: justify;\">     Biasanya tidak hanya bermain air di Curug Bumi, lokasi sekitar juga sering dijadikan tempat berkemping oleh para wisatawan yang berdatangan ke tempat ini. Siap untuk berkemping di tempat ini?</p>\n"
                + "<h2>10. Taman Nasional Ujung Kulon</h2>\n"
                + "<figure id=\"attachment_11845\" class=\"wp-caption aligncenter\"><img class=\"lazy wp-image-11845 lazy-loaded\" src=\"http://localhost/tugas/w10.jpg\" sizes=\"(max-width: 650px) 100vw, 650px\"alt=\"\" width=\"650\" height=\"432\" data-lazy-type=\"image\" data-lazy-src=\"https://blog.reservasi.com/wp-content/uploads/2017/01/Taman-Ujung-Kulon-1024x681.jpg\" data-lazy-srcset=\"https://blog.reservasi.com/wp-content/uploads/2017/01/Taman-Ujung-Kulon.jpg 1024w, https://blog.reservasi.com/wp-content/uploads/2017/01/Taman-Ujung-Kulon-300x200.jpg 300w, https://blog.reservasi.com/wp-content/uploads/2017/01/Taman-Ujung-Kulon-768x511.jpg 768w\" data-lazy-sizes=\"(max-width: 650px) 100vw, 650px\" />\n"
                + "<figcaption class=\"wp-caption-text\">outingnusantara.com</figcaption>\n"
                + "</figure>\n"
                + "<p style=\"text-align: justify;\">     Taman Nasional Ujung Kulon, yang merupakan kawasan paling konservasi dengan alam yang berada di Indonesia ini sangat berperan penting dan masih dijaga maupun dilestarikan oleh Indonesia.</p>\n"
                + "<p style=\"text-align: justify;\">     Banyaknya daya tarik yang membawa para pengunjung untuk menginjakan kakinya di tempat ini adalah, adanya beberapa hutan tropis dengan dataran rendah yang sangat indah dan menakjubkan. Serta, kamu bisa bertemu dengan badak bercula satu di tempat ini.</p>\n"
                + "<p style=\"text-align: justify;\">     Tak hanya itu saja, masih ada banyak sekali beberapa jenis hewan yang dilindungi di Taman Nasional Ujung Kulon ini, beberapa diantaranya adalah; Badak Jawa, Banteng, Babi Hutan, Kukang, dan berbagai macam jenis burung dan primata, dan binatang lainnya.</p>\n"
                + "<p>The free online Word HTML converter helps you get rid of the dirty code when converting documents for the web.</p>");
    }

    @FXML
    private void handleBtnSenjataAction(ActionEvent event) {
        wvSemua.getEngine().loadContent("<h2 style=\"text-align: justify;\">Senjata Tradisional Banten &ndash; Golok</h2>\n"
                + "<p><img src=\"http://localhost/tugas/senjata2.jpg\" alt=\"10 Kesenian Di Provinsi Banten\" border=\"0\" /></p>\n"
                + "<p style=\"text-align: justify;\">Gambar tersebut adalah senjata tradisional Banten, senjata tersebut diberi nama dengan nama senjata Golok, yang mana senjata golok ini sering digunakan oleh jawara-jawara di wilayah Banten.</p>\n"
                + "<p style=\"text-align: justify;\">Selain kerap digunakan oleh para jawara-jawara Banten, senjata yang bernama bedog ini merupakan salah satu peralatan senjata yang sangat penting dalam kehidupan sehari-hari.</p>\n"
                + "<p style=\"text-align: justify;\">Fungsi dari kegunaan bedog ini misalnya seperti menebang pohon, menebang bambu, membelah kelapa, keperluan dapur dan masih banyak kegunaan-kegunaan lainnya.</p>\n"
                + "<h2 style=\"text-align: justify;\">Senjata Tradisional Banten &ndash; Golok Ciomas</h2>\n"
                + "<p><img src=\"http://localhost/tugas/senjata3.jpg\" alt=\"10 Kesenian Di Provinsi Banten\" border=\"0\" /></p>\n"
                + "<p style=\"text-align: justify;\">Senjata Tradisional Banten yang bernama Golok Ciomas in merupakan senjata yang bersejarah diwilayah Banten. Golok Ciomas ini tidak berbeda dengan golok-golok lainnya, hanya saja golok ciomas ini adalah senjata tajam yang berbentuk golok pada umumnya.</p>\n"
                + "<p style=\"text-align: justify;\">Golok Ciomas ini ini dijadikan sebagai senjata simpanan untuk membela diri sendiri. Dahulu pada saat penjajahan, golok ini sangat terkenal sebagai senjata yang kerap dibawa perang oleh para jawara-jawara Banten ketika pada masa penjajahan dulu.</p>\n"
                + "<p style=\"text-align: justify;\">Apabila kamu ingin mengunjungi daerah ciomas untuk melihat Golok Ciomas raksasa itu sangat mudah sekali, Dari tengah Kota Serang banyak sekali angkutan-angkutan umum yang langsung menuju ke daerah Ciomas.</p>\n"
                + "<p style=\"text-align: justify;\">Asal-usul pengambilan nama &ldquo;golok ciomas&rdquo; ini diambil dari wilayah yang bernama &ldquo;Ciomas&rdquo; yang mana daerah ciomas ini adalah salah satu tempat pembuatan golok, tentunya Golok Ciomas ini dibuatnya disitu.</p>\n"
                + "<p style=\"text-align: justify;\">Para penduduk Banten ini biasa menyebut golok ini dengan sebutan &ldquo;bedog&rdquo;. Tetapi, disitu terdapat perbedaan, bahwa bedog biasa ini kegunaan-nya untuk sebuah peralatan. Untuk membedakan sebagai peralatan senjata ini, maka bedog tersebut disebut dengan nama &ldquo;Bedog Ciomas&rdquo; yang mana bedog itu langsung merujuk secara khusus untuk senjata.</p>\n"
                + "<p style=\"text-align: justify;\">Senjata Tradisional yang bernama Golok Ciomas ini memiliki keistimewaan-keistimewaan dalam segi pembuatan-nya, hal tersebut yang memberikan nilai-nilai seni khusus bagi golo ciomas.</p>\n"
                + "<p style=\"text-align: justify;\">Bukan hanya sekedar keistimewaan-nya, melainkan pembuatan golok ciomas ini mengikuti aturan-aturan yang tidak tertulis, yang biasa dilakukan dari generasi ke generasi pada zaman Kesultanan Banten.</p>\n"
                + "<p style=\"text-align: justify;\">Pembuatan golok Ciomas&nbsp;ini hanya dibuat ketika bulan Mulud saja, yaitu dimana bulan Mulud itu adalah Kelahiran Nabi Muhammad SAW. Seperti yang kita ketahui, mayoritas penduduk Banten hampir semuanya memegang agama Islam, ketika waktu kelahiran Nabi Muhammad SAW memiliki makna tersendiri.</p>\n"
                + "<p style=\"text-align: justify;\">Berbeda dengan pembuatan golok-golok perkakas lainnya, ketika akan membuat golok Ciomas ini harus melewati beberapa ritual-ritual tertentu. Demikan mengenai hal ini berbeda dengan yang lain, yaitu penempaan bahan besi golok Ciomas hanya menggunakan godam, atau penmpa khusus yang bernama Ki Denok.</p>\n"
                + "<p style=\"text-align: justify;\">Godam atau palu yang bernama Ki Denok ini adalah salah satu warisan peninggalan pada zaman Kerajaan Islam Banten. Godam ini adalah salah satu hadiah dari Sultan Banten. Meskipun aturan pembuatan golok yang ketat, golok Ciomas ini menjadi salah satu golok yang memiliki nilai artistik tinggi.</p>\n"
                + "<p style=\"text-align: justify;\">Selain itu, golok Ciomas ini sangat terkenal dengan keistimewaan-nya, dan keseimbangan pada bentuk yang telah diakui memiliki kelebihan-kelebihan dibandingkan dengan senjata-senjata lainnya.</p>\n"
                + "<p style=\"text-align: justify;\">Ketika dahulu masih pada masa-masa penjajahan, jawara-jawara Banten ini menggunakan golok Ciomas untuk dijadikan senjata andalan mereka, yang kegunaan-nya untuk melindungi diri, dan mengusir para penjajah-penjajah.</p>\n"
                + "<p style=\"text-align: justify;\">Tidak semua orang mempunyai senjata golok Ciomas ini, karena pembuatan golok ini tidak sembarangan, maka kepemilikan golok Ciomas ini hanya dipegang oleh-oleh orang tertentu dan hanya digunakan untuk menjaga kebaikan.</p>\n"
                + "<p style=\"text-align: justify;\">Golok Ciomas juga tidak digunakan dengan cara sembarangan, apalagi digunakan kepada hal-hal yang sangat negatif, seperti digunakan kepada kejahatan.</p>\n"
                + "<p style=\"text-align: justify;\">Saat ini, para pengrajin golok didaerah Ciomas dapat menjadi cenderamata bagi para wisata yang berwisata kedaerah Banten. Daerah Ciomas ini sangat dikenal dengan tempat pembuatan golok. Maka dari itu, sebuah golok terbesar di Dunia dibuat di daerah Ciomas.</p>\n"
                + "<p style=\"text-align: justify;\">Karena kecintaan penduduk banten, maka golok raksasa ini dibuat di daerah Ciomas, Provinsi Banten. Golok raksasa ini telah diberi nama Golok Nyi Gede, Nama golok tersebut lebih merujuk kepada sebutan Nyi Kawunganten (Ibunda Sultan Maulana Hasanuddin)</p>\n"
                + "<p style=\"text-align: justify;\">Golok raksasa yang bernama Nyi Gede ini mempunyai berat besi kurang lebih sekitar 1.500 kilogram, berat gagan kayu-nya pun sekitar 250 kilogram, dan berat serangka-nya pun kkurang lebih sekitar 250 kilogram.</p>\n"
                + "<p style=\"text-align: justify;\">Apabila ditimbang secara keseluruhan, golok raksasa ini mempunyai berat sekitar 2 ton. Weleh-weleh ga kebayang segede gimana itu sampe beratnya aja 2 ton.</p>\n"
                + "<p style=\"text-align: justify;\">Golok raksasa yang bernama Nyi Gede ini bisa dilihat didaerah Ciomas, Panjang golok Ciomas ini sepanjang 5 meter, gagang pada golok tersebut memiliki panjang 1,7meter, dan serangka pada golok tersebut memiliki panjang sekitar 5,6 meter.</p>\n"
                + "<p style=\"text-align: justify;\">Dibuatnya golok raksasa ini sebagai kebanggaan penduduk Banten terhadap warisan-warisan budaya peninggalan sesepuh Banten, dan juga golok raksasa tersebut disebut sebagai simbol kekeluargaan.</p>\n"
                + "<h2 style=\"text-align: justify;\">Senjata Tradisional Banten &ndash; Golok Salungkar</h2>\n"
                + "<p><img src=\"http://localhost/tugas/senjata4.jpg\" alt=\"10 Kesenian Di Provinsi Banten\" border=\"0\" /></p>\n"
                + "<p style=\"text-align: justify;\">Golok selangkar ini merupakan golok keramat asli yang diwariskan oleh budaya banten, golok selangkar juga kerap digunakan oleh penduduk-penduduk banten sebagai peralatan senjata ketika melawan penjajah.</p>\n"
                + "<p style=\"text-align: justify;\">Pada jaman dulu, orang Banten menggunakan Golok Sulangkar ini sambil mengoleskan racun ke bagian pedangnya, agar dapat melumpuhkan musuh-musuh, dan racun yang di oleskan itu adalah racun dari ular tanah, kalajengking, dan katak budug.</p>\n"
                + "<p style=\"text-align: justify;\">Aslinya, golok sulangkar ini terbuat dari beberapa jenis besi pilihan, jenis-jenis besi pilihannya itu, seperti besi plat hitam yang disebut dengan besi sulangkar, baja dari kihkir bekas, besi sulangkar yang akan digunakanpun harus besi-besi pilihan yang mengandung besi yang telah digunakan oleh orang-orang zaman dahulu.</p>\n"
                + "<p style=\"text-align: justify;\">Konon, besi kuno ini sangat dipercayai oleh masyarakat Banten, bahwa besi kundo ini mengandung banyaknya mistis-mistis yang kuat.</p>\n"
                + "<p style=\"text-align: justify;\">Cara pembuatan Golok Sulangkar ini tidaklah mudah, bahan-bahan tersebut harus disatukan terlebih dahulu dengan cara dibakar, setelah dibakar, kemudian ditempa/dipukuli menjadi satu lempengan besi, kemudian setelah itu langsung dibentuk sesuai dengan ukuran yang kita inginkan</p>\n"
                + "<p style=\"text-align: justify;\">Kemudian setelah dibentuk menjadi sebuh golok, maka golok tersebut difinishing agar menjadi golok yang siap dipakai, ada yang memakai gagang dari kayu, dan ada juga yang memakai gagang dari tanduk kerbau, semua itu tergantung selera, dan kesukaan masing-masing.</p>\n"
                + "<h2 style=\"text-align: justify;\">Senjata Tradisional dari Banten &ndash; Congkrang (Arit)</h2>\n"
                + "<p><img src=\"http://localhost/tugas/senjata5.jpg\" alt=\"10 Kesenian Di Provinsi Banten\" border=\"0\" /></p>\n"
                + "<p style=\"text-align: justify;\">Ada juga senjata tradisional banten ini yang bentuknya agak sedikit berbeda dengan bentuk bedog, yang mana pada bagian ujung senjata tersebut agak melengkung ke bawah, dan senjata tersbut disebut oleh penduduk Banten ini dengan panggilan nama Congkrang atau Arit.</p>\n"
                + "<p style=\"text-align: justify;\">Fungsi dari senjata conkrang ini lebih banyak dipergunakan untuk menyabit-nyabit rumput-rumput atau keperluan-keperluan di kebun.</p>\n"
                + "<h2 style=\"text-align: justify;\">Senjata Tradisional dari Banten &ndash; Parang</h2>\n"
                + "<p><img src=\"http://localhost/tugas/senjata1.jpg\" alt=\"10 Kesenian Di Provinsi Banten\" border=\"0\" /></p>\n"
                + "<p style=\"text-align: justify;\">Parang ini merupakan salah satu senjata tradisional dari daerah Banten, senjata yang bernama parang ini juga dapat digunakan sebagai peralatan untuk melindungi diri, selain untuk melindungi diri, parang ini dapat digunakan untuk kebutuhan hidup sehari-hari penduduk di Banten.</p>\n"
                + "<p style=\"text-align: justify;\">Biasanya, senjata yang bernama parang ini digunakan untuk membuat rumah-rumah warga yang berbentuk rumah panggung.</p>\n"
                + "<p style=\"text-align: justify;\">Bahan-bahan dasar rumah panggung ini adalah bambu, yang mana parang ini biasa digunakan sebagai alat untuk memotong, dan membelah bambu sebelum dibangun menjadi rumah.</p>\n"
                + "<p style=\"text-align: justify;\">Itulah ulasan tentang Senjata Tradisional Banten berikut dengan penjelasan dan kegunaannya, mungkin hanya ini yang bisa saya sampaikan, apabila ada kekurangan dalam penyampaian, atau ada salah-salah kata, saya pribadi mohon maaf atas keteledoran dalam memberi informasi.</p>\n"
                + "created by Muhammad Iqbal");
    }

    @FXML
    private void handleBtnPakaianAction(ActionEvent event) {
        wvSemua.getEngine().loadContent("<ol>\n"
                + "<li>Pakaian Adat Pengantin</li>\n"
                + "</ol>\n"
                + "<p style=\"text-align: center;\"><img class=\"size-medium wp-image-5227 aligncenter jetpack-lazy-image td-animation-stack-type0-1 jetpack-lazy-image--handled\" src=\"http://localhost/tugas/baju1.png\" sizes=\"(max-width: 160px) 100vw, 160px\"alt=\"\" width=\"160\" height=\"300\" data-attachment-id=\"5227\" data-permalink=\"https://centralnews.co.id/2017/07/21/pakaian-adat-banten-yang-perlu-anda-diketahui/pakaian-pengantin-banten/\" data-orig-file=\"https://i2.wp.com/centralnews.co.id/wp-content/uploads/2017/07/pakaian-pengantin-banten.png?fit=171%2C320&amp;ssl=1\" data-orig-size=\"171,320\" data-comments-opened=\"1\" data-image-meta=\"{&quot;aperture&quot;:&quot;0&quot;,&quot;credit&quot;:&quot;&quot;,&quot;camera&quot;:&quot;&quot;,&quot;caption&quot;:&quot;&quot;,&quot;created_timestamp&quot;:&quot;0&quot;,&quot;copyright&quot;:&quot;&quot;,&quot;focal_length&quot;:&quot;0&quot;,&quot;iso&quot;:&quot;0&quot;,&quot;shutter_speed&quot;:&quot;0&quot;,&quot;title&quot;:&quot;&quot;,&quot;orientation&quot;:&quot;0&quot;}\" data-image-title=\"pakaian pengantin banten\" data-image-description=\"\" data-medium-file=\"https://i2.wp.com/centralnews.co.id/wp-content/uploads/2017/07/pakaian-pengantin-banten.png?fit=160%2C300&amp;ssl=1\" data-large-file=\"https://i2.wp.com/centralnews.co.id/wp-content/uploads/2017/07/pakaian-pengantin-banten.png?fit=171%2C320&amp;ssl=1\" data-recalc-dims=\"1\" data-lazy-loaded=\"1\" /></p>\n"
                + "<p style=\"text-align: justify;\">     Sesuai dengan namanya, pakaian adat Panganten hanya digunakan oleh para mempelai ketika acara resepsi pernikahan. Dari motif dan desainnya, pakaian ini sebetulnya sangat mirip dengan pakaian pengantin ada Sunda. Untuk para pria, pakaian penganten dikenakan dengan perlengkapan antara lain baju koko dengan kerah sebagai atasan, kain samping atau batik khas Banten sebagai bawahan, penutup kepala, sabuk dari kain batik dengan motif sama, selop, serta sebilah parang, golok, atau keris sebagai pelengkapnya. Adapun untuk para mempelai wanita, pakaian adat Banten khusus upacara pernikahan yang dikenakan berupa baju kebaya sebagai atasan, kain samping atau batik sebagai bawahan, selendang yang diselempangkan ke bahu, serta hiasan di kepala berupa kembang goyang berwarna keemasan dan rangkaian bunga melati yang diselipkan di sanggulnya.</p>\n"
                + "<ol start=\"2\">\n"
                + "<li>Baju Pangsi</li>\n"
                + "</ol>\n"
                + "<div class=\"td-g-rec td-g-rec-id-content_inline td_uid_3_5ce64acf0d8e4_rand td_block_template_1 \"> </div>\n"
                + "<p style=\"text-align: center;\"><img class=\"size-medium wp-image-5229 aligncenter jetpack-lazy-image td-animation-stack-type0-1 jetpack-lazy-image--handled\" src=\"http://localhost/tugas/baju2.jpg\" sizes=\"(max-width: 236px) 100vw, 236px\"alt=\"\" width=\"236\" height=\"300\" data-attachment-id=\"5229\" data-permalink=\"https://centralnews.co.id/2017/07/21/pakaian-adat-banten-yang-perlu-anda-diketahui/pangsi1/\" data-orig-file=\"https://i1.wp.com/centralnews.co.id/wp-content/uploads/2017/07/pangsi1.jpg?fit=314%2C400&amp;ssl=1\" data-orig-size=\"314,400\" data-comments-opened=\"1\" data-image-meta=\"{&quot;aperture&quot;:&quot;0&quot;,&quot;credit&quot;:&quot;&quot;,&quot;camera&quot;:&quot;&quot;,&quot;caption&quot;:&quot;&quot;,&quot;created_timestamp&quot;:&quot;0&quot;,&quot;copyright&quot;:&quot;&quot;,&quot;focal_length&quot;:&quot;0&quot;,&quot;iso&quot;:&quot;0&quot;,&quot;shutter_speed&quot;:&quot;0&quot;,&quot;title&quot;:&quot;&quot;,&quot;orientation&quot;:&quot;0&quot;}\" data-image-title=\"pangsi1\" data-image-description=\"\" data-medium-file=\"https://i1.wp.com/centralnews.co.id/wp-content/uploads/2017/07/pangsi1.jpg?fit=236%2C300&amp;ssl=1\" data-large-file=\"https://i1.wp.com/centralnews.co.id/wp-content/uploads/2017/07/pangsi1.jpg?fit=314%2C400&amp;ssl=1\" data-recalc-dims=\"1\" data-lazy-loaded=\"1\" /></p>\n"
                + "<p style=\"text-align: justify;\">     Baju pangsi adalah baju yang dikenakan sehari-hari oleh masyarakat Banten. Baju ini dipadukan dengan celana komprang. Selain sebagai pakaian sehari-hari baju pangsi juga dipakai dalam latihan silat tradisional atau debus yang kerap digelar oleh masyarakat adat Banten. Pangsi merupakan singkatan dari Pangeusi “Numpang ka Sisi” yakni pakaian penutup badan yang cara pemakaiannya dibelitkan dengan cara menumpang seperti memakai sarung. Pangsi terdiri dari tiga susunan yakni Nangtung, Tangtung, Samping.</p>\n"
                + "<ol start=\"3\">\n"
                + "<li>Pakaian Adat Baduy</li>\n"
                + "</ol>\n"
                + "<p style=\"text-align: justify;\">     Suku Baduy sering dianggap sebagai suku asli masyarakat Banten. Suku ini memegang erat hukum adat dan menutup diri dari masyarakat luar dan kemajuan teknologi yang saat ini semakin pesat. Sehingga, dari sisi penerimaannya terhadap masyarakat luar, suku Baduy dibagi menjadi 2, yaitu suku Baduy Dalam dan suku Baduy Luar.</p>\n"
                + "<p style=\"text-align: justify;\">     Suku Baduy Dalam sama sekali tidak mau berinteraksi dengan masyarakat luar. Suku Baduy Luar masih mau berinteraksi dengan masyarakat luar tapi dengan batas-batas tertentu. Oleh karena itu pakaian adat kedua suku ini mempunyai perbedaan mencolok.</p>\n"
                + "<p>a. Pakaian adat Baduy Dalam</p>\n"
                + "<p style=\"text-align: center;\"><img class=\"size-medium wp-image-5226 aligncenter jetpack-lazy-image td-animation-stack-type0-1 jetpack-lazy-image--handled\" src=\"http://localhost/tugas/baju3.jpg\" sizes=\"(max-width: 300px) 100vw, 300px\"alt=\"\" width=\"300\" height=\"225\" data-attachment-id=\"5226\" data-permalink=\"https://centralnews.co.id/2017/07/21/pakaian-adat-banten-yang-perlu-anda-diketahui/34-2-1024x768/\" data-orig-file=\"https://i1.wp.com/centralnews.co.id/wp-content/uploads/2017/07/34-2-1024x768.jpg?fit=1024%2C768&amp;ssl=1\" data-orig-size=\"1024,768\" data-comments-opened=\"1\" data-image-meta=\"{&quot;aperture&quot;:&quot;0&quot;,&quot;credit&quot;:&quot;&quot;,&quot;camera&quot;:&quot;&quot;,&quot;caption&quot;:&quot;&quot;,&quot;created_timestamp&quot;:&quot;0&quot;,&quot;copyright&quot;:&quot;&quot;,&quot;focal_length&quot;:&quot;0&quot;,&quot;iso&quot;:&quot;0&quot;,&quot;shutter_speed&quot;:&quot;0&quot;,&quot;title&quot;:&quot;&quot;,&quot;orientation&quot;:&quot;0&quot;}\" data-image-title=\"34-2-1024×768\" data-image-description=\"\" data-medium-file=\"https://i1.wp.com/centralnews.co.id/wp-content/uploads/2017/07/34-2-1024x768.jpg?fit=300%2C225&amp;ssl=1\" data-large-file=\"https://i1.wp.com/centralnews.co.id/wp-content/uploads/2017/07/34-2-1024x768.jpg?fit=696%2C522&amp;ssl=1\" data-recalc-dims=\"1\" data-lazy-loaded=\"1\" /></p>\n"
                + "<p style=\"text-align: justify;\">     Suku Baduy Dalam cenderung menggunakan pakaian dengan warna putih polos yang mereka sebut dengan nama Jamang Sangsang. Nama tersebut sesuai dengan bagaimana cara baju tersebut digunakan. Baju Jamang Sangsang digunakan dengan cara disangsangkan atau digantungkan di badan. Baju ini hanya memliki lubang dibagian lengan dan leher tanpa kerah. Selain itu, baju ini juga tidak dilengkapi dengan kancing atau saku dan hanya dijahit menggunakan tangan. Bahan yang digunakannya pun harus dibuat dari pintalan kapas asli yang diperoleh dari hutan. Sebagai bawahan, orang-orang Baduy Dalam mengenakan sarung warna hitam atau biru tua yang dililit dipinggang. Tak lupa ikat kepala dari kain putih juga dikenakan sebagai pembatas rambut yang biasanya terurai panjang. Penggunaan warna putih pada pakaian adat Baduy dalam memiliki makna bahwa mereka masih suci dan belum dipengaruhi budaya luar yang cenderung merusak moral.</p>\n"
                + "<p>b. Pakaian adat Baduy Luar</p>\n"
                + "<p style=\"text-align: center;\"><img class=\"size-medium wp-image-5230 aligncenter jetpack-lazy-image td-animation-stack-type0-1 jetpack-lazy-image--handled\" src=\"http://localhost/tugas/baju4.jpg\" sizes=\"(max-width: 300px) 100vw, 300px\"alt=\"\" width=\"300\" height=\"200\" data-attachment-id=\"5230\" data-permalink=\"https://centralnews.co.id/2017/07/21/pakaian-adat-banten-yang-perlu-anda-diketahui/baduy-luar/\" data-orig-file=\"https://i0.wp.com/centralnews.co.id/wp-content/uploads/2017/07/baduy-luar.jpg?fit=320%2C213&amp;ssl=1\" data-orig-size=\"320,213\" data-comments-opened=\"1\" data-image-meta=\"{&quot;aperture&quot;:&quot;0&quot;,&quot;credit&quot;:&quot;&quot;,&quot;camera&quot;:&quot;&quot;,&quot;caption&quot;:&quot;&quot;,&quot;created_timestamp&quot;:&quot;0&quot;,&quot;copyright&quot;:&quot;&quot;,&quot;focal_length&quot;:&quot;0&quot;,&quot;iso&quot;:&quot;0&quot;,&quot;shutter_speed&quot;:&quot;0&quot;,&quot;title&quot;:&quot;&quot;,&quot;orientation&quot;:&quot;0&quot;}\" data-image-title=\"baduy luar\" data-image-description=\"\" data-medium-file=\"https://i0.wp.com/centralnews.co.id/wp-content/uploads/2017/07/baduy-luar.jpg?fit=300%2C200&amp;ssl=1\" data-large-file=\"https://i0.wp.com/centralnews.co.id/wp-content/uploads/2017/07/baduy-luar.jpg?fit=320%2C213&amp;ssl=1\" data-recalc-dims=\"1\" data-lazy-loaded=\"1\" /></p>\n"
                + "<p style=\"text-align: justify;\">     Masyarakat adat Baduy Luar lebih sering mengenakan pakaian adat berwarna hitam. Karena warnanya itu, baju ini diberi nama baju kampret (baju kelelawar). Desain baju adat Banten ini cenderung lebih dinamis. Kita bisa menemukan jahitan mesin, kancing, kantong, selain itu bahan yang digunakan juga tidak terpaku harus berupa kapas murni. Ciri khas lain yang dimiliki pakaian adat Baduy Luar adalah adanya ikat kepala warna biru tua bercorak batik.</p>\n"
                + "<p style=\"text-align: center;\"><img class=\"size-medium wp-image-5231 aligncenter jetpack-lazy-image td-animation-stack-type0-1 jetpack-lazy-image--handled\" src=\"http://localhost/tugas/baju5.jpg\" sizes=\"(max-width: 300px) 100vw, 300px\"alt=\"\" width=\"300\" height=\"225\" data-attachment-id=\"5231\" data-permalink=\"https://centralnews.co.id/2017/07/21/pakaian-adat-banten-yang-perlu-anda-diketahui/wanita-baduy-luar/\" data-orig-file=\"https://i1.wp.com/centralnews.co.id/wp-content/uploads/2017/07/wanita-baduy-luar.jpg?fit=320%2C240&amp;ssl=1\" data-orig-size=\"320,240\" data-comments-opened=\"1\" data-image-meta=\"{&quot;aperture&quot;:&quot;0&quot;,&quot;credit&quot;:&quot;Picasa&quot;,&quot;camera&quot;:&quot;&quot;,&quot;caption&quot;:&quot;&quot;,&quot;created_timestamp&quot;:&quot;0&quot;,&quot;copyright&quot;:&quot;&quot;,&quot;focal_length&quot;:&quot;0&quot;,&quot;iso&quot;:&quot;0&quot;,&quot;shutter_speed&quot;:&quot;0&quot;,&quot;title&quot;:&quot;&quot;,&quot;orientation&quot;:&quot;0&quot;}\" data-image-title=\"wanita baduy luar\" data-image-description=\"\" data-medium-file=\"https://i1.wp.com/centralnews.co.id/wp-content/uploads/2017/07/wanita-baduy-luar.jpg?fit=300%2C225&amp;ssl=1\" data-large-file=\"https://i1.wp.com/centralnews.co.id/wp-content/uploads/2017/07/wanita-baduy-luar.jpg?fit=320%2C240&amp;ssl=1\" data-recalc-dims=\"1\" data-lazy-loaded=\"1\" /></p>\n"
                + "<p style=\"text-align: justify;\">     Untuk pakaian kaum wanita, suku Baduy Dalam maupun Baduy Luar tidak terlalu mempunyai perbedaan yang mencolok. Corak Kain sarung atau kain wanita hampir sama coraknya, yaitu dasar hitam dengan garis-garis putih, sedangkan selendang berwana putih, biru, yang dipadukan dengan warna merah. <strong><em>(ani)</em></strong></p>");

    }

    @FXML
    private void handleBtnExit(ActionEvent event) {
        Stage myStage = (Stage) btnExit.getScene().getWindow();
        myStage.close();
    }

    @FXML
    private void handleBtnAbout(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("about.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.setResizable(false);
        stage.show();

    }

}
