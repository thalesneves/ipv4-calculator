package com.example.thalesdasilva.calculadoraipv4;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Código criado para cálculo de IPV4.
 * @author Thales da Silva Neves
 * @since Classe criada em 21/08/2017
 */

public class Act_main extends AppCompatActivity implements View.OnClickListener {

    //Atributos
    private EditText edti1;
    private EditText edti2;
    private EditText edti3;
    private EditText edti4;
    private EditText edtmascara;

    private TextView txtIP;
    private TextView txtMask;
    private TextView txtRede;
    private TextView txtBC;
    private TextView txtFH;
    private TextView txtLH;
    private TextView txtTH;

    private TextView txtIPBin;
    private TextView txtMaskBin;
    private TextView txtRedeBin;
    private TextView txtBCBin;
    private TextView txtFHBin;
    private TextView txtLHBin;
    private TextView txtTHBin;

    private Button btnCalcular;
    private Button btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        edti1 = (EditText) findViewById(R.id.edti1);
        edti2 = (EditText) findViewById(R.id.edti2);
        edti3 = (EditText) findViewById(R.id.edti3);
        edti4 = (EditText) findViewById(R.id.edti4);
        edtmascara = (EditText) findViewById(R.id.edtmascara);

        txtIP = (TextView) findViewById(R.id.txtIP);
        txtMask = (TextView) findViewById(R.id.txtMask);
        txtRede = (TextView) findViewById(R.id.txtRede);
        txtBC = (TextView) findViewById(R.id.txtBC);
        txtFH = (TextView) findViewById(R.id.txtFH);
        txtLH = (TextView) findViewById(R.id.txtLH);
        txtTH = (TextView) findViewById(R.id.txtTH);

