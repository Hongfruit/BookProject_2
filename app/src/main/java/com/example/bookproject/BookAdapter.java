package com.example.bookproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;
import java.util.List;

class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    private List<Book> book;

    /*생성자에서 데이터 리스트 객체를 전달받음*/
    public BookAdapter(List<Book> book){
        this.book = book;
}


    /*아이템 뷰를 위한 뷰 홀더 객체를 생성하여 리턴*/
    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_container_library,
                        parent,
                        false
                )
        );
    }

    /*포지션에 해당하는 데이터를 뷰홀더의 아이템뷰의 표시함*/
    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        holder.bindBook(book.get(position));
    }

    /*전체 데이터 개수 리턴턴*/
   @Override
    public int getItemCount() {
        return book.size();
    }


    /*아이템 뷰를 저장하는 뷰홀더 클래스*/
    class BookViewHolder extends RecyclerView.ViewHolder{
        /*라이브러리 콘테이너 아이디 가져옴*/
        ConstraintLayout layoutBook;
        View viewBackground;
        RoundedImageView imageBook;
        TextView textName, textCreatedBy, startTime,endTime;
        RatingBar ratingBar;
        ImageView imageSelected;

        BookViewHolder(@NonNull View itemView) {
            super(itemView);
            /*콘테이너 아이디 할당*/
            layoutBook = itemView.findViewById(R.id.layoutBook);
            viewBackground = itemView.findViewById(R.id.viewBackground);
            imageBook = itemView.findViewById(R.id.ImageBook);
            textName = itemView.findViewById(R.id.textName);
            textCreatedBy = itemView.findViewById(R.id.textCreatedBy);
            startTime = itemView.findViewById(R.id.startTime);
            endTime = itemView.findViewById(R.id.endTime);
            ratingBar = itemView.findViewById(R.id.ratingBar);
        }
        void bindBook(final Book book){
            imageBook.setImageResource(book.image);
            textName.setText(book.name);
            textCreatedBy.setText(book.createdBy);
            startTime.setText(book.startTime);
            endTime.setText(book.endTime);
            ratingBar.setRating(book.rating);
        }

    }
}
