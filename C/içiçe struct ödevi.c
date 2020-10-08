#include <stdio.h>
#include <stdlib.h>
#include<locale.h>

struct is{
	int maas;
	int mesai;
	int izin;
};
struct personel{
	 char isim[50];
	 int cocuk_sayisi;
	 struct is maas;
};


int main() 
{
int i,x, zmaas=0 ;
 setlocale(LC_ALL,"Turkish");
 printf ("Kac kisi icin islem yapacaksiniz: \n");
 scanf("%d",&x);
  struct personel kisi [x];	
	for(i=0;i<x;i++)
	{
	   printf("Calisan ismi giriniz :\n");
	   scanf("%s",&kisi[i].isim);
	   printf("Calisan cocuk sayisini giriniz :\n");
	   	scanf("%d",& kisi[i].cocuk_sayisi);
	   	printf("Calisan maaasini giriniz :\n");
	   	scanf("%d",& kisi[i].maas.maas);
	   	printf("Calisan mesai saatini giriniz :\n");
	   	scanf("%d",& kisi[i].maas.mesai);
	   	printf("Calisan bir ay icindeki izinli oldugu gun sayisini giriniz :\n");
	   	scanf("%d",& kisi[i].maas.izin);
	
	}
	
	/*  Cocuk sayisi 1=%7 zam cocuk sayisi 2=%15 3 ve uzeri=%20 zam verilecek ayrica mesai icin
	5/10 saat arasi mesai=100 tl 11/15 arasi mesaiye 200 tl 15 ve uzeri mesai saatinede 300 tl ek  yapilacak maasa ancak
	kisi o ay iserisinde 7 gunden fazla izin almissa mesai icin ek para verilmeyecek */
	
	if(kisi[i].cocuk_sayisi==1)// 1 cocuk icin maas hesaplama
	    {	
		    zmaas=kisi[i].maas.maas+(kisi[i].cocuk_sayisi*0.07);
		    
			if(kisi[i].maas.izin<7)// eger bir ay icinde yedi gunden az ise �al��t�r
		   {	             
	        	if(kisi[i].maas.mesai>4&&kisi[i].maas.mesai<10)
		        {
		        zmaas=kisi[i].maas.maas+100;
	        	}
	             else if(kisi[i].maas.mesai>9&&kisi[i].maas.mesai<15)
	             {
				  zmaas=kisi[i].maas.maas+200;
				 }
				  else if(kisi[i].maas.mesai>14)
	             {
				  zmaas=kisi[i].maas.maas+300;
				 }
				
	    	}	
				else
			{
				printf("ki�i yedi g�nden fazla izinli oldu�undan mesai �cretleri hesaplammam��t�r ��nk� biz adi bir �irketiz ");
			} 
		}
		
			if(kisi[i].cocuk_sayisi==2) // iki �ocuk i�in maa� hesaplama
	    {	
		     zmaas=kisi[i].maas.maas+(kisi[i].cocuk_sayisi*0.15);// maa� hesaplama
		    
			if(kisi[i].maas.izin<7)// bir ayl�k mesai kontrol� 
		   {	             
	        	if(kisi[i].maas.mesai>4&&kisi[i].maas.mesai<10)
		        {
		        	 zmaas=kisi[i].maas.maas+100;
	        	}
	             else if(kisi[i].maas.mesai>9&&kisi[i].maas.mesai<16)
	             {
				 zmaas= kisi[i].maas.maas+200;
				 }
				  else if(kisi[i].maas.mesai>14)
	             {
				  zmaas=kisi[i].maas.maas+300;
				 }
				
	    	}
				else
			{
				printf("ki�i yedi g�nden fazla izinli oldu�undan mesai �cretleri hesaplammam��t�r ��nk� biz adi bir �irketiz ");
			}	 
		}
	
	
			if(kisi[i].cocuk_sayisi>2) // ��  �ocuk i�in maa� hesaplama
	    {	
		   zmaas=kisi[i].maas.maas+(kisi[i].cocuk_sayisi*0.20);// maa� hesaplama
		    
			if(kisi[i].maas.izin<7)// bir ayl�k mesai kontrol� 
		   {	             
	        	if(kisi[i].maas.mesai>4 && kisi[i].maas.mesai<10)
		        {
		        	 zmaas=kisi[i].maas.maas+100;
	        	}
	             else if(kisi[i].maas.mesai>9 && kisi[i].maas.mesai<15)
	             {
				  zmaas=	kisi[i].maas.maas+=200;
				 }
				  else if(kisi[i].maas.mesai > 14)
	             {
				  zmaas=kisi[i].maas.maas+300;
				 }
				
	    	}
			else
			{
				printf("ki�i yedi g�nden fazla izinli oldu�undan mesai �cretleri hesaplammam��t�r ��nk� biz adi bir �irketiz ");
			}	 
		}
		
	printf("----------�ALI�ANLARIN B�LG�LER�----------\n");
	for (i=0;i<x;i++)
	{
		printf("%d. ki�inin ad�:%s\n�ocuk say�s�=%d\nizinli oldu�u g�n =%d\nayl�k mesai saati=%d\n�al��an�n zam miktarı=%d\n", i+1,kisi[i].isim,kisi[i].cocuk_sayisi,kisi[i].maas.izin,kisi[i].maas.mesai,zmaas);
		
	}
	
	return 0;
}



























