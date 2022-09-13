package com.sujithtech.bookstore.controller;

import com.sujithtech.bookstore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class BookController {

    @GetMapping("books")
    public ResponseEntity<List<BookDto>> getBooks(){
       BookDto bookDto = BookDto.builder()
               .title("My first book title")
               .build();
       List<BookDto> books = new ArrayList<>();
       books.add(bookDto);
       return ResponseEntity.ok(books);
    }
}
