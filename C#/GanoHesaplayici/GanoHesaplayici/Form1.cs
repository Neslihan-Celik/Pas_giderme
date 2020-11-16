using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GanoHesaplayici
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
         double sayi1,sayi2,sonuc;
        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)// Temizle butonu
        {
            textBox1.Text="";
            textBox2.Text="";
            label4.Text="";
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)// Hesapla butonu
        {
            if (textBox1.Text == "" )
            {
                textBox1.Text = "0";
            }
            else
            {
                sayi1 = Convert.ToDouble(textBox1.Text);
            }
            if (textBox2.Text == "")
            {
                textBox2.Text = "0";
            }
            else
            {
                sayi2 = Convert.ToDouble(textBox2.Text);
            }

            sonuc = (sayi1*0.4 )+(sayi2*0.6);

            if (sonuc < 33 && sonuc >= 0)//FF
            {
                label4.Text = ("\nPuanınız : " + Convert.ToString(sonuc) + "\nHarf Notunuz : FF\nOrtalama : 0.00\nÜzgünüz kaldınız !\n");

            }

            else if (sonuc < 40 && sonuc >32)//DD
            {
                label4.Text = ("\nPuanınız : " + Convert.ToString(sonuc) + "\nHarf Notunuz : DD\nOrtalama : 1.00\n");

            }

            else if (sonuc < 50 && sonuc > 39)//DC
            {
                label4.Text = ("\nPuanınız : " + Convert.ToString(sonuc) + "\nHarf Notunuz : DC\nOrtalama : 1.30\n");

            }


           else if (sonuc < 50 && sonuc > 45)//CD
            {
                label4.Text = ("\nPuanınız : " + Convert.ToString(sonuc) + "\nHarf Notunuz : CD\nOrtalama : 1.70\n");

            }


            else if (sonuc < 56 && sonuc > 49)//CC
            {
                label4.Text = ("\nPuanınız : " + Convert.ToString(sonuc) + "\nHarf Notunuz : CC\nOrtalama : 2.00\n");

            }


            else if (sonuc < 61 && sonuc > 55)//CB
            {
                label4.Text = ("\nPuanınız : " + Convert.ToString(sonuc) + "\nHarf Notunuz : CB\nOrtalama : 2.30\n");

            }

            else if (sonuc < 66 && sonuc > 60)//BC
            {
                label4.Text = ("\nPuanınız : " + Convert.ToString(sonuc) + "\nHarf Notunuz : BC\nOrtalama : 2.70\n");

            }

            else if (sonuc < 71 && sonuc > 65)//BB
            {
                label4.Text = ("\nPuanınız : " + Convert.ToString(sonuc) + "\nHarf Notunuz : BB\nOrtalama : 3.00\n");

            }

            else if (sonuc < 77 && sonuc > 70)//BA
            {
                label4.Text = ("\nPuanınız : " + Convert.ToString(sonuc) + "\nHarf Notunuz : BA\nOrtalama : 3.30\n");

            }

            else if (sonuc < 84 && sonuc > 76)//AB
            {
                label4.Text = ("\nPuanınız : " + Convert.ToString(sonuc) + "\nHarf Notunuz : AB\nOrtalama : 3.70\n");

            }

            else if (sonuc <= 100 && sonuc > 83) //AA
            {
                label4.Text = ("\nPuanınız : " + Convert.ToString(sonuc) + "\nHarf Notunuz : AA\nOrtalama : 4.00\nTebrikler !\n");
            }

            else
            {
                label4.Text = ("\nÜzgünüz hesaplama yapılırken bir sorun oluştu ! ");
            }
        }
    }
    }

