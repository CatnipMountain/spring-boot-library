package com.luv2code.springbootlibrary.dao;

import com.luv2code.springbootlibrary.entity.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    // Find Review by book ID
    Page<Review> findByBookId(@RequestParam("book_id") Long bookId, Pageable pageable);

    // Find Review by user email and book ID
    Review findByUserEmailAndBookId(String userEmail, Long bookId);

    @Modifying
    @Query("delete from Review where book_id in :book_id")
    void deleteAllByBookId(@Param("book_id") Long bookId);
}
