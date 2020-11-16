using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Gorsel_Programlama_Donem_odevi_1
{
    public partial class form1 : Form
    {
        public form1()
        {
            InitializeComponent();
        }

        private void form1_Load(object sender, EventArgs e)
        {
            groupBox1.Visible = false;
            groupBox2.Visible = false;

        }
        String cumle = "", arama="", parametre1="",parametre2="";
        int secim =0;
        private void girisDegerAlma_TextChanged(object sender, EventArgs e)
        {
           cumle= girisDegerAlma.Text;
        }

        private void secenek_SelectedIndexChanged(object sender, EventArgs e)
        {
            secim= secenek.SelectedIndex;
            switch(secim)
                {
                case 0:
                    yaziAciklama.Text = "Bu seçim ile yazı giriş ekranına " +
                        "girilen tüm yazılar büyük harfe çevrilir " +
                        "onaylamak için işlem tuşuna tıklayınız";
                    break;

                case 1:
                    yaziAciklama.Text = "Bu seçim ile yazı giriş ekranına " +
                        "girilen tüm yazılar Küçük harfe çevrilir " +
                        "onaylamak için işlem tuşuna tıklayınız";
                    break;

                case 2:
                    yaziAciklama.Text = "Bu seçim ile yazı giriş ekranına " +
                        "girilen yazı içinde arama yapılır, parametre aşağıdaki ekranlara girilir ve " +
                        " arama sonucunun ilk karşılaşıldığı index sonuç ekranında gösterilir" +
                        " onaylamak için işlem tuşuna tıklayınız";
                    break;

                case 3:
                    yaziAciklama.Text = "Bu seçim ile yazı giriş ekranına " +
                        "girilen yazı içinde arama yapılır, parametreler aşağıdaki ekranlara girilir ve " +
                        "arama sonucunun son karşılaşıldığı index sonuç ekranında gösterilir " +
                        " onaylamak için işlem tuşuna tıklayınız";
                    break;

                case 4:
                    yaziAciklama.Text = "Bu seçim ile yazı giriş ekranına " +
                        "girilen yazı içinde değişiklik yapılır, " +
                        "parametreler aşağıdaki ekranlara girilir " +
                        "onaylamak için işlem tuşuna tıklayınız";
                    break;

                case 5:
                    yaziAciklama.Text = "Bu seçim ile yazı giriş ekranına " +
                        "girilen yazıdan belirlenen  sayı kadar silme işlemi yapılır " +
                         "parametreler aşağıdaki ekranlara girilir " +
                        "onaylamak için işlem tuşuna tıklayınız";
                    break;

                case 6:
                    yaziAciklama.Text = "Bu seçim ile yazı giriş ekranına " +
                        "girilen yazıdan belirlenen  sayı kadar parça alınması sağlanır " +
                         "parametreler aşağıdaki ekranlara girilir " +
                        "onaylamak için işlem tuşuna tıklayınız";
                    break;

                case 7:
                    yaziAciklama.Text = "Bu seçim ile yazı giriş ekranına " +
                        "girilen tüm yazılar tersten yazılır " +
                        "onaylamak için işlem tuşuna tıklayınız";
                    break;

                case 8:
                    yaziAciklama.Text = "Bu seçim ile yazı giriş ekranına " +
                        "girilen yazıların uzunluğu bulunur " +
                        "onaylamak için işlem tuşuna tıklayınız";
                    break;

                case 9:
                    yaziAciklama.Text = "Bu seçim ile yazı giriş ekranına " +
                        "girilen  yazılarda kaç tane kelime olduğu bulunur " +
                        "onaylamak için işlem tuşuna tıklayınız";
                    break;


            }

            if(secim==2|| secim == 3)
            {
                groupBox2.Visible = true;
                groupBox1.Visible = false;
            }
           else if (secim == 4 || secim == 5 || secim == 6)
            {
                groupBox1.Visible = true;
                groupBox2.Visible = false;
            }
            else
            {
                groupBox1.Visible = false;
                groupBox2.Visible = false;
            }
        }

       
        private void islem_Click(object sender, EventArgs e)
        {
            switch (secim)
            {
                case 0://cümlenin tamamını büyük harf yap
                    sonucEkrani.Text = " ";
                    cumle = girisDegerAlma.Text;
                    yaziIlkHal.Text = cumle;
                    sonucEkrani.Text = cumle.ToUpper();
                    break;

                case 1: //cümlenin tamamını küçük harf yap
                    sonucEkrani.Text = " ";
                    cumle = girisDegerAlma.Text;
                    yaziIlkHal.Text = cumle;
                    sonucEkrani.Text = cumle.ToLower();
                    break;

                case 2://Aranan metnin baştan kaçıncı indexte oluşu index
                    sonucEkrani.Text = " ";
                    cumle = girisDegerAlma.Text;
                    yaziIlkHal.Text = cumle;
                    arama = cumle.IndexOf(metinArama.Text).ToString();
                    sonucEkrani.Text = "Aranan metin : " + metinArama.Text + "\nindex numarası : " + arama;
                    break;

                case 3://Aranan metnin sondan kaçıncı indexte oluşu index
                    sonucEkrani.Text = " ";
                    cumle = girisDegerAlma.Text;
                    yaziIlkHal.Text = cumle;

                    arama = cumle.LastIndexOf(metinArama.Text).ToString();
                    sonucEkrani.Text = "Aranan metin : " + metinArama.Text + "\nindex numarası : " + arama;
                    break;

                case 4://Metin değer değiştirme
                    sonucEkrani.Text = " ";
                    cumle = girisDegerAlma.Text;
                    yaziIlkHal.Text = cumle;
                    sonucEkrani.Text = cumle.Replace(parametre1, parametre2);
                    break;

                case 5: //Metin parça sil
                    cumle = girisDegerAlma.Text;
                    yaziIlkHal.Text = cumle;
                    if (parametre2 == "")
                    {
                        parametre2 = "0";
                    }
                    String  kontrol = cumle.Remove(Convert.ToInt32(cumle.IndexOf(parametre1)), Convert.ToInt32(parametre2));
                    if (kontrol == girisDegerAlma.Text)
                    {
                        sonucEkrani.Text = cumle + " \nİkinci parametreyi girmediniz ";
                    }
                    else
                    {
                        sonucEkrani.Text = kontrol;
                    }
                    break;

                case 6://Metin parça al
                    cumle = girisDegerAlma.Text;
                    yaziIlkHal.Text = cumle;
                    if (parametre2 == "")
                    {
                        parametre2 = "0";
                    }
                    kontrol = cumle.Substring(Convert.ToInt32(cumle.IndexOf(parametre1)), Convert.ToInt32(parametre2));
                    if (kontrol == girisDegerAlma.Text)
                    {
                        sonucEkrani.Text = cumle + " \nİkinci parametreyi girmediniz ";
                    }
                    else
                    {
                        sonucEkrani.Text = kontrol;
                    }
                    break;

             

                case 7:// metni ters çevir 
                    cumle = girisDegerAlma.Text;
                    yaziIlkHal.Text = cumle;
                    string tersCumle = "";
                    for (int i = cumle.Length - 1; i >= 0; i--)
                    {
                        tersCumle += cumle.Substring(i, 1);
                    }
                    sonucEkrani.Text = tersCumle;
                    break;

                case 8:// metin karakter sayısı yazdır
                    cumle = girisDegerAlma.Text;
                    yaziIlkHal.Text = cumle;
                    sonucEkrani.Text = "Cümlenin karakter sayısı : " + cumle.Length.ToString();
                    break;

                case 9:// metin kelime sayısı yazdır
                    cumle = girisDegerAlma.Text;
                    yaziIlkHal.Text = cumle;
                    String[] kelimeler;
                    kelimeler = cumle.Split(' ');
                    sonucEkrani.Text = "Kelime sayısı :" + kelimeler.Length+"\n";
                        for (int kelime = 0; kelime < kelimeler.Length; kelime++)
                        {
                        sonucEkrani.Text +=(kelime+1)+". kelime "+kelimeler[kelime]+"  ";
                        }
                    break;


                default :
                    cumle = girisDegerAlma.Text;
                    yaziIlkHal.Text = cumle;
                    sonucEkrani.Text = "seçim yapmadınız !";
                    break;

            }
        }
       
            
        

        private void kayit_Click(object sender, EventArgs e)
        {// kayıttan sonra ekran temizlendi
            yaziAciklama.Text = "Kayıt işlemi yapıldı";
            kayitYazdir.Text+="\n"+ sonucEkrani.Text;
            girisDegerAlma.Text = "";
            yaziIlkHal.Text = "";
            sonucEkrani.Text = "";
            metinArama.Text = "";
            metinIslem.Text = "";
            metinIslem2.Text = "";
            groupBox1.Visible = false;
            groupBox2.Visible = false;
        }

        

        private void temizle_Click(object sender, EventArgs e)
        {// kayıttan sonra ekran temizlendi
            yaziAciklama.Text = "Sıfırlama işlemi yapıldı";
            kayitYazdir.Text = "";
            girisDegerAlma.Text = "";
            yaziIlkHal.Text = "";
            sonucEkrani.Text = "";
            metinArama.Text = "";
            metinIslem.Text = "";
            metinIslem2.Text = "";
            groupBox1.Visible = false;
            groupBox2.Visible = false;
        }

      

        private void metinIslem_TextChanged(object sender, EventArgs e)
        {   
            parametre1 = metinIslem.Text;
        }

        private void metinIslem2_TextChanged(object sender, EventArgs e)
        {
             parametre2 = metinIslem2.Text;
        }

        private void metinArama_TextChanged(object sender, EventArgs e)
        {
            arama = metinArama.Text;
        }

        
    }
}
