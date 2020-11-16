using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Gorsel_Odev_1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
         int x=0 ;
        String yazi="", arama="", k = "";// global değişkenler
        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            x= comboBox1.SelectedIndex;//burada comboboxtaki seçeneğin indisini değişkene attık
           
        }

       

        private void button1_Click(object sender, EventArgs e)// kaydet butonu
        {
            if (x == 0)// büyük harf
            {
                yazi = textBox1.Text;// yazıyı giriş textboksuna eşitledik
                label7.Text = yazi;//ilk halini karşılaştırmak için alta tekrar yazdık
                label4.Text = yazi.ToUpper();// sonuç kısmında büyütme yaptık
            }
            else if (x == 1)// Küçük harf
            {
                yazi = textBox1.Text;
                label7.Text = yazi;
                label4.Text = yazi.ToLower();
            }
            else if (x == 2)//aranan metin baştan index
            {
                yazi = textBox1.Text;
                label7.Text = yazi;
                k = yazi.IndexOf(textBox4.Text).ToString();
                label4.Text = "Aranan kelimenin indexi : " +k;

            
                
            }
            else if (x == 3) //aranan metin sondan index
            {
                yazi = textBox1.Text;
                label7.Text = yazi;
                arama = textBox4.Text;
                k = yazi.LastIndexOf(textBox4.Text).ToString();
                label4.Text = "Aranan kelimenin indexi : " + k ; 
              
            }
            else if (x == 4)//Değer değiş
            {
                yazi = textBox1.Text;
                label7.Text = yazi;
                label4.Text = yazi.Replace(textBox2.Text, textBox3.Text);// yer değiştirme yaptık veriler arasında
            }

            else if (x == 5)// sil
            {
                yazi = textBox1.Text;
                label7.Text = yazi;
                String yazix="",n="";// remove için int değer lazım başlangıç ve bitiş değeri onları convert ile verdik
                n = textBox3.Text;
                if (n == "") 
                {
                    n = "0";
              
                }
                yazix = yazi.Substring(Convert.ToInt32(yazi.IndexOf(textBox4.Text)), Convert.ToInt32(n));
                if(yazi==yazix)
                {
                    label4.Text = yazi + " \nİkinci parametreyi girmediniz ";
                }
                else
                {
                    label4.Text = yazix;// yeni değişken kullandık bunun için 
                }
                
            }
            else if (x == 6)// parça al
            {
                yazi = textBox1.Text;
                label7.Text = yazi;
                String yaziy="", s="";
                s = textBox3.Text;
                if (s == "")
                {// kontrol ettik ikinci parametre boş mu diye
                    s = "0";  
                }
                yaziy = yazi.Remove(Convert.ToInt32(yazi.IndexOf(textBox4.Text)), Convert.ToInt32(s));  
                if(yazi==yaziy)
                {
                    label4.Text = yazi + " \nİkinci parametreyi girmediniz ";
                }
                else
                {
                    label4.Text = yaziy;
                }
                
            }
        }

        private void Form1_Load(object sender, EventArgs e)/*bunkarı silince hata alıyorum nasıl halledeceğimi
                                                            * henüz bilmiyorum ama bunlar hgereksiz şuan kullanılmkyor=)*/
        {
           
        }

        private void button2_Click(object sender, EventArgs e)// kaydet butonu 
        {
            listView1.Items.Add(label4.Text);// listviewe kayıt etti
            textBox1.Text = "";// kayıttan sonra ekran temizlendi
            label7.Text = "";
            label4.Text = "";

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }
    }
}
