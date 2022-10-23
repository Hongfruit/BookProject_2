package com.example.bookproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*버튼 클릭 이벤트*/
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });

        RecyclerView libraryRecyclerView = findViewById(R.id.libraryRecyclerView);


        /*아직 데이터를 받아오지 않아 리스트에 입력하는 걸로 함*/
        List<Book> book = new ArrayList<>();

        Book B1 = new Book();
        B1.image = R.drawable.book1;
        B1.name = "마스터 알고리즘";
        B1.createdBy = "페드로 도밍고스";
        B1.rating = 4.5f;
        B1.startTime = "시작일 2022.06.22";
        B1.endTime = "종료일 2022.07.10";
        book.add(B1);

        Book B2 = new Book();
        B2.image = R.drawable.book2;
        B2.name = "자유론";
        B2.createdBy = "존 스튜어트 밀";
        B2.rating = 5f;
        B2.startTime = "시작일 2022.06.22";
        B2.endTime = "종료일 2022.07.10";
        book.add(B2);

        Book B3 = new Book();
        B3.image = R.drawable.book3;
        B3.name = "토스트만 단편선";
        B3.createdBy = "토스트만";
        B3.rating = 5f;
        B3.startTime = "시작일 2022.06.22";
        B3.endTime = "종료일 2022.07.10";
        book.add(B3);

        Book B4 = new Book();
        B4.image = R.drawable.book4;
        B4.name = "트렌드 코리아 2023";
        B4.createdBy = "김난도 외 9명";
        B4.rating = 4f;
        B4.startTime = "시작일 2022.06.22";
        B4.endTime = "종료일 2022.07.10";
        book.add(B4);


        /*리사이클러뷰에 어댑터 객체 지정*/
        final BookAdapter bookAdapter = new BookAdapter(book);
        libraryRecyclerView.setAdapter(bookAdapter);



    }
}