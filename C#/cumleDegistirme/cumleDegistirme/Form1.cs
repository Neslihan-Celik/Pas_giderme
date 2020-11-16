using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace cumleDegistirme
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        String cumle = " ";
      
        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            label3.BackColor = Color.White;
            cumle = textBox1.Text;
            label3.Text = cumle.ToUpper();
        }
        private void button2_Click(object sender, EventArgs e)
        {
            label3.BackColor = Color.White;
            cumle = textBox1.Text;
            label3.Text = cumle.ToLower();
        }
        private void button3_Click(object sender, EventArgs e)
        {
            label3.BackColor = Color.White;
            cumle = textBox1.Text;
            string tersCumle = "";
            for (int i = cumle.Length - 1; i >= 0; i--)
            {
                tersCumle += cumle.Substring(i, 1);
            }
             label3.Text =tersCumle ;
            
    }
    private void button4_Click(object sender, EventArgs e)
        {
            label3.BackColor = Color.White;
            cumle = textBox1.Text;
            label3.BackColor =Color.Blue;
            label3.Text = cumle;
        }
        private void button5_Click(object sender, EventArgs e)
        {
            label3.BackColor = Color.White;
            cumle = textBox1.Text;
            label3.BackColor = Color.Red;
            label3.Text = cumle;
        }
        private void button6_Click(object sender, EventArgs e)
        {   
            textBox1.Text="";
            label3.Text = "";
        }
    }
}
