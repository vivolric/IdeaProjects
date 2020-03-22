import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class J6_Looping
{
    public static void main(String[] args)
    {
        // while loop help you to repeat processes as many times as you want
        int a = 1;
        System.out.println("dongu 1 den 10 a kadar baslasin");
        while (a<=10)
        {
            System.out.println("tekrar number " + a);
            a++;
        }
        System.out.println("Dongu Tamamlandi");
        int b=0;
        System.out.println("dongu 1 den 10 a kadar cifter cifter");
        while (b<=10)
        {
            System.out.println("current value " + b);
            b+=2;                                                       // artis sayisi 2
        }
        System.out.println("cifter dongu tamamlandi");
        int c=0;
        System.out.println("dongu 1 den 10 a kadar ucer li");
        while (c<=10)
        {
            System.out.println("current value " + c);
            c+=3;                                                       // artis sayisi 3
        }
        System.out.println("ucerli dongu tamamlandi");

        // FAKTORIYEL HESABI

        System.out.println("Faktoriyel Hesaplamaya Hosgeldiniz \n lutfen faktoriyelini hesaplamak istediginiz sayiyi girin ");
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int e=1;
        int result = 1;
        while (e<=d)
        {
            System.out.println(result=result*(e));
            e+=1;
        }





        //gfdhfghgfhgfhjfh
        // N E KADAR OLAN SAYILARIN TOPLAMININ HESABI
        System.out.println("Faktoriyel Hesaplamaya Hosgeldiniz \n lutfen faktoriyelini hesaplamak istediginiz sayiyi girin ");
        Scanner input2 = new Scanner(System.in);
        int d2 = input.nextInt();
        int e2=1;
        int result2 = 0;
        while (e2<=d2)
        {
            System.out.println(result2=result2+e2);
            e2+=1;
        }

    }
}
