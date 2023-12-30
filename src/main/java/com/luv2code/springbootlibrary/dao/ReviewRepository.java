package com.luv2code.springbootlibrary.dao;

import com.luv2code.springbootlibrary.entity.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    // Find Review by book ID
    Page<Review> findBookById(@RequestParam("book_id") Long bookId, Pageable pageable);

    // Find Review by user email and book ID
    Review findByUserEmailAndBookId(String userEmail, Long bookId);

}