        txtIPBin = (TextView) findViewById(R.id.txtIPBin);
        txtMaskBin = (TextView) findViewById(R.id.txtMaskBin);
        txtRedeBin = (TextView) findViewById(R.id.txtRedeBin);
        txtBCBin = (TextView) findViewById(R.id.txtBCBin);
        txtFHBin = (TextView) findViewById(R.id.txtFHBin);
        txtLHBin = (TextView) findViewById(R.id.txtLHBin);
        txtTHBin = (TextView) findViewById(R.id.txtTHBin);

        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);

        btnCalcular.setOnClickListener(this);

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edti1.setText("");
                edti2.setText("");
                edti3.setText("");
                edti4.setText("");
                edtmascara.setText("");

                txtIP.setText("0");
                txtMask.setText("0");
                txtRede.setText("0");
                txtBC.setText("0");
                txtFH.setText("0");
                txtLH.setText("0");
                txtTH.setText("0");

                txtIPBin.setText("0");
                txtMaskBin.setText("0");
                txtRedeBin.setText("0");
                txtBCBin.setText("0");
                txtFHBin.setText("0");
                txtLHBin.setText("0");
                txtTHBin.setText("0");

                edti1.requestFocus();
            }
        });
    }

    //Método para quando o botão 'Calcular' for clicado
    public void onClick(View v) {

        String ip1 = edti1.getText().toString();
        String ip2 = edti2.getText().toString();
        String ip3 = edti3.getText().toString();
        String ip4 = edti4.getText().toString();
        String maskip = edtmascara.getText().toString();

        if (!ip1.trim().isEmpty() && !ip2.trim().isEmpty() && !ip3.trim().isEmpty() && !ip4.trim().isEmpty() && !maskip.trim().isEmpty()) {

            try {

                if (Integer.parseInt(ip1) <= 255 && Integer.parseInt(ip2) <= 255
                        && Integer.parseInt(ip3) <= 255 && Integer.parseInt(ip4) <= 255) {

                    if (Integer.parseInt(ip1) >= 0 && Integer.parseInt(ip2) >= 0
                            && Integer.parseInt(ip3) >= 0 && Integer.parseInt(ip4) >= 0) {

                        if (Integer.parseInt(maskip) <= 32) {

                            if (Integer.parseInt(maskip) >= 1) {

                                int mascara = Integer.valueOf(maskip);

                                switch (mascara) {
                                    case 1: {
                                        String novo = "128.0.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 2: {
                                        String novo = "192.0.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 3: {
                                        String novo = "224.0.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 4: {
                                        String novo = "240.0.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 5: {
                                        String novo = "248.0.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 6: {
                                        String novo = "252.0.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 7: {
                                        String novo = "254.0.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 8: {
                                        String novo = "255.0.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 9: {
                                        String novo = "255.128.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 10: {
                                        String novo = "255.192.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 11: {
                                        String novo = "255.224.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 12: {
                                        String novo = "255.240.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 13: {
                                        String novo = "255.248.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 14: {
                                        String novo = "255.252.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 15: {
                                        String novo = "255.254.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 16: {
                                        String novo = "255.255.0.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 17: {
                                        String novo = "255.255.128.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 18: {
                                        String novo = "255.255.192.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 19: {
                                        String novo = "255.255.224.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 20: {
                                        String novo = "255.255.240.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 21: {
                                        String novo = "255.255.248.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 22: {
                                        String novo = "255.255.252.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 23: {
                                        String novo = "255.255.254.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 24: {
                                        String novo = "255.255.255.0";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 25: {
                                        String novo = "255.255.255.128";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 26: {
                                        String novo = "255.255.255.192";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 27: {
                                        String novo = "255.255.255.224";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 28: {
                                        String novo = "255.255.255.240";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 29: {
                                        String novo = "255.255.255.248";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 30: {
                                        String novo = "255.255.255.252";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 31: {
                                        String novo = "255.255.255.254";
                                        calculoIPV4(novo);
                                        break;
                                    }
                                    case 32:
                                        calculoIPV4("255.255.255.255");
                                        break;
                                    default:
                                        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                                        dlg.setMessage("Máscara Inválida");
                                        dlg.setNeutralButton("Ok", null);
                                        dlg.show();
                                        break;
                                }

                            } else {
                                AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                                dlg.setMessage("\"O valor da máscara não poderá ser negativo!\"\n" +
                                        "\nValor da Máscara: de 1 à 32");
                                dlg.setNeutralButton("Ok", null);
                                dlg.show();
                            }

                        } else {
                            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                            dlg.setMessage("O valor da máscara não poderá superar o valor de 32 !"
                                    + "\nValor da Máscara: de 1 à 32");
                            dlg.setNeutralButton("Ok", null);
                            dlg.show();
                        }

                    } else {
                        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                        dlg.setMessage("Os valores dos IP's não poderá ser negativo!");
                        dlg.setNeutralButton("Ok", null);
                        dlg.show();
                    }

                } else {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                    dlg.setMessage("Os valores dos IP's não poderam superar o valor de 255 ! ");
                    dlg.setNeutralButton("Ok", null);
                    dlg.show();
                }

            } catch (NumberFormatException e) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                dlg.setMessage("Somente números inteiros");
                dlg.setNeutralButton("Ok", null);
                dlg.show();
            }

        } else {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Há Dados em Branco, por favor preencha-os!");
            dlg.setNeutralButton("Ok", null);
            dlg.show();
        }

    }//fim do método

    private void calculoIPV4(String maskIP) {

        // Gerando IP em Binários
        String ipBin1 = Integer.toBinaryString(Integer.parseInt(String.valueOf(edti1.getText())));
        String ipBin2 = Integer.toBinaryString(Integer.parseInt(String.valueOf(edti2.getText())));
        String ipBin3 = Integer.toBinaryString(Integer.parseInt(String.valueOf(edti3.getText())));
        String ipBin4 = Integer.toBinaryString(Integer.parseInt(String.valueOf(edti4.getText())));

        // Formatando os Ips
        String ipB1 = String.format("%08d", Integer.parseInt(ipBin1));
        String ipB2 = String.format("%08d", Integer.parseInt(ipBin2));
        String ipB3 = String.format("%08d", Integer.parseInt(ipBin3));
        String ipB4 = String.format("%08d", Integer.parseInt(ipBin4));

        String ipTotal = ipB1 + ipB2 + ipB3 + ipB4;
        String ipTotal2 = edti1.getText() + "." + edti2.getText() + "." + edti3.getText() + "." + edti4.getText();

        System.out.println("=======================================================================");

        System.out.println("IP Decimal: " + ipTotal2);
        System.out.println("IP Binário: " + ipB1 + "." + ipB2 + "." + ipB3 + "." + ipB4);
        System.out.println("IP Binário Formatado Total: " + ipTotal);

        txtIPBin.setText(ipB1 + "." + ipB2 + "." + ipB3 + "." + ipB4);

        System.out.println("=======================================================================");

        String ipTot = edti1.getText() + "." + edti2.getText() + "." + edti3.getText() + "." + edti4.getText();
        txtIP.setText(ipTot);

        // Gerando a máscara em Decimal
        String mascTxt = maskIP;
        String[] mascDec = mascTxt.split("\\.");
        String masc1 = mascDec[0];
        String masc2 = mascDec[1];
        String masc3 = mascDec[2];
        String masc4 = mascDec[3];
        System.out.println("Máscara Decimal: " + masc1 + "." + masc2 + "." + masc3 + "." + masc4);
        txtMask.setText(mascTxt);

        // Gerando a máscara em binário
        String mascBin1 = Integer.toBinaryString(Integer.parseInt(masc1));
        String mascBin2 = Integer.toBinaryString(Integer.parseInt(masc2));
        String mascBin3 = Integer.toBinaryString(Integer.parseInt(masc3));
        String mascBin4 = Integer.toBinaryString(Integer.parseInt(masc4));

        // Formatando a máscara
        String mascB1 = String.format("%08d", Integer.parseInt(mascBin1));
        String mascB2 = String.format("%08d", Integer.parseInt(mascBin2));
        String mascB3 = String.format("%08d", Integer.parseInt(mascBin3));
        String mascB4 = String.format("%08d", Integer.parseInt(mascBin4));

        String mascBinTotal = mascB1 + mascB2 + mascB3 + mascB4;
        System.out.println("Máscara Binário: " + mascB1 + "." + mascB2 + "." + mascB3 + "." + mascB4);
        System.out.println("Máscara Binário Formatado Total: " + mascBinTotal);

        txtMaskBin.setText(mascB1 + "." + mascB2 + "." + mascB3 + "." + mascB4);

        // Gerando a máscara inversa
        String vetMascInvertida = "";

        for (int i = 0; i < 32; i++) {

            String bitMasc = String.valueOf(mascBinTotal.charAt(i) == '0' ? "0" : "1");

            if ("1".equals(bitMasc)) {
                vetMascInvertida += "0";
            } else {
                vetMascInvertida += "1";
            }

        }

        System.out.println("Máscara Invertida: " + vetMascInvertida);

        StringBuilder sB = new StringBuilder();
        sB.append(vetMascInvertida);
        sB.insert(8, ".");
        sB.insert(17, ".");
        sB.insert(26, ".");

        System.out.println("Máscara Invertida Formatado: " + sB);

        System.out.println("=======================================================================");

        // Gerando a rede em binário
        String vetNet = "";

        for (int i = 0; i < 32; i++) {

            String bitIP = String.valueOf(ipTotal.charAt(i) == '0' ? "0" : "1");
            String bitMasc = String.valueOf(mascBinTotal.charAt(i) == '0' ? "0" : "1");

            if ("1".equals(bitIP) && "1".equals(bitMasc)) {
                vetNet += "1";
            } else {
                vetNet += "0";
            }

        }

        System.out.println("Rede em Binário: " + vetNet);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(vetNet);
        stringBuilder.insert(8, ".");
        stringBuilder.insert(17, ".");
        stringBuilder.insert(26, ".");

        System.out.println("Rede em Binário Formatado: " + stringBuilder);

        StringBuilder sBFHost = new StringBuilder();
        sBFHost.append(vetNet);
        sBFHost.insert(8, ".");
        sBFHost.insert(17, ".");
        sBFHost.insert(26, ".");
        sBFHost.replace(34, 35, "1");

        txtFHBin.setText(String.valueOf(sBFHost));

        txtRedeBin.setText(String.valueOf(stringBuilder));

        String sBTxt = stringBuilder.toString();
        String[] sBDec = sBTxt.split("\\.");

        System.out.println("Rede em Decimal: " + Integer.parseInt(sBDec[0], 2) + "." + Integer.parseInt(sBDec[1], 2)
                + "." + Integer.parseInt(sBDec[2], 2) + "." + Integer.parseInt(sBDec[3], 2));

        txtRede.setText(Integer.parseInt(sBDec[0], 2) + "." + Integer.parseInt(sBDec[1], 2)
                + "." + Integer.parseInt(sBDec[2], 2) + "." + Integer.parseInt(sBDec[3], 2));

        System.out.println("=======================================================================");

        // Gerando o broadcast em binário
        String vetBC = "";

        for (int i = 0; i < 32; i++) {

            String bitIP = String.valueOf(ipTotal.charAt(i) == '0' ? "0" : "1");
            String bitMasc = String.valueOf(vetMascInvertida.charAt(i) == '0' ? "0" : "1");

            if (("1".equals(bitIP) && "0".equals(bitMasc)) || ("0".equals(bitIP) && "1".equals(bitMasc))
                    || ("1".equals(bitIP) && "1".equals(bitMasc))) {
                vetBC += "1";
            } else {
                vetBC += "0";
            }

        }

        System.out.println("Broadcast em Binário: " + vetBC);

        StringBuilder sBC = new StringBuilder();
        sBC.append(vetBC);
        sBC.insert(8, ".");
        sBC.insert(17, ".");
        sBC.insert(26, ".");

        System.out.println("Broadcast em Binário Formatado: " + sBC);
        txtBCBin.setText(String.valueOf(sBC));

        String sBCTxt = sBC.toString();
        String[] sBCDec = sBCTxt.split("\\.");

        System.out.println(
                "Broadcast em Decimal: " + Integer.parseInt(sBCDec[0], 2) + "." + Integer.parseInt(sBCDec[1], 2) + "."
                        + Integer.parseInt(sBCDec[2], 2) + "." + Integer.parseInt(sBCDec[3], 2));

        txtBC.setText(Integer.parseInt(sBCDec[0], 2) + "." + Integer.parseInt(sBCDec[1], 2) + "."
                + Integer.parseInt(sBCDec[2], 2) + "." + Integer.parseInt(sBCDec[3], 2));

        System.out.println("=======================================================================");

        System.out.println("Primeiro Endereço de Host: " + String.valueOf(Integer.parseInt(sBDec[0], 2) + "."
                + String.valueOf(Integer.parseInt(sBDec[1], 2)) + "." + String.valueOf(Integer.parseInt(sBDec[2], 2))
                + "." + String.valueOf(Integer.parseInt(sBDec[3], 2) + 1)));

        txtFH.setText(String.valueOf(Integer.parseInt(sBDec[0], 2) + "."
                + String.valueOf(Integer.parseInt(sBDec[1], 2)) + "." + String.valueOf(Integer.parseInt(sBDec[2], 2))
                + "." + String.valueOf(Integer.parseInt(sBDec[3], 2) + 1)));

        System.out.println("Último Endereço de Host: " + String.valueOf(Integer.parseInt(sBCDec[0], 2) + "."
                + String.valueOf(Integer.parseInt(sBCDec[1], 2)) + "." + String.valueOf(Integer.parseInt(sBCDec[2], 2))
                + "." + String.valueOf(Integer.parseInt(sBCDec[3], 2))));

        StringBuilder sBLHost = new StringBuilder();
        sBLHost.append(vetBC);
        sBLHost.insert(8, ".");
        sBLHost.insert(17, ".");
        sBLHost.insert(26, ".");
        sBLHost.replace(34, 35, "0");

        txtLHBin.setText(String.valueOf(sBLHost));

        txtLH.setText(String.valueOf(Integer.parseInt(sBCDec[0], 2) + "."
                + String.valueOf(Integer.parseInt(sBCDec[1], 2)) + "." + String.valueOf(Integer.parseInt(sBCDec[2], 2))
                + "." + String.valueOf(Integer.parseInt(sBCDec[3], 2) - 1)));

        //Cálculando total host
        int count = 0;

        for (int i = 0; i < 32; i++) {

            String bitMasc = String.valueOf(vetMascInvertida.charAt(i) == '0' ? "0" : "1");

            if ("1".equals(bitMasc)) {
                count++;
            }

        }

        int calcTotHost = (int) Math.pow(2, count) - 2;

        System.out.println("Total Host (nº de IP's possíveis): " + calcTotHost);

        txtTH.setText(String.valueOf(calcTotHost));

        String tot = String.valueOf(calcTotHost);

        String binTotHost;
        binTotHost = Integer.toBinaryString(Integer.parseInt(tot));

        txtTHBin.setText(binTotHost);

        System.out.println("=======================================================================");

    }

}//fim da classe
