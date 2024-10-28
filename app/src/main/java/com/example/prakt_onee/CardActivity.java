package com.example.prakt_onee;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        Button detailButton1 = findViewById(R.id.detail_button_1);
        detailButton1.setOnClickListener(v -> {
            Intent intent = new Intent(CardActivity.this, DetailActivity.class);

            intent.putExtra("title", "Nike Air Force 1`07 LV8");
            intent.putExtra("price", "AED 550.00");
            intent.putExtra("imageResId", R.drawable.nike1);
            intent.putExtra("description", "Nike Jordan Heir\n" +
                    "Эти кроссовки представляют собой элегантное сочетание традиционного стиля и современных акцентов, отражающих наследие легендарной линейки Jordan. Верх выполнен из премиальных материалов, обеспечивая комфорт и долговечность, а уникальный дизайн делает их незаменимыми для поклонников баскетбольной эстетики.");

            startActivity(intent);
        });

        Button detailButton2 = findViewById(R.id.detail_button_2);
        detailButton2.setOnClickListener(v -> {
            Intent intent = new Intent(CardActivity.this, DetailActivity.class);

            intent.putExtra("title", "Nike Air Jordan 1 Retro Low");
            intent.putExtra("price", "AED 725.00");
            intent.putExtra("imageResId", R.drawable.nike2);
            intent.putExtra("description", "Nike Dunk Low Retro SE\n" +
                    "Легендарный силуэт Dunk возвращается в стильном ретро-исполнении, оставаясь верным своим корням и одновременно вписываясь в современные тенденции. Кроссовки с низким профилем и прочной конструкцией обеспечивают комфорт и поддержку на каждый день, делая их универсальным выбором для любых образов.");

            startActivity(intent);
        });

        Button detailButton3 = findViewById(R.id.detail_button_3);
        detailButton3.setOnClickListener(v -> {
            Intent intent = new Intent(CardActivity.this, DetailActivity.class);


            intent.putExtra("title", "Nike Dunk Low 1");
            intent.putExtra("price", "AED 600.00");
            intent.putExtra("imageResId", R.drawable.nike3);
            intent.putExtra("description", "Nike Dunk Low 1\n" +
                    "Классические кроссовки с непревзойденным стилем и комфортом. Простой и лаконичный дизайн позволяет сочетать эту модель с любыми нарядами, от спортивных до повседневных. Dunk Low 1 — идеальный выбор для тех, кто ценит традиции Nike и хочет добавить немного ретро в свой гардероб.");

            startActivity(intent);
        });

        Button detailButton4 = findViewById(R.id.detail_button_4);
        detailButton4.setOnClickListener(v -> {
            Intent intent = new Intent(CardActivity.this, DetailActivity.class);

            intent.putExtra("title", "Nike Dunk Low Retro SE");
            intent.putExtra("price", "AED 675.00");
            intent.putExtra("imageResId", R.drawable.nike4);
            intent.putExtra("description", "Nike Dunk Low Retro SE\n" +
                    "Легендарный силуэт Dunk возвращается в стильном ретро-исполнении, оставаясь верным своим корням и одновременно вписываясь в современные тенденции. Кроссовки с низким профилем и прочной конструкцией обеспечивают комфорт и поддержку на каждый день, делая их универсальным выбором для любых образов.");

            startActivity(intent);
        });

        Button detailButton5 = findViewById(R.id.detail_button_5);
        detailButton5.setOnClickListener(v -> {
            Intent intent = new Intent(CardActivity.this, DetailActivity.class);

            intent.putExtra("title", "Nike Jordan Heir");
            intent.putExtra("price", "AED 575.00");
            intent.putExtra("imageResId", R.drawable.nike5);
            intent.putExtra("description", "Nike Jordan Heir\n" +
                    "Эти кроссовки представляют собой элегантное сочетание традиционного стиля и современных акцентов, отражающих наследие легендарной линейки Jordan. Верх выполнен из премиальных материалов, обеспечивая комфорт и долговечность, а уникальный дизайн делает их незаменимыми для поклонников баскетбольной эстетики.");

            startActivity(intent);
        });
    }
}
