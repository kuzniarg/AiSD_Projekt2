/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Struktury.BazaMiast;
import Struktury.Miasto;
import aisd_projekt2.Dijkstra;

/**
 *
 * @author kuzniarg
 */
public class OknoGlowne extends javax.swing.JFrame {

    private BazaMiast baza = new BazaMiast();
    private OknoWybierzN oknoWyboruN = new OknoWybierzN(baza);

    public OknoGlowne() {
        initComponents();
        init();
    }

    private void init() {

        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRysuj = new GUI.OknoRysuj();
        przyciskRysowania = new javax.swing.JButton();
        przyciskGeneracjiDanych = new javax.swing.JButton();
        przyciskLicz = new javax.swing.JButton();
        poleSkad = new javax.swing.JTextField();
        poleDokad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AiSD Projekt 2");

        javax.swing.GroupLayout panelRysujLayout = new javax.swing.GroupLayout(panelRysuj);
        panelRysuj.setLayout(panelRysujLayout);
        panelRysujLayout.setHorizontalGroup(
            panelRysujLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        panelRysujLayout.setVerticalGroup(
            panelRysujLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        przyciskRysowania.setText("Rysuj");
        przyciskRysowania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskRysowaniaActionPerformed(evt);
            }
        });

        przyciskGeneracjiDanych.setText("Generuj dane");
        przyciskGeneracjiDanych.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskGeneracjiDanychActionPerformed(evt);
            }
        });

        przyciskLicz.setText("Wyznacz Trasę");
        przyciskLicz.setEnabled(false);
        przyciskLicz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przyciskLiczActionPerformed(evt);
            }
        });

        poleSkad.setText("Początek");
        poleSkad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poleSkadMouseClicked(evt);
            }
        });
        poleSkad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poleSkadActionPerformed(evt);
            }
        });

        poleDokad.setText("Koniec");
        poleDokad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poleDokadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panelRysuj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(przyciskGeneracjiDanych, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(przyciskRysowania, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(poleDokad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(poleSkad)
                    .addComponent(przyciskLicz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(przyciskRysowania)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(przyciskGeneracjiDanych)
                        .addGap(13, 13, 13)
                        .addComponent(poleSkad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(poleDokad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(przyciskLicz)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelRysuj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void przyciskRysowaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskRysowaniaActionPerformed
        panelRysuj.rysuj(baza);
        przyciskLicz.setEnabled(true);
    }//GEN-LAST:event_przyciskRysowaniaActionPerformed

    private void przyciskGeneracjiDanychActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskGeneracjiDanychActionPerformed
        oknoWyboruN.setVisible(true);
    }//GEN-LAST:event_przyciskGeneracjiDanychActionPerformed

    public int wynik[];
    private void przyciskLiczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przyciskLiczActionPerformed
        wynik = new int[baza.getN()];
        Dijkstra algo = new Dijkstra();

        int poczatek = Integer.parseInt(poleSkad.getText());

        wynik = algo.Dijktra(baza, poczatek);

        algo.Czas(wynik, baza);

        int trasa = Integer.parseInt(poleDokad.getText());
        while (trasa != 0) {
            int stara = trasa;
            trasa = wynik[stara];
            if (trasa != 0) {
                this.panelRysuj.zaznaczDroge(stara, trasa);
            } else {
                this.panelRysuj.zaznaczDroge(stara, poczatek);
            }
        }

        Miasto pom;
        pom = baza.getMiasto(0);
        baza.getMiasta()[0] = baza.getMiasta()[poczatek];
        baza.getMiasta()[poczatek] = pom;

    }//GEN-LAST:event_przyciskLiczActionPerformed

    private void poleSkadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poleSkadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poleSkadActionPerformed

    private void poleSkadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poleSkadMouseClicked
        poleSkad.setText(null);
    }//GEN-LAST:event_poleSkadMouseClicked

    private void poleDokadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poleDokadMouseClicked
        poleDokad.setText(null);
    }//GEN-LAST:event_poleDokadMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.OknoRysuj panelRysuj;
    private javax.swing.JTextField poleDokad;
    private javax.swing.JTextField poleSkad;
    private javax.swing.JButton przyciskGeneracjiDanych;
    private javax.swing.JButton przyciskLicz;
    private javax.swing.JButton przyciskRysowania;
    // End of variables declaration//GEN-END:variables
}
