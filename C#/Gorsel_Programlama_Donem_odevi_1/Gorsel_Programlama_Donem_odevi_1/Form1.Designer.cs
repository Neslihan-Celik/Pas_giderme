namespace Gorsel_Programlama_Donem_odevi_1
{
    partial class form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(form1));
            this.kayit = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.girisDegerAlma = new System.Windows.Forms.TextBox();
            this.yaziIlkHal = new System.Windows.Forms.Label();
            this.sonucEkrani = new System.Windows.Forms.Label();
            this.secenek = new System.Windows.Forms.ComboBox();
            this.yaziAciklama = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.YaziSayi = new System.Windows.Forms.Label();
            this.YaziMetin = new System.Windows.Forms.Label();
            this.metinIslem2 = new System.Windows.Forms.TextBox();
            this.metinIslem = new System.Windows.Forms.TextBox();
            this.kayitYazdir = new System.Windows.Forms.Label();
            this.islem = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.label4 = new System.Windows.Forms.Label();
            this.metinArama = new System.Windows.Forms.TextBox();
            this.temizle = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.SuspendLayout();
            // 
            // kayit
            // 
            this.kayit.AutoEllipsis = true;
            this.kayit.BackColor = System.Drawing.Color.GhostWhite;
            this.kayit.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.kayit.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.kayit.Location = new System.Drawing.Point(253, 422);
            this.kayit.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.kayit.Name = "kayit";
            this.kayit.Size = new System.Drawing.Size(170, 51);
            this.kayit.TabIndex = 1;
            this.kayit.Text = "Kaydet";
            this.kayit.UseVisualStyleBackColor = false;
            this.kayit.Click += new System.EventHandler(this.kayit_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.BackColor = System.Drawing.Color.White;
            this.label1.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.label1.Location = new System.Drawing.Point(49, 43);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(137, 22);
            this.label1.TabIndex = 2;
            this.label1.Text = "Yazı giriş ekranı ";
            // 
            // girisDegerAlma
            // 
            this.girisDegerAlma.Location = new System.Drawing.Point(49, 69);
            this.girisDegerAlma.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.girisDegerAlma.Name = "girisDegerAlma";
            this.girisDegerAlma.Size = new System.Drawing.Size(374, 28);
            this.girisDegerAlma.TabIndex = 3;
            this.girisDegerAlma.TextChanged += new System.EventHandler(this.girisDegerAlma_TextChanged);
            // 
            // yaziIlkHal
            // 
            this.yaziIlkHal.BackColor = System.Drawing.Color.White;
            this.yaziIlkHal.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.yaziIlkHal.Location = new System.Drawing.Point(529, 63);
            this.yaziIlkHal.Name = "yaziIlkHal";
            this.yaziIlkHal.Size = new System.Drawing.Size(431, 34);
            this.yaziIlkHal.TabIndex = 4;
            this.yaziIlkHal.Text = " ";
            // 
            // sonucEkrani
            // 
            this.sonucEkrani.BackColor = System.Drawing.Color.White;
            this.sonucEkrani.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.sonucEkrani.Location = new System.Drawing.Point(529, 136);
            this.sonucEkrani.Name = "sonucEkrani";
            this.sonucEkrani.Size = new System.Drawing.Size(431, 46);
            this.sonucEkrani.TabIndex = 5;
            // 
            // secenek
            // 
            this.secenek.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.secenek.FormattingEnabled = true;
            this.secenek.Items.AddRange(new object[] {
            "Büyük harfe çevir",
            "Küçük harfe çevir",
            "ilk karşılaşılan metnin yerini bul",
            "son karşılaşılan metnin yerini bul",
            "Değer değiştir",
            "Metni sil",
            "Parçasını al",
            "Metni tersten yazdır",
            "Metnin  karakter sayısı yazdır",
            "Metnin  kelime sayısı yazdır"});
            this.secenek.Location = new System.Drawing.Point(49, 119);
            this.secenek.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.secenek.Name = "secenek";
            this.secenek.Size = new System.Drawing.Size(374, 28);
            this.secenek.TabIndex = 7;
            this.secenek.Text = "İşlem seç";
            this.secenek.SelectedIndexChanged += new System.EventHandler(this.secenek_SelectedIndexChanged);
            // 
            // yaziAciklama
            // 
            this.yaziAciklama.BackColor = System.Drawing.Color.White;
            this.yaziAciklama.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.yaziAciklama.ForeColor = System.Drawing.Color.Red;
            this.yaziAciklama.Location = new System.Drawing.Point(47, 164);
            this.yaziAciklama.Name = "yaziAciklama";
            this.yaziAciklama.Size = new System.Drawing.Size(374, 78);
            this.yaziAciklama.TabIndex = 8;
            this.yaziAciklama.Text = "Açıklama : Lütfen yazı giriş ekranına yazı girip işlem seçin seçilen işeme göre a" +
    "çıklamalar değişecektir.";
            // 
            // label6
            // 
            this.label6.BackColor = System.Drawing.Color.White;
            this.label6.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.label6.Location = new System.Drawing.Point(529, 192);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(143, 21);
            this.label6.TabIndex = 9;
            this.label6.Text = "Kayıt Ekranı";
            // 
            // groupBox1
            // 
            this.groupBox1.BackColor = System.Drawing.Color.White;
            this.groupBox1.Controls.Add(this.YaziSayi);
            this.groupBox1.Controls.Add(this.YaziMetin);
            this.groupBox1.Controls.Add(this.metinIslem2);
            this.groupBox1.Controls.Add(this.metinIslem);
            this.groupBox1.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.groupBox1.Location = new System.Drawing.Point(64, 252);
            this.groupBox1.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Padding = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.groupBox1.Size = new System.Drawing.Size(171, 145);
            this.groupBox1.TabIndex = 10;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Prametre Ekranı ";
            // 
            // YaziSayi
            // 
            this.YaziSayi.AutoSize = true;
            this.YaziSayi.Location = new System.Drawing.Point(9, 79);
            this.YaziSayi.Name = "YaziSayi";
            this.YaziSayi.Size = new System.Drawing.Size(101, 20);
            this.YaziSayi.TabIndex = 15;
            this.YaziSayi.Text = "2.Parametre";
            // 
            // YaziMetin
            // 
            this.YaziMetin.AutoSize = true;
            this.YaziMetin.Location = new System.Drawing.Point(9, 22);
            this.YaziMetin.Name = "YaziMetin";
            this.YaziMetin.Size = new System.Drawing.Size(101, 20);
            this.YaziMetin.TabIndex = 14;
            this.YaziMetin.Text = "1.Parametre";
            // 
            // metinIslem2
            // 
            this.metinIslem2.Location = new System.Drawing.Point(13, 104);
            this.metinIslem2.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.metinIslem2.Name = "metinIslem2";
            this.metinIslem2.Size = new System.Drawing.Size(142, 28);
            this.metinIslem2.TabIndex = 12;
            this.metinIslem2.TextChanged += new System.EventHandler(this.metinIslem2_TextChanged);
            // 
            // metinIslem
            // 
            this.metinIslem.Location = new System.Drawing.Point(14, 47);
            this.metinIslem.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.metinIslem.Name = "metinIslem";
            this.metinIslem.Size = new System.Drawing.Size(141, 28);
            this.metinIslem.TabIndex = 11;
            this.metinIslem.TextChanged += new System.EventHandler(this.metinIslem_TextChanged);
            // 
            // kayitYazdir
            // 
            this.kayitYazdir.BackColor = System.Drawing.Color.White;
            this.kayitYazdir.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.kayitYazdir.Location = new System.Drawing.Point(529, 213);
            this.kayitYazdir.Name = "kayitYazdir";
            this.kayitYazdir.Size = new System.Drawing.Size(431, 369);
            this.kayitYazdir.TabIndex = 11;
            // 
            // islem
            // 
            this.islem.AutoEllipsis = true;
            this.islem.BackColor = System.Drawing.Color.GhostWhite;
            this.islem.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.islem.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.islem.Location = new System.Drawing.Point(47, 422);
            this.islem.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.islem.Name = "islem";
            this.islem.Size = new System.Drawing.Size(170, 51);
            this.islem.TabIndex = 13;
            this.islem.Text = "İşlem yap";
            this.islem.UseVisualStyleBackColor = false;
            this.islem.Click += new System.EventHandler(this.islem_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.BackColor = System.Drawing.Color.White;
            this.label2.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.label2.Location = new System.Drawing.Point(529, 114);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(112, 22);
            this.label2.TabIndex = 14;
            this.label2.Text = "İşlem Sonucu";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.BackColor = System.Drawing.Color.White;
            this.label3.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.label3.Location = new System.Drawing.Point(529, 41);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(96, 22);
            this.label3.TabIndex = 15;
            this.label3.Text = "Orjinal yazı";
            // 
            // groupBox2
            // 
            this.groupBox2.BackColor = System.Drawing.Color.White;
            this.groupBox2.Controls.Add(this.label4);
            this.groupBox2.Controls.Add(this.metinArama);
            this.groupBox2.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.groupBox2.Location = new System.Drawing.Point(241, 264);
            this.groupBox2.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Padding = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.groupBox2.Size = new System.Drawing.Size(180, 133);
            this.groupBox2.TabIndex = 17;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Prametre Ekranı ";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(38, 35);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(114, 20);
            this.label4.TabIndex = 16;
            this.label4.Text = "Arama metni :";
            // 
            // metinArama
            // 
            this.metinArama.Location = new System.Drawing.Point(22, 77);
            this.metinArama.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.metinArama.Name = "metinArama";
            this.metinArama.Size = new System.Drawing.Size(142, 28);
            this.metinArama.TabIndex = 13;
            this.metinArama.TextChanged += new System.EventHandler(this.metinArama_TextChanged);
            // 
            // temizle
            // 
            this.temizle.AutoEllipsis = true;
            this.temizle.BackColor = System.Drawing.Color.GhostWhite;
            this.temizle.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.temizle.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.temizle.Location = new System.Drawing.Point(111, 500);
            this.temizle.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.temizle.Name = "temizle";
            this.temizle.Size = new System.Drawing.Size(222, 51);
            this.temizle.TabIndex = 18;
            this.temizle.Text = "Sıfırla";
            this.temizle.UseVisualStyleBackColor = false;
            this.temizle.Click += new System.EventHandler(this.temizle_Click);
            // 
            // form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(10F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Azure;
            this.ClientSize = new System.Drawing.Size(1000, 614);
            this.Controls.Add(this.temizle);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.islem);
            this.Controls.Add(this.kayitYazdir);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.yaziAciklama);
            this.Controls.Add(this.secenek);
            this.Controls.Add(this.sonucEkrani);
            this.Controls.Add(this.yaziIlkHal);
            this.Controls.Add(this.girisDegerAlma);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.kayit);
            this.Font = new System.Drawing.Font("Arial Unicode MS", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ForeColor = System.Drawing.SystemColors.Desktop;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Margin = new System.Windows.Forms.Padding(3, 4, 3, 4);
            this.Name = "form1";
            this.Text = "Cümle değişim formu";
            this.Load += new System.EventHandler(this.form1_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Button kayit;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox girisDegerAlma;
        private System.Windows.Forms.Label yaziIlkHal;
        private System.Windows.Forms.Label sonucEkrani;
        private System.Windows.Forms.ComboBox secenek;
        private System.Windows.Forms.Label yaziAciklama;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Label YaziSayi;
        private System.Windows.Forms.Label YaziMetin;
        private System.Windows.Forms.TextBox metinIslem2;
        private System.Windows.Forms.TextBox metinIslem;
        private System.Windows.Forms.Label kayitYazdir;
        private System.Windows.Forms.Button islem;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox metinArama;
        private System.Windows.Forms.Button temizle;
    }
}

