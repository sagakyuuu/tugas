package tugas1;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

public class KasirHotel extends javax.swing.JFrame {

    public KasirHotel() {
        initComponents();
    }

    int idNum = 1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        wiliam_metodeBayarInpt = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        wiliam_IDTransaksi_Label = new javax.swing.JLabel();
        wiliam_namaPelangganLabel = new javax.swing.JLabel();
        wiliam_lamaNginapLabel = new javax.swing.JLabel();
        wiliam_jenisKamarLabel = new javax.swing.JLabel();
        wiliam_lamaInapInpt = new javax.swing.JTextField();
        wiliam_namaPelangganInpt = new javax.swing.JTextField();
        wiliam_jenisKamarInpt = new javax.swing.JComboBox<>();
        wiliam_fasilitasInpt = new javax.swing.JComboBox<>();
        wiliam_fasilitasLabel = new javax.swing.JLabel();
        wiliam_metodeBayarLabel = new javax.swing.JLabel();
        wiliam_saldo = new javax.swing.JRadioButton();
        wiliam_eMoney = new javax.swing.JRadioButton();
        wiliam_hargaLabel = new javax.swing.JLabel();
        wiliam_simpanBTN = new javax.swing.JButton();
        wiliam_idTransaksiInpt = new javax.swing.JTextField();
        wiliam_hargaView = new javax.swing.JTextField();
        wiliam_checkHargaBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        wiliam_IDTransaksi_Label1 = new javax.swing.JLabel();
        wiliam_IDTransaksi_Label2 = new javax.swing.JLabel();
        wiliam_IDTransaksi_Label3 = new javax.swing.JLabel();
        wiliam_IDTransaksi_Label4 = new javax.swing.JLabel();
        wiliam_IDTransaksi_Label5 = new javax.swing.JLabel();
        wiliam_hapusBTN = new javax.swing.JButton();
        wiliam_metodeBayarLabel1 = new javax.swing.JLabel();
        wiliam_hargaLabel1 = new javax.swing.JLabel();
        wiliam_idTransaksiView = new javax.swing.JLabel();
        wiliam_namaViews = new javax.swing.JLabel();
        wiliam_lamaNginapView = new javax.swing.JLabel();
        wiliam_jenisKamarView = new javax.swing.JLabel();
        wiliam_fasilitasView = new javax.swing.JLabel();
        wiliam_metodeBayarViews = new javax.swing.JLabel();
        wiliam_hargaViews = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kasir Sewa Hotel");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        wiliam_IDTransaksi_Label.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_IDTransaksi_Label.setText("ID Transaksi");

        wiliam_namaPelangganLabel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_namaPelangganLabel.setText("Nama");

        wiliam_lamaNginapLabel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_lamaNginapLabel.setText("Lama Nginap");

        wiliam_jenisKamarLabel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_jenisKamarLabel.setText("Jenis Kamar");

