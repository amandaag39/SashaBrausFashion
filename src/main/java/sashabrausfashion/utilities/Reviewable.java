package sashabrausfashion.utilities;
import sashabrausfashion.models.Review;

import java.util.List;

public interface Reviewable {
    void addReview(Review review);
    List<Review> getReviews();
    void removeReview(Review review);
}
