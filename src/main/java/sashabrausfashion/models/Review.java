package main.java.sashabrausfashion.models;


import main.java.sashabrausfashion.utilities.Reviewable;

import java.sql.SQLException;
import java.util.List;

public class Review implements Reviewable {
    private String reviewerName;
    private int rating;
    private String comment;

    public Review(String reviewerName, int rating, String comment) {
        this.reviewerName = reviewerName;
        this.rating = rating;
        this.comment = comment;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName (String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public void addReview(Review review) {
        // add review logic here
    }

    public void addReviewToDatabase() {
        try{
            //Code to add review to database
            throw new SQLException();
        } catch (SQLException e) {
            System.out.println("Database error occurred: " + e.getMessage());
            //handle the exception here
        }
    }

    @Override
    public List<Review> getReviews() {
        // get reviews logic here
        return null;
    }

    @Override
    public void removeReview(Review review) {
        // remove review logic here
    }

}
