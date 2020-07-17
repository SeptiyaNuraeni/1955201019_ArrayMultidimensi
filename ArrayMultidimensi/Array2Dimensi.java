/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayMultidimensi;

import javax.swing.JOptionPane;


public class Array2Dimensi {
    public static void main(String[] args) {
       
        System.out.println("ARRAY 2 dimensi untuk String");
        System.out.println("<><><>Data Mahasantri PP MU<><><>");
        String Mahasantri[][] = {{"01", "Sofi Nasiroh"}, {"02", "Umi Latifatuz Zahra"}, {"03", "Isna Yumrotun"},{"04", "Rofiatus Sofia"},{"05", "Khoir"},{"06", "Nafi"},{"07", "Hamimi"},{"08", "M.Bahrul Lutja"},{"09", "Hamid"},{"10", "Bukhori"}};
       
         
        for (int i = 0; i < Mahasantri.length; i++) {
            for (int j = 0; j < Mahasantri[0].length; j++) {
                System.out.print(Mahasantri[i][j] + " ");
            }
            System.out.println(" ");
        }
        String cari = JOptionPane.showInputDialog(null,"  Cari Data Mahasantri Berdasarkan NO urut");
        for (int i =0; i< Mahasantri.length; i++ ){
            for (int j =0; j < Mahasantri[0].length; j++){
                if(Mahasantri[i][j].equals(cari)){
                    JOptionPane.showMessageDialog(null, "Mahasantri dengan Nomor Urutan " + cari + " Ditemukan bernama " + Mahasantri[i][j+1]);
                }
                System.out.print(Mahasantri[i][j] + " ");
            }
            System.out.println(" ");
        }
          for (int i = 0; i < Mahasantri.length; i++) {
            for (int j = 0; j < Mahasantri[0].length; j++) {
                System.out.print(Mahasantri[i][j] + " ");
            }
            System.out.println(" ");
          }
    
        }
    }

