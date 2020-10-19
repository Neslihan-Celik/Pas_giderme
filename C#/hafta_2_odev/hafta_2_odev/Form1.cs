using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace hafta_2_odev
{
    public partial class h2_Odev : Form
    {
        public h2_Odev()
        {
            InitializeComponent();
        }
        int x = 5, y = 10, z = 2;
       


        private void label1_Click(object sender, EventArgs e)
        {
            
        }

        private void label2_Click(object sender, EventArgs e)
        {
            
        }

        private void label3_Click(object sender, EventArgs e)
        {
            
        }

        private void label4_Click(object sender, EventArgs e)
        {

        }


        private void label5_Click(object sender, EventArgs e)
        {

        }


        private void h2_Odev_Load(object sender, EventArgs e)
        {
            Console.WriteLine("\nDeğişkenler :\nx = 5\ny = 10\nz = 2");
            Console.WriteLine("\n2 sonucunu elde etmek için kullanılan formül :\n((z*y)/(z*x)) = "+ ((z * y) / (z * x)));
            Console.WriteLine("\n25 sonucunu elde etmek için kullanılan formül :\n((z*y)+x) = " + ((z * y) + x));
            Console.WriteLine("\n1 sonucunu elde etmek için kullanılan formül :\n(x%(z*z) = " + (x % (z * z)));
            Console.WriteLine("\n0 sonucunu elde etmek için kullanılan formül :\n(y-(x*z)) = " + (y - (x * z)));
            Console.WriteLine("\n\nSistem çıktıları :\n\n");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label1.Text = "((z*y)/(z*x)) = 2";
            label2.Text = "((z*y)+x) = 25";
            label3.Text = "(x%(z*z) = 1";
            label4.Text = "(y-(x*z)) = 0";
            Console.WriteLine("Tüm formülleri gösterdin !");
        }
        private void button2_Click(object sender, EventArgs e)
        {
            label1.Text= "2";
            label2.Text = "25";
            label3.Text = "1";
            label4.Text = "0";
            Console.WriteLine("Tüm Formülleri gizledin !");
        }

        private void tus2_Click(object sender, EventArgs e)
        {
            label1.Text = "((z*y)/(z*x)) = 2";
            Console.WriteLine("2 sonucu için formül gösterdin !");
        }

        private void tus25_Click(object sender, EventArgs e)
        {
            label2.Text = "((z*y)+x) = 25";
            Console.WriteLine("25 sonucu için formül gösterdin !");
        }

        private void tus1_Click(object sender, EventArgs e)
        {
            label3.Text = "(x%(z*z) = 1";
            Console.WriteLine("1 sonucu için formül gösterdin !");
        }

        private void tus0_Click(object sender, EventArgs e)
        {
            label4.Text = "(y-(x*z)) = 0";
            Console.WriteLine("0 sonucu için formül gösterdin !");
        }
    }
}
