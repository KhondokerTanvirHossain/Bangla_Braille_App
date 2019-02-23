package com.example.agent_47.brail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] array = {"000010000000", "000101000000", "000001000000","", "100000000000","010110000000",  // ঁ ং ঃ অ আ
                            "011000000000", "000110000000", "100011000000", "101101000000","000100101110", "", "", "", //ই ঈ উ ঊ ঋ
                            "100100000000", "010010000000", "", "", "100110000000", "011001000000",  // এ ঐ ও ঔ               ্
                            //ৎ
                            "100010000000",  // ক
                            "110011000000", "111100000000", "101001000000", "010011000000", "110000000000", //খ গ ঘ ঙ চ
                            "100001000000", "011100000000", "100111000000", "001100000000", "011111000000", // ছ জ ঝ ঞ  ট
                            "011101000000", "111001000000", "111111000000", "010111000000", "011110000000", // ঠ ড ঢ ণ ত
                            "110101000000", "110100000000", "011011000000", "110110000000","", "111010000000", // থ দ ধ ন প
                            "001110000000", "101000000000", "101011000000", "110010000000", "110111000000", // ফ ব ভ ম য
                            "101110000000","", "101010000000", "", "", "", "110001000000", "111011000000", "011010000000", // র ল শ ষ স
                            "101100000000","", "", "", "", "010110000000", "011000000000","000110000000",// হ     া ি ী
                            "100011000000", "101101000000", "000100101110","","","", "100100000000","","010010000000", // ু ূ ৃ ে ৈ
                            "", "", "100110000000", "011001000000", "", "", "", "", "", "", "", "", "", "", "", // ো ৌ
                            "", "", "", "111101000000", "101111000000", "","001001000000","","","","","","",//ড় ঢ় য়
                            "010111011100", "010111100000", "010111101000", "010111110000", "010111110100", //  ০ ১ ২ ৩ ৪
                            "010111100100", "010111111000", "010111111100", "010111101100", "010111011000"}; // ৫ ৬ ৭ ৮ ৯
    String[] punc = {"001000000000", "001010000000", "001100000000","001011000000", "001110000000", "000011000000", "000011000011"};
    Button btplus;
    Button btminus;
    TextView tvrime;
    Button btsend;
    EditText etget;
    ImageView[] img;
    int time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btplus = findViewById(R.id.btplus);
        btminus = findViewById(R.id.btminus);
        btsend = findViewById(R.id.btsend);
        tvrime = findViewById(R.id.tv3);
        etget = findViewById(R.id.et1);
        img = new ImageView[12];
        img[0] = findViewById(R.id.img1);
        img[1] = findViewById(R.id.img2);
        img[2] = findViewById(R.id.img3);
        img[3] = findViewById(R.id.img4);
        img[4] = findViewById(R.id.img5);
        img[5] = findViewById(R.id.img6);
        img[6] = findViewById(R.id.img7);
        img[7] = findViewById(R.id.img8);
        img[8] = findViewById(R.id.img9);
        img[9] = findViewById(R.id.img10);
        img[10] = findViewById(R.id.img11);
        img[11] = findViewById(R.id.img12);
        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time = Integer.parseInt(tvrime.getText().toString());
                time++;
                tvrime.setText(""+time);
            }
        });
        btminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time = Integer.parseInt(tvrime.getText().toString());
                time--;
                tvrime.setText(""+time);
            }
        });
        btsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = etget.getText().toString();
                int n = str.charAt(0) - 'ঁ';
                String s = null;
                if (n < 0){
                    if (str.charAt(0) == ',')
                        s = punc[0];
                    else if (str.charAt(0) == ';')
                        s = punc[1];
                    else if (str.charAt(0) == ':')
                        s = punc[2];
                    else if (str.charAt(0) == '?')
                        s = punc[3];
                    else if (str.charAt(0) == '!')
                        s = punc[4];
                    else if (str.charAt(0) == '.')
                        s = punc[5];
                    else if (str.charAt(0) == '-')
                        s = punc[6];
                }else {
                    s = array[n];
                }
                for (int i = 0; i < 12; i++) {
                    if (s.charAt(i) == '1')
                        img[i].setImageResource(R.drawable.circle);
                    else
                        img[i].setImageResource(R.drawable.border3);
                }

            }
        });

    }
}