        wiliam_lamaInapInpt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        wiliam_lamaInapInpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wiliam_lamaInapInptActionPerformed(evt);
            }
        });

        wiliam_namaPelangganInpt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        wiliam_namaPelangganInpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wiliam_namaPelangganInptActionPerformed(evt);
            }
        });

        wiliam_jenisKamarInpt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<---------------PILIH--------------->", "Single Room", "Suite", "Presidential Suite" }));

        wiliam_fasilitasInpt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<---------------PILIH--------------->", "Gym", "Mini Bar", "Brankas Kamar" }));

        wiliam_fasilitasLabel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_fasilitasLabel.setText("Fasilitas+");

        wiliam_metodeBayarLabel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_metodeBayarLabel.setText("Matode Bayar");

        wiliam_metodeBayarInpt.add(wiliam_saldo);
        wiliam_saldo.setText("Saldo");
        wiliam_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wiliam_saldoActionPerformed(evt);
            }
        });

        wiliam_metodeBayarInpt.add(wiliam_eMoney);
        wiliam_eMoney.setText("E-money");

        wiliam_hargaLabel.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_hargaLabel.setText("Harga");

        wiliam_simpanBTN.setText("Simpan");
        wiliam_simpanBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wiliam_simpanBTNActionPerformed(evt);
            }
        });

        wiliam_idTransaksiInpt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        wiliam_idTransaksiInpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wiliam_idTransaksiInptActionPerformed(evt);
            }
        });

        wiliam_hargaView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        wiliam_hargaView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wiliam_hargaViewActionPerformed(evt);
            }
        });

        wiliam_checkHargaBTN.setText("Check");
        wiliam_checkHargaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wiliam_checkHargaBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(wiliam_checkHargaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(wiliam_simpanBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wiliam_namaPelangganLabel)
                            .addComponent(wiliam_lamaNginapLabel)
                            .addComponent(wiliam_jenisKamarLabel)
                            .addComponent(wiliam_IDTransaksi_Label)
                            .addComponent(wiliam_fasilitasLabel))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wiliam_namaPelangganInpt)
                            .addComponent(wiliam_lamaInapInpt)
                            .addComponent(wiliam_jenisKamarInpt, 0, 1, Short.MAX_VALUE)
                            .addComponent(wiliam_fasilitasInpt, 0, 1, Short.MAX_VALUE)
                            .addComponent(wiliam_idTransaksiInpt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wiliam_metodeBayarLabel)
                            .addComponent(wiliam_hargaLabel))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(wiliam_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(wiliam_eMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(wiliam_hargaView, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wiliam_IDTransaksi_Label)
                    .addComponent(wiliam_idTransaksiInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wiliam_namaPelangganInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wiliam_namaPelangganLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wiliam_lamaInapInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wiliam_lamaNginapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wiliam_jenisKamarLabel)
                    .addComponent(wiliam_jenisKamarInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wiliam_fasilitasInpt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wiliam_fasilitasLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wiliam_metodeBayarLabel)
                    .addComponent(wiliam_saldo)
                    .addComponent(wiliam_eMoney))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wiliam_hargaLabel)
                    .addComponent(wiliam_hargaView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wiliam_checkHargaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(wiliam_simpanBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        wiliam_IDTransaksi_Label1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_IDTransaksi_Label1.setText("ID Transaksi");

        wiliam_IDTransaksi_Label2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_IDTransaksi_Label2.setText("Nama");

        wiliam_IDTransaksi_Label3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_IDTransaksi_Label3.setText("Lama Nginap");

        wiliam_IDTransaksi_Label4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_IDTransaksi_Label4.setText("Jenis Kamar");

        wiliam_IDTransaksi_Label5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_IDTransaksi_Label5.setText("Fasilitas");

        wiliam_hapusBTN.setText("Hapus");
        wiliam_hapusBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wiliam_hapusBTNActionPerformed(evt);
            }
        });

        wiliam_metodeBayarLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_metodeBayarLabel1.setText("Matode Bayar");

        wiliam_hargaLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        wiliam_hargaLabel1.setText("Harga");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(wiliam_hapusBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(wiliam_IDTransaksi_Label1)
                        .addGap(18, 18, 18)
                        .addComponent(wiliam_idTransaksiView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(wiliam_IDTransaksi_Label2)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wiliam_IDTransaksi_Label3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(wiliam_IDTransaksi_Label4))
                                .addComponent(wiliam_IDTransaksi_Label5)
                                .addComponent(wiliam_metodeBayarLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(wiliam_hargaLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wiliam_namaViews, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(wiliam_lamaNginapView, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(wiliam_jenisKamarView, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(wiliam_fasilitasView, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(wiliam_metodeBayarViews, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(wiliam_hargaViews, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(wiliam_IDTransaksi_Label1)
                                            .addComponent(wiliam_idTransaksiView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(wiliam_namaViews, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(wiliam_IDTransaksi_Label2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(wiliam_lamaNginapView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(wiliam_IDTransaksi_Label3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wiliam_jenisKamarView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(wiliam_IDTransaksi_Label4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wiliam_fasilitasView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wiliam_IDTransaksi_Label5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wiliam_metodeBayarViews, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(wiliam_metodeBayarLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wiliam_hargaViews, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wiliam_hargaLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wiliam_hapusBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wiliam_lamaInapInptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wiliam_lamaInapInptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wiliam_lamaInapInptActionPerformed

    private void wiliam_namaPelangganInptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wiliam_namaPelangganInptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wiliam_namaPelangganInptActionPerformed

    private void wiliam_saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wiliam_saldoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_wiliam_saldoActionPerformed

    private void wiliam_hapusBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wiliam_hapusBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wiliam_hapusBTNActionPerformed

    private String formatHargaToRupiah(int harga) {
        Locale indo = new Locale("id", "ID");
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(indo);

        return rupiah.format(harga).replace("Rp", "Rp ");
    }

    private int totalHarga;
    private int hargaKamar;
    private int hargaFasilitas;

    int setHargaKamar() {           
        int kamar = wiliam_jenisKamarInpt.getSelectedIndex();
        hargaKamar = 0;
        System.out.println(kamar);
        switch (kamar) {
            case 0:
                JOptionPane.showMessageDialog(this, "Pilih salah satu kamar", "Peringatan", JOptionPane.WARNING_MESSAGE);
                break;
            /*Logic Kamar End*/
            case 1:
                hargaKamar = 1000000;
                break;
            case 2:
                hargaKamar = 5700000;
                break;
            case 3:
                hargaKamar = 12000000;
                break;
            default:
                break;
        }

        /*Logic Fasilitas Start*/
        int fasilitas = wiliam_fasilitasInpt.getSelectedIndex();
        double discont = 0;
        hargaFasilitas = 0;
        switch (fasilitas) {
            case 0:
                JOptionPane.showMessageDialog(this, "Pilih salah satu fasilitas", "Peringatan", JOptionPane.WARNING_MESSAGE);
                break;
            case 1:
                hargaFasilitas = 400000;
                break;
            case 2:
                hargaFasilitas = 780000;
                break;
            case 3:
                hargaFasilitas = 300000;
                break;
            default:
                break;

        }
        totalHarga = hargaFasilitas + hargaKamar;
        
        String lamaInap;
        lamaInap = wiliam_lamaInapInpt.getText();
        
        try {
            int inap = Integer.parseInt(lamaInap);
            totalHarga *= inap;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Lama Inap harus angka", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        
        /*Logic Fasilitas End*/

        if (wiliam_eMoney.isSelected()) {
            discont = (double) totalHarga * 0.05;
            totalHarga -= discont;
        }
        
        if (totalHarga == 10000000) {
            double disc = (double) totalHarga  * 0.03;
            totalHarga -= disc;
        }
        
        
        
        return totalHarga *= Integer.parseInt(lamaInap);
    }


    private void wiliam_simpanBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wiliam_simpanBTNActionPerformed
        // TODO add your handling code here:

        wiliam_hargaView.setText(formatHargaToRupiah(setHargaKamar()));
        wiliam_idTransaksiView.setText(wiliam_idTransaksiInpt.getText());
        wiliam_namaViews.setText(wiliam_namaPelangganInpt.getText());
        wiliam_lamaNginapView.setText(wiliam_lamaInapInpt.getText() + " Hari");
        wiliam_jenisKamarView.setText((String) wiliam_jenisKamarInpt.getSelectedItem());
        wiliam_fasilitasView.setText((String) wiliam_fasilitasInpt.getSelectedItem());
        if(wiliam_saldo.isSelected()) {
            wiliam_metodeBayarViews.setText("Saldo");
        }else if(wiliam_eMoney.isSelected()) {
            wiliam_metodeBayarViews.setText("E-Money");
        }
        wiliam_hargaViews.setText(formatHargaToRupiah(setHargaKamar()));
    }//GEN-LAST:event_wiliam_simpanBTNActionPerformed

    private void wiliam_idTransaksiInptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wiliam_idTransaksiInptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wiliam_idTransaksiInptActionPerformed

    private void wiliam_hargaViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wiliam_hargaViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wiliam_hargaViewActionPerformed

    private void wiliam_checkHargaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wiliam_checkHargaBTNActionPerformed
        // TODO add your handling code here:
        wiliam_hargaView.setText(formatHargaToRupiah(setHargaKamar()));
    }//GEN-LAST:event_wiliam_checkHargaBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KasirHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel wiliam_IDTransaksi_Label;
    private javax.swing.JLabel wiliam_IDTransaksi_Label1;
    private javax.swing.JLabel wiliam_IDTransaksi_Label2;
    private javax.swing.JLabel wiliam_IDTransaksi_Label3;
    private javax.swing.JLabel wiliam_IDTransaksi_Label4;
    private javax.swing.JLabel wiliam_IDTransaksi_Label5;
    private javax.swing.JButton wiliam_checkHargaBTN;
    private javax.swing.JRadioButton wiliam_eMoney;
    private javax.swing.JComboBox<String> wiliam_fasilitasInpt;
    private javax.swing.JLabel wiliam_fasilitasLabel;
    private javax.swing.JLabel wiliam_fasilitasView;
    private javax.swing.JButton wiliam_hapusBTN;
    private javax.swing.JLabel wiliam_hargaLabel;
    private javax.swing.JLabel wiliam_hargaLabel1;
    private javax.swing.JTextField wiliam_hargaView;
    private javax.swing.JLabel wiliam_hargaViews;
    private javax.swing.JTextField wiliam_idTransaksiInpt;
    private javax.swing.JLabel wiliam_idTransaksiView;
    private javax.swing.JComboBox<String> wiliam_jenisKamarInpt;
    private javax.swing.JLabel wiliam_jenisKamarLabel;
    private javax.swing.JLabel wiliam_jenisKamarView;
    private javax.swing.JTextField wiliam_lamaInapInpt;
    private javax.swing.JLabel wiliam_lamaNginapLabel;
    private javax.swing.JLabel wiliam_lamaNginapView;
    private javax.swing.ButtonGroup wiliam_metodeBayarInpt;
    private javax.swing.JLabel wiliam_metodeBayarLabel;
    private javax.swing.JLabel wiliam_metodeBayarLabel1;
    private javax.swing.JLabel wiliam_metodeBayarViews;
    private javax.swing.JTextField wiliam_namaPelangganInpt;
    private static javax.swing.JLabel wiliam_namaPelangganLabel;
    private javax.swing.JLabel wiliam_namaViews;
    private javax.swing.JRadioButton wiliam_saldo;
    private javax.swing.JButton wiliam_simpanBTN;
    // End of variables declaration//GEN-END:variables
}
